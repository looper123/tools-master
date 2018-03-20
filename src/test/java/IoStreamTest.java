import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by 311198 on 2017/2/16.
 */
public class IoStreamTest {

    @Test
    public void ioStream(){
        try {
//        定义输入流 读取文件数据
            FileInputStream fis = new FileInputStream("d:/main.min.js");
//            定义输出流
            FileOutputStream fos = new FileOutputStream("e:/1.txt");

            BufferedReader   bre = new BufferedReader(new FileReader("d:/main.min.js"));//此时获取到的bre就是整个文件的缓存流
//            定义保存字节的数组容器大小
            byte[] buf=new byte[2048];
//            记录读取到字节个数的变量

//            BI.prdUrl+"/strategy/region/index.action"
            int len=0;
//            循环读取( =-1表示读取到文件结尾)
            String str="";
            while(bre.readLine()!=null){
                System.out.println(bre.readLine());
               str += bre.readLine();
//                if(bre.readLine().contains("BI.prdUrl")){


//                }


//                fos.write(buf,0,len);
            }

//            System.out.println(str);
//            关闭流
            fis.close();
//            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void  keyBoardInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        System.out.println(scanner.nextBigInteger());
    }
}
