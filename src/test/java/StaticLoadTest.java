/**
 * Created by ZhenpengLu on 2018/4/2.
 * 静态块 静态变量 & 静态内部类加载
 */
public class StaticLoadTest {

    static  {
        System.out.println("外部静态代码块");
    }

    static String  outVariable = "外部静态变量";

    //静态内部类
    static  class  InnerStatic{
        static  {
            System.out.println("内部静态代码块加载");
        }

        static String  innerVariable = "外部静态变量";
    }

    public static void main(String[] args) {
        StaticLoadTest staticLoadTest = new StaticLoadTest();
        System.out.println("外部类初始化完成-----------");
        System.out.println("内部类"+InnerStatic.innerVariable);
    }
}
