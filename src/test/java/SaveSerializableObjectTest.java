import com.quark.entity.SingletonObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ZhenpengLu on 2018/4/3.
 * 序列化单例 使用静态内部类 线程安全 但是对象改变了（不是单例了）
 * 解决方法：在单例对象中添加 readResolve方法
 */
public class SaveSerializableObjectTest {

    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
//        写入文件
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("test.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(instance);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(instance.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
//        读取文件中的内容
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("test.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SingletonObject singletonObject = (SingletonObject) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(singletonObject.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
