package com.quark.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ZhenpengLu on 2018/4/2.
 */
public class TimerScheduler extends TimerTask {

//    当把参数设置为true时 会把任务以守护线程的形式启动
    private static Timer timer = new Timer(true);

    @Override
    public void run() {
        System.out.println("当前时间" + new Date());
    }

    public static void main(String[] args) {
        timer.schedule(new TimerScheduler(),new Date(),10000);
    }
}
