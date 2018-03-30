import com.quark.tools.ReadDataByPipeStream;
import com.quark.tools.WriteDataByPipeStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by ZhenpengLu on 2018/3/29.
 */
public class PipeStreamTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream();
        pipedInputStream.connect(pipedOutputStream);
        WriteDataByPipeStream writeDataByPipeStream = new WriteDataByPipeStream(pipedOutputStream);
        ReadDataByPipeStream readDataByPipeStream = new ReadDataByPipeStream(pipedInputStream);
        Thread thread = new Thread(writeDataByPipeStream);
        Thread thread2 = new Thread(readDataByPipeStream);
        thread.start();
        thread2.start();
        thread.join();
        System.out.println("thread_provider1运行结束");
    }
}
