// class A extends Thread {             // Way 1: extends Thread Class
//     public void run() {
//         for(int i=1;i<=100;i++) {
//             System.out.println(i);
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//             }
//         }
//     }
// }

// class B extends Thread {       // Way 1: extends Thread Class
//     public void run() {
//         for(int i=1;i<=100;i++) {
//             System.out.println(i);
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//             }
//         }
//     }
// }

class A implements Runnable {             // Way 2: implements Runnable interface --- Correct way/Good one
    public void run() {
        for(int i=1;i<=100;i++) {
            System.out.println("1. "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

// class B implements Runnable {        // Way 2: implements Runnable interface
//     public void run() {
//         for(int i=1;i<=100;i++) {
//             System.out.println("2. "+i);
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException ex) {
//             }
//         }
//     }
// }


class Thread_Concepts {
    public static void main(String[] args) {
        
        // A obj1 = new A();         // --> for way 1 (Thread class)
        // B obj2 = new B();

        // obj1.start();
        // obj2.start();

        Runnable obj1 = new A();      // --> for way 2 (Runnable Interface)
        // Runnable obj2 = new B();

        // Anonymous Class for Runnable with Lambda Expression
        Runnable obj2 = () -> {
                for(int i=1;i<=100;i++) {
                    System.out.println("2. "+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}