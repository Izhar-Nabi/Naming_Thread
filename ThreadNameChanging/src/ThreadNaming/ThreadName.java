package ThreadNaming;

public class ThreadName implements Runnable{
    @Override
    public void run() {
        System.out.println("implement the Runnable for creating Thread // thread");
        System.out.println("The Name of Task Thread is : "+Thread.currentThread().getName()); // here is getting the Name of Thread
        Thread.currentThread().setName("xyz Name of Run method Thread "); // New Name of Thread...
        System.out.println(Thread.currentThread().getName());// here Name will be Change...(Thread)
    }
    public static void main(String [] args){
        ThreadName thread1= new ThreadName();
        Thread thread2= new Thread(thread1);
        thread2.start();

        System.out.println("The Name of thread is :"+Thread.currentThread().getName()); // main Thread is here and Created by JVM.
        System.out.println("is Thread is Alive : "+thread2.isAlive());
        // thread2.start();
       // System.out.println("is alive :"+thread2.isAlive()); // here if we remove commit then it through the thread error(exception in main thread).

    }
}
