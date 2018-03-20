import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 311198 on 2017/3/18.
 */
public class ArrayTest {

    static int[] array = new int[10];
    public static void main(String args[]){
        int i = array[1];
        System.out.println(i);
    }

    @Test
    public void test1(){
        Map<Object, Object> map = new ConcurrentHashMap<>();
        
    }

    @Test
    public void test2(){
        String name = "https://h5.yit.com/product.html?product_id=24735&channel=195";
        Pattern patternEnd = Pattern.compile("=[0-9]+&");
        Matcher matcherEnd = patternEnd.matcher(name);
        if(matcherEnd.find()){
            System.out.println("----------"+matcherEnd.group());
        }
    }
}
