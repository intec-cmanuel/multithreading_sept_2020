package be.intecbrussel.exercice.exercice1;

public class Exercice1 {
    public static void main(String[] args) {
        PrintThread printThread1 = new PrintThread('☃', 100);
        PrintThread printThread2 = new PrintThread('ッ', 100);

        printThread1.start();
        printThread2.start();
    }
}
