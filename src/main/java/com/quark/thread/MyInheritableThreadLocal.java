package com.quark.thread;

/**
 * Created by ZhenpengLu on 2018/3/30.
 * 重写InheritableThreadLocal 的childValue 改变从父线程传递到子线程的 InheritableThreadLocal保存的值
 * note：childValue会在子线程启动前调用  而且改变的值不会影响父线程原先的值
 */
public class MyInheritableThreadLocal extends InheritableThreadLocal {

    @Override
    protected Object childValue(Object parentValue) {
        return super.childValue(parentValue)+"子线程";
    }
}
