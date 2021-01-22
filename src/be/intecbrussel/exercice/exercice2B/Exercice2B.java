package be.intecbrussel.exercice.exercice2B;

public class Exercice2B {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('☎', 100));
        Thread thread2 = new Thread(() -> print('✈', 1000));

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        thread2.setDaemon(true);

        thread1.start();
        System.out.println(thread1.getState());

        thread2.start();
        System.out.println(thread2.getState());
    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
            Thread.yield();
        }
    }
}
