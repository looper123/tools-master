/**
 * Created by 311198 on 2017/3/6.
 * 冒泡排序
 */
public class BubbleTest {

    public static void main(String[] args){
//        冒泡
            int[] num = {1,24,10,7,26,38,11};
        //  数组各位置元素
        for (int i = 0; i < num.length-1; i++) {
            //比较的次数
            for (int j = 0; j <num.length-i-1 ; j++) {
//                从小到大
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j +1] = temp;
                }
            }
        }
        for (int i = 0; i <num.length ; i++) {
            System.out.println("------"+num[i]);
        }
//      折半查找
        int key = 26;
        int startIndex = 0;
        int endIndex = num.length-1;
        int midIndex = (startIndex + endIndex)/2;
        while(key != num[midIndex]){
            if( key > midIndex){
                startIndex = midIndex + 1;
                midIndex = (startIndex + endIndex)/2;
            }else if(key < midIndex){
                endIndex = midIndex -1 ;
                midIndex = (startIndex + endIndex)/2;
            }
            System.out.println("+++++++++"+midIndex);
        }

        int key1 =25;
        int[] array = new int[11];
        int start = 0;
        int end = array.length - 1;
        int mid = (start+end)/2;

        if(key1 != array[mid]){
            if(key1 > array[mid]){
                start = array[mid+1];
                mid = (start+end)/2;
            }else {
                end = array[mid-1];
                mid = (start+end)/2;
            }
        }
    }







}
