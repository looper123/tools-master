package com.quark.tools;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by ZhenpengLu on 2018/3/29.
 */
public class ReadDataByPipeStream implements Runnable {

    private PipedInputStream pipedInputStream;

    public ReadDataByPipeStream(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        System.out.println("read start.....");
//        定义字节数组 长度固定
        byte[] byteArray = new byte[20];
        int read = 0;
        try {
            read = pipedInputStream.read(byteArray);

        while(read != -1){
            String newData = new String(byteArray, 0, read);
            System.out.println("in-----"+"data"+newData);
            read  = pipedInputStream.read(byteArray);
        }
        System.out.println();
        pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
