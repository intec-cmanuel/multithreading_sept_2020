package be.intecbrussel;

public class BlockedApp {
    public static void main(String[] args) throws InterruptedException {
        Snowkids team = new Snowkids();
        Thread mert = new PlayerThread("Christiano Mert", team);
        Thread jeanPierre = new PlayerThread("Jean-Pierre", team);
        Thread matteo = new PlayerThread("(Not Christiano) Matteo", team);
        Thread microIce = new PlayerThread("MicroIce", team);

        mert.start();
        jeanPierre.start();
        matteo.start();
        microIce.start();

        mert.join();
        jeanPierre.join();
        matteo.join();
        microIce.join();

        System.out.println(team.getTotalFans());
    }
}
