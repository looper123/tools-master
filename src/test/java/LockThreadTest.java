import com.quark.lock.LockThread;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class LockThreadTest {

    public static void main(String[] args) {
        LockThread lockThread = new LockThread();
        Thread thread = new Thread(lockThread);
        Thread thread2 = new Thread(lockThread);
        thread.start();
        thread2.start();
    }
}
