/**
 * Created by 311198 on 2017/3/16.
 * <p/>
 * （1）类加载之后，按从上到下（从父类到子类）执行被static修饰的语句；
 * （2）当static语句执行完之后,再执行main方法；
 * （3）在main方法中 如果有语句new了自身的对象，将从上到下执行构造代码块、构造器（两者可以说绑定在一起）。
 * 父类的静态代码块
 * 子类的静态代码块
 * 父类的构造代码块
 * 父类的无参构造
 * 子类的构造代码块
 * 子类的无参构造
 * 子类静态方法
 * a的值是20000
 * 子类普通方法
 * b的值是10
 */
public class FuAndZi {

    static {
        System.out.println("测试类的静态代码块");
    }

    public static void main(String args[]) {
        System.out.println("测试类的main方法");
        Fu fu = new Zi();
        //多态中 调用了父类独有的方法  父类的方法又调用了自己类中被子类重写过的方法 格式类似于 ：
        //Fu fu =new Zi() ; fu.invokeMethod().commandMethod();
        //其中 invokeMethod（）为父类独有的方法； commandMethod（）为 父类被子类重写过的方法
        // 结果 最后执行了子类commandMethod()方法！！ 其根本还是多态
        //结论 ：在多态中  只要是子父类共同存在的方法 一定是用子类的 不管中间隔了多少个其他调用
        fu.inVokeCommonMethod();

        System.out.println("--------------------");
        //Fu fu = new Fu();
        //Zi fu = new Zi();
        //子、父类中有相同的静态方法、静态成员变量时，优先执行自己的
        Zi.staMethod();
        System.out.println("a的值是" + Zi.a);
        //多态中  子父类中存在相同的普通成员函数时，优先执行子类的（重写）
        //如果不是多态还是执行自己的函数
        fu.commonMethod();
        //多态中  子父类中存在相同的普通成员变量时，优先获取父类的（继承）
        //如果不是多态还是获取自己的成员变量
        System.out.println("b的值是" + fu.b);
    }
}
