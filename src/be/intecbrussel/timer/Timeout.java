package be.intecbrussel.timer;

import java.util.TimerTask;

public class Timeout extends TimerTask {
    @Override
    public void run() {
        System.out.println("Timer is done.");
    }
}
