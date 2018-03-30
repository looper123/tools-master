/**
 * Created by 311198 on 2017/3/16.
 */
public class DerviedTest extends Base {


        private String name = "dervied";

        public DerviedTest() {
            tellName();
            printName();
        }

        public void tellName() {
            System.out.println("DerviedTest tell name: " + name);
        }

        public void printName() {
            System.out.println("DerviedTest print name: " + name);
        }

        public static void main(String[] args){

            new DerviedTest();
    }
}
