import org.junit.Test;

import java.util.*;

/**
 * Created by 311198 on 2017/3/2.
 */
public class CollectionTest {

    @Test
    public void foreachTest(){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(Integer num: list){
            System.out.println(num);
        }
    }

    //得到所有的key value键值对
    @Test
    public void entrySetTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        for(Map.Entry<String,Object> entry :map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    //循环key得到value
    @Test
    public void entryKeyTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        for(String key :map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    //职能获取所有value
    @Test
    public void getAllValues(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        for(Object value:map.values()){
            System.out.println(value);
        }
    }

    //iterator迭代器对象
    @Test
    public void iteratorTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }


    /**
     * 冒泡
     */
    @Test
    public void BubleTest(){
        int[] a = {1,29,3,20,100,0};
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length - i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                     a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for ( int k = 0 ;k < a.length ;k++ ){
            System.out.println(a[k]);
        }
    }

    /**
     * 折半
     */
    @Test
    public void halfSearchTest(){
        int num = 3;
        int [] a = {1,3,9,10,29,40,100};
        //循环实现
        int i = searchNumberByFor(num,a);
        //递归实现
        int j = searchNumberByReturn(num,a,0,a.length-1);
        System.out.println("要找的数字在第"+i+"个索引");
        System.out.println("要找的数字在第"+j+"个索引");
    }

    public int searchNumberByFor(int num, int[] a){
        int start = 0;
        int end = a.length-1;
        while( start <=  end ){
            //不需要做奇偶判断
            int mid =  (start+end)/2;
                if(num ==  a[mid]){
                    return  (start+end)/2;
                } else if (num < a[mid]) {
                    end = mid - 1 ;
                } else {
                    start = mid +1  ;
                }
        }
        return -1;
    }

    public int searchNumberByReturn(int num, int[] a,int start ,int end ){
        int mid = (start+end)/2;
        if (num ==a[mid] ){
            return mid ;
        } else if (num < a[mid]){
            return searchNumberByReturn(num,a,start,mid -1);
        }else {
            return searchNumberByReturn(num,a,mid+1,end);
        }
    }


}







