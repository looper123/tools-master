import com.quark.entity.Teacher;

/**
 * Created by 311198 on 2017/3/1.
 */
public class SinletonThreadTest {


    public static void main(String[] args) {

        final Teacher teacher = Teacher.getInstance();
        new Thread(new Runnable() {
           @Override
           public void run() {
                    teacher.setName("jack");
                    teacher.setAge(11);
                    System.out.println(teacher.getName()+"----------" + teacher.getAge() +"------thread1");
           }
       }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(teacher.getName()+"----------" + teacher.getAge() +"------thread2");
            }
        }).start();

    }

    }


