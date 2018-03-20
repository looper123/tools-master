import org.junit.Test;

/**
 * Created by 311198 on 2017/3/13.
 */
public class EqualsTest {
        /**
         * 直接赋值的时候 如：String a="abc"  会先从常量池中寻找，如果存在 会返回它的引用
         * new String("abc")  则不会从常量池中寻找，而是直接创建新对象
         */
        public static void main(String[] args) {
            // Integer的equals是比较值是否相同,而不是地址（复写过eqauls方法）
            Integer obj01 = new Integer(10);
            Integer obj02 = new Integer(20);
            Integer obj03 = new Integer(10);
//            new Integer(125) 和Integer a = 1不同，前者会创建对象，
//            存储在堆中，而后者因为在-128到127的范围内，
//            不会创建新的对象，而是从IntegerCache中获取的。
//            那么Integer a = 128,
//            大于该范围的话才会直接通过new Integer（128）创建对象，进行装箱。
            Integer obj05 = new Integer(125);
            Integer obj06 = new Integer(125);
            Integer obj07 = 125;
            Integer obj08 = 125;
            Integer obj04 = obj02;
            System.out.println(obj01.equals(obj03)+"  ---->  obj01.equels(obj03)  ?");
            System.out.println((obj01 == obj03) + " ------->  obj01 == obj03 ?");
            System.out.println("----------------------------");
            System.out.println(obj02.equals(obj04) + " ------>  obj02.equels(obj04)  ?");
            System.out.println((obj02 == obj04 ) + " ----->  obj02 == obj04  ?");
            System.out.println((obj05 == obj06 ) + " ----->  obj05 == obj06  ?");
            System.out.println((obj07 == obj08 ) + " ----->  obj07 == obj08  ?");
        }

    @Test
    public void test1(){
        String a = "hello0000000000000000000000000";
        String b = "hello0000000000000000000000000";
        String c = new String("hello");
        String d = new String("hello");
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(c.equals(d));
        System.out.println(c==d);

    }



}
