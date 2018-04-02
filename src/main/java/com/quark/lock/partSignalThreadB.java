package com.quark.lock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class partSignalThreadB implements  Runnable{

    private PartConditionSignal partConditionSignal;

    public partSignalThreadB(PartConditionSignal partConditionSignal) {
        this.partConditionSignal = partConditionSignal;
    }

    @Override
    public void run() {
        partConditionSignal.awaitAllThreadB();
    }
}
