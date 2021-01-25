package be.intecbrussel.atomic;

import be.intecbrussel.Snowkids;

public class AtomicThread extends Thread{
    private FanClub fc;

    public AtomicThread(FanClub fc) {
        this.fc = fc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            fc.increment();
        }
    }
}
