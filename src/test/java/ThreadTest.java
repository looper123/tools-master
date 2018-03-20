import java.util.ArrayList;
import java.util.List;

/**
 * Created by 311198 on 2017/3/16.
 * main和子线程的优先级相同，一般main函数会先运行，所以先运行出结果（）
 */
public class ThreadTest  {

    public static  void main(String args[]){

       final List<String> list = new ArrayList<>();

        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    list.add("pong");
                }
            }).start();
            list.add("ping");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            if ("pring".equals(list.get(0))){
                for(String  str:list){
                    System.out.println("----------"+str);
                }
//            }
        }
    }
}
