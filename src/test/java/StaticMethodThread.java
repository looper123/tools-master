public class StaticMethodThread implements  Runnable {

    @Override
    public void run() {
        SynchronizedStatic.minus("1");
    }
}
