package com.quark.lock;

/**
 * Created by ZhenpengLu on 2018/3/30.
 */
public class PartSignalProviderThread implements  Runnable{

    private ProviderAndConsumer providerAndConsumer;

    public PartSignalProviderThread(ProviderAndConsumer providerAndConsumer) {
        this.providerAndConsumer = providerAndConsumer;
    }

    @Override
    public void run() {
        providerAndConsumer.provider();
    }
}
