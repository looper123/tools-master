import org.junit.Test;

/**
 * Created by 311198 on 2017/3/14.
 */
public class StringTest {

    int arr[] = new int[10];
    @Test
    public void test1(){
        String a="abc";
        String b="abc";
        String c=new String("abc");
        String d="ab"+"c";
//        ==是比较内存地址
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(b==c);
        System.out.println(b==d);
        System.out.println(c==d);
//         string 复写了equals方法
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
        System.out.println(c.equals(d));
    }

//   a是一个字符串变量，调用replace方法后地址改变了
//   b是一个字符串常量，调用append方法后还是使用的原来的地址
    @Test
    public void test2(){
        String a = new String("java");
        System.out.println("a-----"+a.hashCode());
        StringBuffer b = new StringBuffer("java");
        System.out.println("b-----"+b.hashCode());
        append(b);
        replace(a);
        System.out.println(a+b);
    }

    public void replace(String str){
        String a1 = str.replace("j", "1");
        System.out.println("a1-----"+a1.hashCode());
    }

    public void append(StringBuffer str){
        StringBuffer b1 = str.append("c");
        System.out.println("b1-----"+b1.hashCode());
    }


}
