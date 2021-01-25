package be.intecbrussel;

public class Snowkids {
    private int totalFans = 0;
    private final Object monitorObject = new Object();

    public int getTotalFans() {
        return totalFans;
    }

    public void setTotalFans(int totalFans) {
        this.totalFans = totalFans;
    }

    public void increment() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
        synchronized (monitorObject) {
            totalFans++;
        }
    }

    public synchronized void decrement() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {}
        totalFans--;
    }
}
