import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ZhenpengLu on 2018/4/24.
 */
public class ThreadTermAndShutDownTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 9; i++) {
            final int a = i ;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("当前线程"+Thread.currentThread().getName()+"----a----"+a);
                }
            });
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){
//            System.out.println("task尚未执行完毕。。。。");
        }
        System.out.println("all tasks execution completely");

    }


}
