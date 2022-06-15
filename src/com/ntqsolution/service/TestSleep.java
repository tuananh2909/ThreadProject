package com.ntqsolution.service;

public class TestSleep extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleep ts1 = new TestSleep();
        TestSleep ts2 = new TestSleep();

        ts1.start();
        ts2.start();
    }
}
