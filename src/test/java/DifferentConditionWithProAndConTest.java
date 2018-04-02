import com.quark.lock.PartSignalConsumerThread;
import com.quark.lock.PartSignalProviderThread;
import com.quark.lock.ProviderAndConsumer;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 测试同一个锁下 不同的condition的 消费-生产模式
 */
public class DifferentConditionWithProAndConTest {

    public static void main(String[] args) throws InterruptedException {
        ProviderAndConsumer providerAndConsumer = new ProviderAndConsumer();
        PartSignalProviderThread partSignalProviderThread = new PartSignalProviderThread(providerAndConsumer);
        PartSignalConsumerThread partSignalConsumerThread = new PartSignalConsumerThread(providerAndConsumer);
        Thread threadA_1 = new Thread(partSignalProviderThread);
        Thread threadA_2 = new Thread(partSignalProviderThread);
        Thread threadB_1 = new Thread(partSignalConsumerThread);
        Thread threadB_2 = new Thread(partSignalConsumerThread);
        threadA_1.start();
        threadA_2.start();
        threadB_1.start();
        threadB_2.start();
    }
}
