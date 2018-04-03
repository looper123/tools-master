import com.quark.thread.LazySingletonModelThread;

/**
 * Created by ZhenpengLu on 2018/4/2.
 * 单例懒汉 多线程 安全&效率
 */
public class LazyModelWithThreadsTest {

    public static void main(String[] args) {
        LazySingletonModelThread lazySingletonModelThread = new LazySingletonModelThread();
        Thread thread1 = new Thread(lazySingletonModelThread);
        Thread thread2 = new Thread(lazySingletonModelThread);
        Thread thread3 = new Thread(lazySingletonModelThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
