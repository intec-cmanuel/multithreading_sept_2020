package be.intecbrussel.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class FanClub {
    private AtomicInteger totalFans = new AtomicInteger(0);

    public void increment() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        totalFans.incrementAndGet();
    }

    public int getTotalFans() {
        return totalFans.get();
    }
}
