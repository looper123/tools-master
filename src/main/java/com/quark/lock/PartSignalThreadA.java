package com.quark.lock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class PartSignalThreadA implements  Runnable{

    private PartConditionSignal partConditionSignal;

    public PartSignalThreadA(PartConditionSignal partConditionSignal) {
        this.partConditionSignal = partConditionSignal;
    }

    @Override
    public void run() {
        partConditionSignal.awaitAllThreadA();
    }
}
