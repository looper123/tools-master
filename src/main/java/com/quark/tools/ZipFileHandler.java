package com.quark.tools;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Expand;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * zip包的解压
 */
public class ZipFileHandler {

    /**
     * 需要依赖apache的ant
     * @param src  源文件路径
     * @param destination   目标路径
     * @param encoding  编码
     */
    public static void unZipFiles(String src, String destination, String encoding)throws Exception{
        Project p = new Project();
        Expand e = new Expand();
        e.setProject(p);
        e.setSrc(new File(src));
        e.setOverwrite(false);
        e.setDest(new File(destination));
           /*
           ant下的zip工具默认压缩编码为UTF-8编码，
           而winRAR软件压缩是用的windows默认的GBK或者GB2312编码
           所以解压缩时要制定编码格式
           */
        e.setEncoding(encoding);
        e.execute();
    }

    /**
     * 使用jdk下的java.util.zip 解压zip包
     * @param packagePath
     * @param dirPath
     * @param encoding
     */
    public static void unZipFilesByJdk(String packagePath, String dirPath, String encoding) {
        try {
            File file = new File(packagePath);
            File outFile = null;
            ZipFile zipFile = new ZipFile(file);
            ZipInputStream zipInput = new ZipInputStream(new FileInputStream(file));
            ZipEntry entry = null;
            InputStream input = null;
            OutputStream output = null;
            while((entry = zipInput.getNextEntry()) != null){
                System.out.println("解压缩" + entry.getName() + "文件");
                outFile = new File(dirPath + File.separator + entry.getName());
                if(!outFile.getParentFile().exists()){
                    outFile.getParentFile().mkdir();
                }
                if(!outFile.exists()){
                    outFile.createNewFile();
                }
                input = zipFile.getInputStream(entry);
                output = new FileOutputStream(outFile);
                int temp = 0;
                while((temp = input.read()) != -1){
                    output.write(temp);
                }
                input.close();
                output.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
