package be.intecbrussel;

public class TimedWaitingApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('☎', 100));
        Thread thread2 = new Thread(() -> print('✈', 100));

        thread1.setName("Jean-Bon");
        thread2.setName("Not Jean-Bon");

        thread1.start();
        thread2.start();

        System.out.println("Threads started, time to nap!");

        while (thread1.isAlive() || thread2.isAlive()) {
            try {
                thread1.interrupt();
                thread2.interrupt();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("This was a good nappy nap");
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);

//            if (Thread.currentThread().getName().equalsIgnoreCase("Jean-Bon")) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " is interrupted");
                }
//            }
        }
    }
}
