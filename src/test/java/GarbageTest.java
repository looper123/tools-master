import org.junit.Test;

/**
 * Created by 311198 on 2017/3/17.
 */
public class GarbageTest {

    @Test
    public void test() {
        Object o = new Float(3.14F);
        Object[] oa = new Object[1];
        oa[0] = o;
//        o = null;
//        oa[0] = null;
          o=9f;
        System.out.println(oa[0]);
    }


}
