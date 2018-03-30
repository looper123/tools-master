import com.quark.thread.ConsumerThread;
import com.quark.thread.MyConsumer;
import com.quark.thread.MyProvider;
import com.quark.thread.ProviderThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/29.
 * 等待唤醒 多生产者 多消费者 测试
 */
public class SynProviderAndConsumer {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        List<String> pList = new ArrayList<>();
        ProviderThread providerThread = new ProviderThread(new MyProvider(), pList,reentrantLock);
        ConsumerThread consumerThread = new ConsumerThread(new MyConsumer(), pList,reentrantLock);
//        开启两个消费者 两个生产者线程
//        所有消费者 生产者都用相同的锁
        Thread thread_provider1 = new Thread(providerThread);
        Thread thread_provider2 = new Thread(providerThread);
        Thread thread_consumer1 = new Thread(consumerThread);
        Thread thread_consumer2 = new Thread(consumerThread);
        thread_provider1.start();
        thread_provider2.start();
        thread_consumer1.start();
        thread_consumer2.start();
        thread_provider1.join();
        System.out.println("thread_provider1 运行结束");
    }
}
