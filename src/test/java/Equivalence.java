import org.junit.Test;

/**
 * Created by 311198 on 2017/2/23.
 */
public class Equivalence {

    @Test
    public void test1(){

        Integer integer = new Integer(47);
        Integer integer2 = new Integer(47);
        System.out.println(integer);
        System.out.println(integer2);
        System.out.println(integer.equals(integer2));
        System.out.println(integer==integer2);
        Value value = new Value();
        Value value2 = new Value();
        value.i=value2.i=10;
        System.out.println(value.equals(value2));
    }
}
