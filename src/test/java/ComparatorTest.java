
import com.quark.entity.Student;
import com.quark.entity.Student2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 311198 on 2017/2/16.
 */
public class ComparatorTest {

    //    comaprator 排序
    @Test
    public void ComparableTest() {
        List<Student> list = new ArrayList();
        list.add(new Student(12, "瓜皮", 96));
        list.add(new Student(11, "蛇皮", 92));
        list.add(new Student(13, "山驴逼", 94));
        list.add(new Student(11, "皮皮虾", 98));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                升序 如果要降序 只需要把 o1和o2换一下位置
                int temp = o1.getAge() - o2.getAge();
                return temp == 0 ? o1.getScore() - o2.getScore() : temp;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        });

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student);
        }
    }

    //    compareble排序
    @Test
    public void compareTest() {
        List<Student2> list = new ArrayList();
        list.add(new Student2(15, "瓜皮", 96));
        list.add(new Student2(12, "蛇皮", 97));
        list.add(new Student2(12, "山驴逼", 94));
        list.add(new Student2(14, "皮皮虾", 98));
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            Student2 student = list.get(i);
            System.out.println(student);
        }
    }

    //    map的遍历
//    map的key和value可以为null，存在两个key为null时 下一个会把上一个覆盖掉
//    @Test
//    public void mapEntryTest() {
//        Map<String, List<Student>> map = new TreeMap<String, List<Student>>();
//        List<Map.Entry<String,List<Student>>> list = new ArrayList(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<String, List<Student>>>() {
//            @Override
//            public int compare(Map.Entry<String, List<Student>> o1, Map.Entry<String, List<Student>> o2) {
//                return  o1.getValue().compareTo(o2.getValue());;
//            }
//        });
//
//
//    }
}
