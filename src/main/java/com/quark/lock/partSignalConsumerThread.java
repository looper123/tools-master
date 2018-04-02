package com.quark.lock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class PartSignalConsumerThread implements  Runnable{

    private ProviderAndConsumer providerAndConsumer;

    public PartSignalConsumerThread(ProviderAndConsumer providerAndConsumer) {
        this.providerAndConsumer = providerAndConsumer;
    }

    @Override
    public void run() {
        providerAndConsumer.conusmer();
    }
}
