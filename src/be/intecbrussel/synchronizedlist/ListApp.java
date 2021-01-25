package be.intecbrussel.synchronizedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListApp {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> intList = new ArrayList<>();
        List<Integer> sList = Collections.synchronizedList(intList);

        Thread thread1 = new Thread(() -> populate(sList));
        Thread thread2 = new Thread(() -> populate(sList));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(intList.size());
    }

    private static void populate(List<Integer> list) {
        for (int i = 0; i < 1000; i++){
            list.add(i);
        }
    }
}
