import com.quark.thread.ThreadMethod;

/**
 * Created by 311198 on 2017/2/27.
 */
public class ThreadsTest {

    private static int state = 1;

    private static int num = 0;

    private static Object lock = new Object();

//    方法一    匿名内部类
//    public static void main(String[] args) {
////        final ThreadsTest t = new ThreadsTest();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (num< 100) {
//                    //两个线程都用t对象作为锁，保证每个交替期间只有一个线程在打印
//                    synchronized (lock) {
//                        // 如果state!=1, 说明此时尚未轮到线程1打印, 线程1将调用t的wait()方法, 直到下次被唤醒
//                        if (state != 1) {
//                            try {
//                                lock.wait();
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                        // 当state=1时, 轮到线程1打印5次数字
//                        for (int j = 0; j < 1; j++) {
//                            System.out.println(Thread.currentThread().getName() + "------------" + num);
//                            num++;
//                        }
//                        // 线程1打印完成后, 将state赋值为2, 表示接下来将轮到线程2打印
//                        state = 2;
//                        // notifyAll()方法唤醒在t上wait的线程2, 同时线程1将退出同步代码块, 释放t锁
//                        lock.notifyAll();
//                    }
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (num < 100) {
//                    synchronized (lock) {
//                        if (state != 2) {
//                            try {
//                                lock.wait();
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                        for (int j = 0; j < 1; j++) {
//                            System.out.println(Thread.currentThread().getName() + "------------" + num);
//                            num++;
//                        }
//                        state = 1;
//                        lock.notifyAll();
//                    }
//                }
//            }
//        }).start();
//    }

//    方法二
//    junit不支持多线的测试  原因：当主线程结束，junit默认正常退出 调用system.exit 不在执行 ，其他线程无法执行
      public static void main(String[] args) {
        ThreadMethod threadMethod = new ThreadMethod();
        Thread t1 = new Thread(threadMethod);
        Thread t2 = new Thread(threadMethod);
        t1.start();
        t2.start();
    }

}

