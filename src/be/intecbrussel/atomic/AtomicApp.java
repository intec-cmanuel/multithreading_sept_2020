package be.intecbrussel.atomic;

import be.intecbrussel.PlayerThread;
import be.intecbrussel.Snowkids;

public class AtomicApp {
    public static void main(String[] args) throws InterruptedException {
        FanClub fc = new FanClub();

        Thread mert = new AtomicThread(fc);
        Thread jeanPierre = new AtomicThread(fc);
        Thread matteo = new AtomicThread(fc);
        Thread microIce = new AtomicThread(fc);

        mert.start();
        jeanPierre.start();
        matteo.start();
        microIce.start();

        matteo.interrupt();


        mert.join();
        jeanPierre.join();
        matteo.join();
        microIce.join();

        System.out.println(fc.getTotalFans());
    }
}
