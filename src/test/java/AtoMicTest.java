import com.quark.thread.AtoMicThread;

/**
 * Created by ZhenpengLu on 2018/3/29.
 * jdk原子类同步测试
 */
public class AtoMicTest {

    public  static  void  main(String args[]){
        AtoMicThread atomicThread = new AtoMicThread();
        Thread thread1 = new Thread(atomicThread);
        Thread thread2 = new Thread(atomicThread);
        thread1.start();
        thread2.start();
    }
}
