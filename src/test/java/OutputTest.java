/**
 * Created by 311198 on 2017/3/17.
 */
public class OutputTest {

    public static String output="";
    public static void foo(int i){
        try {
            if(i==1){
                throw new Exception();
            }
            output +="1";
        }
        catch(Exception e){
            output+="2";
            return;
        }
        finally{
            output+="3";
        }
        output+="4";
    }
    public static void main(String args[]){
        foo(0);
        foo(1);
        System.out.println(output);
    }
}
