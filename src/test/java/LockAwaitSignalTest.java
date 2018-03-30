import com.quark.lock.LockAwaitAndSignal;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class LockAwaitSignalTest {


    public static void main(String[] args) {
        LockAwaitAndSignal lockAwaitAndSignal = new LockAwaitAndSignal();
        Thread thread1 = new Thread(lockAwaitAndSignal);
        thread1.setName("Thread_1");
        Thread thread2 = new Thread(lockAwaitAndSignal);
        thread2.setName("Thread_2");
        Thread thread3 = new Thread(lockAwaitAndSignal);
        thread3.setName("Thread_3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
