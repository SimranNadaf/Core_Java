// One thread work onlyon single method or variable -> is known as Thread Safe.

class Counter {
    int counter = 0;
    // way 2 - Thread Safe
    public synchronized  void increament() {   // is used synchronized keyword at method, one thread will be wait till another is done execution 
        counter++;
    }
}

class Thread_Mutable {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 100; i++) {
                c.increament();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 100; i++) {
                c.increament();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();                 // here t1 and t2 thread can collabs  - counter will be 100 (if only start())
        t2.start();

        // way 1 - Thread Safe
        // t1.join();                  // Ensure that both threads are not collabs - counter will be 200
        // t2.join();
        
        System.out.println(c.counter);
    }
}