package be.intecbrussel.exercice.exercice2;

public class Exercice2 {
    public static void main(String[] args) {
        CharacterPrinter printer1 = new CharacterPrinter('☯', 200);
        CharacterPrinter printer2 = new CharacterPrinter('♫', 200);

        Thread printerThread1 = new Thread(printer1);
        Thread printerThread2 = new Thread(printer2);

        printerThread1.start();
        printerThread2.start();
    }
}
