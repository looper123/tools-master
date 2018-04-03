import com.quark.lock.ReadAndWriteLock;
import com.quark.lock.ReadThread;
import com.quark.lock.WriteThread;

/**
 * Created by ZhenpengLu on 2018/4/2.
 */
public class ReadAndWriteLockTest {

    public static void main(String[] args) {
        ReadAndWriteLock readAndWriteLock = new ReadAndWriteLock();
        ReadThread readThread = new ReadThread(readAndWriteLock);
        WriteThread writeThread = new WriteThread(readAndWriteLock);
        Thread thread_read1 = new Thread(readThread);
        Thread thread_read2 = new Thread(readThread);
        Thread thread_write1 = new Thread(writeThread);
        Thread thread_write2 = new Thread(writeThread);
//        验证读锁之间的非互斥性
//        thread_read1.start();
//        thread_read2.start();

//        验证写锁之间的互斥性
//        thread_write2.start();
//        thread_write1.start();

//        验证读写锁之间的互斥性
        thread_write1.start();
        thread_read1.start();
    }
}
