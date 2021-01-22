package be.intecbrussel.exercice.exercice1;

public class PrintThread extends Thread{
    private final char c;
    private final int count;

    public PrintThread(char c, int count) {
        this.c = c;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }
}
