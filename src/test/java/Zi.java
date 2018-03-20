/**
 * Created by 311198 on 2017/3/8.
 */
public class Zi extends Fu {

    static int a = 20000;//静态成员

    int  b = 20;//普通成员

    @Override
    public void commonMethod(){
        System.out.println("子类普通方法");
    }


    static {
        System.out.println("子类的静态代码块");
    }

    {
        System.out.println("子类的构造代码块");
    }

    public static void staMethod(){
        System.out.println("子类静态方法");
    }

    public Zi() {
        System.out.println("子类的无参构造");
    }


}
