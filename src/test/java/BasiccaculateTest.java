import java.util.ArrayList;
import java.util.List;

public class BasiccaculateTest {


    public static void main(String[] args) {
//    题目1:输入一行字符，分别统计出其英文字母、空格、数字和其他字符出现的次数。
        String str = "advaffa 1111 333763==*&&^^";
        char[] array = str.toCharArray();
        int letterCount = 0;
        int blankCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((array[i] >= 'a' && array[i] <= 'z') || (array[i] >= 'A' && array[i] <= 'Z')) {
                letterCount++;
            } else if (array[i] == ' ') {
                blankCount++;
            } else if (array[i] >= '0' && array[i] <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("英文字母"+letterCount);
        System.out.println("空格"+blankCount);
        System.out.println("数字"+numberCount);
        System.out.println("其他"+otherCount);
//    题目2:利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示，
//          如果离特殊线分数x差5分的用D表示。
        int[] score = {88, 77, 45, 93};
        //令x为80;
        int x = 80;
        String[] letter = new String[4];
        for (int i = 0; i < score.length; i++) {
            //A B C分段
            letter[i] = score[i] >= 90 ? "A" : (score[i] >= 60 ? "B" : "C");
            //D分段
            letter[i] = score[i] >= 80 + 5 ? letter[i] : (score[i] >= 80 - 5 ? "D" : letter[i]);
        }
        for (int i = 0; i < letter.length; i++) {
            System.out.println(score[i]+"对应分段"+letter[i]);
        }
//    题目3:打印出能被3整除的所有"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
//          例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
        List numList = new ArrayList();
        for (int i = 100; i <1000 ; i++) {
            int hund = i/100;
            int deca = i%100/10;
            int unit = i%100%10;
            if(((hund*hund*hund+deca*deca*deca +unit*unit*unit) == i) && ((hund+deca+unit)%3==0)){
                numList.add(i);
                System.out.println("能被3整除的水仙花数"+i);
            }
        }
    }


}
