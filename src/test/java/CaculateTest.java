import java.util.Scanner;

public class CaculateTest {


    public static void main(String[] args) {
//        冒泡
        int[] num = {19, 20, 3, 22, 9, 5, 200, 23};
//        各位置的元素
        for (int i = 0; i < num.length - 1; i++) {
//            各位置元素需要比较的次数
            for (int j = 0; j < num.length - 1 - i; j++) {
//                从小到大
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        //    折半(因为折半需要数组排列有序 所以使用经过冒泡排序的数组)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int key  = sc.nextInt();
        int start = 0;
        int end = num.length-1;
        int mid = (start + end)/2;

        while(key != num[mid]){
//            往前找
            if (key < num[mid]){
                end = mid -1;
                mid = (start + end)/2;
//                往后找
            }else{
                start = mid +1;
                mid = (start + end)/2;
            }
        }
        System.out.println(mid);


    }




}
