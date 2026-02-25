import java.lang.*;
class Counter {
    //count after t1 has incremented 1000 times will be 1000 then t2 will start the count from 1000 instead of 0
    //which will lead to a final count of 2000 instead of 1000. 
    //This is because both threads are accessing and modifying the same variable 'count' with synchronization
    //which ensures that only one thread can access the method at a time
    private int count = 0;

    //synchronized keyword is used to control access to a particular resource in a multi-threaded environment.

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class methodTest {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        //Lambda expression is used to create a thread that increments the counter 1000 times.
        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });

        //Lambda expression is used to create another thread that increments the counter 1000 times.
        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++) c.increment();
        });

        //start() method is used to start the execution of the thread. It calls the run() method internally.
        t1.start();
        t2.start();

        //join() method is used to wait for a thread to die. 
        //It is used to ensure that a thread has completed its execution before the main thread continues.
        // t1.join();
        t2.join();
        t1.join();

        System.out.println("Final Count: " + c.getCount());
        // The expected output is 2000, but without synchronization, it may produce a different result due to race conditions.
        //output is 2000 because we have used synchronized keyword in the increment() method, which ensures that only one thread can access the method at a time, thus preventing race conditions
    }
}

