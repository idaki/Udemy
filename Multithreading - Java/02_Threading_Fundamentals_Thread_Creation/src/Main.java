//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
//Option one
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("We are going to run thread " + Thread.currentThread().getName());
//                System.out.println("We are going to run thread priority " + Thread.currentThread().getPriority());
//            }
//        });
//
//        thread.setName("Thread One");
//        thread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println("We are running thread: " + Thread.currentThread().getName() + "  before starting new thread");
//        thread.start();
//        System.out.println("We are running thread: " + Thread.currentThread().getName() + "  after starting new thread");
//        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("A critical error took place in thread " + t.getName() + " : " + e);
//            }
//        });
//        thread.sleep(1000);
//
    }
    //Option Two
    public static class NewThread extends Thread {
    @Override
        public void run() {
        System.out.println("We are going to run thread " + Thread.currentThread().getName());
    }
    }
}