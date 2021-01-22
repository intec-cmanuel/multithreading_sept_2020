package be.intecbrussel;

public class WaitingApp {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('☎', 10000));
        Thread thread2 = new Thread(() -> print('✈', 10000));

        thread1.start();
        thread2.start();

        System.out.println("Threads started, time to nap!");

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("This was a good nappy nap");
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
}
