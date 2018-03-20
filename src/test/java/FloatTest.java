import org.junit.Test;

/**
 * Created by 311198 on 2017/3/17.
 */
public class FloatTest {

    @Test
    public void test1(){
        float a= 3.4f;
        Float b= 3.4f;
        float f=4.2F;
        Float g=new Float(4.2F);
        Double d=new Double(4.2);
        System.out.println(a==b);
        System.out.println(f==g);
        System.out.println(g==g);
        System.out.println(d==f);
        System.out.println(d.equals(f));
        System.out.println(d.equals(g));
        System.out.println(g.equals(4.2));
    }
}
