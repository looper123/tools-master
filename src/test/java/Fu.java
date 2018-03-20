/**
 * Created by 311198 on 2017/3/8.
 */
public class Fu {

    static int a = 1000; //静态成员

    int b = 10;//普通成员

    static {
        System.out.println("父类的静态代码块");
    }

    {
        System.out.println("父类的构造代码块");
    }

    public void inVokeCommonMethod(){
        commonMethod();
    }


    public void commonMethod(){
        System.out.println("父类普通方法");
    }



    public static void staMethod(){
        System.out.println("父类静态方法");
    }

    public Fu() {
        System.out.println("父类的无参构造");
    }
}
