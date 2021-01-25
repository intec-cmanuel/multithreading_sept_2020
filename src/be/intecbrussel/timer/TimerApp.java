package be.intecbrussel.timer;

import java.util.Timer;

public class TimerApp {
    public static void main(String[] args) throws InterruptedException {
        Timeout timeout = new Timeout();
        Timer timer = new Timer(true);

        timer.scheduleAtFixedRate(timeout, 3000, 1000);

        Thread.sleep(8000);
        System.out.println("Application finished");
    }
}
