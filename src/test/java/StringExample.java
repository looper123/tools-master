/**
 * Created by 311198 on 2017/3/16.
 */
public class StringExample {

    String str = "good"; //这里的Str是一个字符串常量 ，调用方法后它的地址改变了（相当于一个新对象），main方法中获取的还是原来的对象（地址）
//    StringBuffer str = new StringBuffer("good");// 这里的str是一个字符串变量，它调用方法后使用的还是原来的地址（使用原来的对象），main中获取的也是原来的地址
    char[] ch = { 'a', 'b', 'c' };

    public static void main(String args[]) {

        StringExample ex = new StringExample();

        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");

        System.out.print(ex.ch);

    }

    public void change(String str, char ch[]) {

        str.replace(str,"test ok");
//        str.replace(0,4,"test ok");

        ch[0] = 'g';

    }
}
