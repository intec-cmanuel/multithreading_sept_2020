package be.intecbrussel;

public class PlayerThread extends Thread{
    private String playerName;
    private Snowkids team;

    public PlayerThread(String playerName, Snowkids team) {
        this.playerName = playerName;
        this.team = team;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            int fans = team.getTotalFans();
            fans++;
            team.setTotalFans(fans);
        }
    }
}
