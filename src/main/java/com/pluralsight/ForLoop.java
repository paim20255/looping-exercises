package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int count = 10; count >= 1; count -=1, Thread.sleep(1000)) {
            System.out.println(count);
        }
        System.out.println("Launch!");
    }
}
