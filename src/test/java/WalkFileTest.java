import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


/**
 * Created by 311198 on 2017/1/16.
 */
public class WalkFileTest {

    @Test
    public void renameFilesToBak(){
         final String filePath="d:\\311198\\Desktop\\my DOC\\Ebook";
        try {
            Files.walkFileTree(Paths.get(filePath),new SimpleFileVisitor<Path>(){

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
                  return   FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                    String fileName = file.toFile().getName();
                    if(fileName.endsWith(".pdf")){
                        file.toFile().renameTo(new File(filePath+"\\"+fileName+".bak"));
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void renameFileToPDF(){
        final String filePath="H:\\java重要资料\\my DOC\\Ebook";
        try {
            Files.walkFileTree(Paths.get(filePath),new SimpleFileVisitor<Path>(){

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
                    return   FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                    String fileName = file.toFile().getName();
                    if(fileName.endsWith(".bak")){
                        String realPath=filePath+"\\"+fileName;
                        String newName = realPath.substring(0, realPath.indexOf(".bak"));
                        file.toFile().renameTo(new File(newName));
                    }
//                    if(fileName.endsWith(".avi")){
//                        file.toFile().delete();
//                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
