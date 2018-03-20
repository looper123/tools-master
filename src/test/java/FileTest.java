import java.io.File;
import java.io.IOException;

/**
 * Created by 311198 on 2017/4/7.
 */
public class FileTest {

    public static void  main(String args[]) throws IOException {
        File file = new File("c:\\abc");
        file.createNewFile();
    }
}
