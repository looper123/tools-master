import com.quark.lock.PartConditionSignal;
import com.quark.lock.PartSignalThreadA;
import com.quark.lock.partSignalThreadB;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 测试同一个锁下 不同的condition
 */
public class DifferentConditionTest {

    public static void main(String[] args) throws InterruptedException {
        PartConditionSignal partConditionSignal = new PartConditionSignal();
        PartSignalThreadA partSignalThreadA = new PartSignalThreadA(partConditionSignal);
        partSignalThreadB partSignalThreadB = new partSignalThreadB(partConditionSignal);
        Thread threadA_1 = new Thread(partSignalThreadA);
        Thread threadA_2 = new Thread(partSignalThreadA);
        Thread threadB_1 = new Thread(partSignalThreadB);
        Thread threadB_2 = new Thread(partSignalThreadB);
        threadA_1.start();
        threadA_2.start();
        threadB_1.start();
        threadB_2.start();
//        保证主线程活跃
        Thread.sleep(5000);
//        效果展示
//        唤醒conditionA相关线程
        partConditionSignal.signalAllConditionA();
 //        唤醒conditionA相关线程
//        partConditionSignal.signalAllConditionB();
    }
}
