// Step 1: Create a class that extends Thread
class MyThread extends Thread {

    // Step 2: Override the run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Step 3: Create main class
public class ThreadExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread(); // create thread object
        t1.start();  // start the thread (calls run() internally)

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

