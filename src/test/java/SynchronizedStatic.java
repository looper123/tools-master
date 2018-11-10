/**
 * 测试静态方法中同步代码块的锁
 * 结论：可以是任意的静态变量 也可以是常量
 */
public class SynchronizedStatic {

    private static int  a = 10;

    private static String  staticLock= "10";

    public  static void  minus(String  param){
        synchronized (param){
            while(a > 0){
                a--;
                System.out.println("a======"+a);
            }
        }

    }
}
