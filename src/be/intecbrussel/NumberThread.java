package be.intecbrussel;

public class NumberThread extends Thread{
    public String name;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + " " + i);
            if (i > 500 && name.equalsIgnoreCase("t1")) {
                throw new NullPointerException("TEST !!! BIG DDT");
            }
        }
    }
}
