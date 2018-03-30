package com.quark.tools;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by ZhenpengLu on 2018/3/29.
 */
public class WriteDataByPipeStream implements  Runnable{

    private PipedOutputStream pipedOutputStream;

    public WriteDataByPipeStream(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        try {
        System.out.println("write start ....");
        for (int i = 0; i < 100; i++) {
            System.out.println("out---"+"data"+i);
            pipedOutputStream.write(("data"+i).getBytes());
        }
        System.out.println();

            pipedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
