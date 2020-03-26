package com.org.Thread;

import sun.applet.Main;

/**
 * Created by shipra on 28/7/18.
 */
public class FirstThread {

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mainClass.produce();
                } catch (InterruptedException ex) {
                    System.out.print("=====================IN=====" + ex);
                }

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                mainClass.consume();

            }
        });
        thread.start();

        thread2.start();
    }
}

class MainClass implements Runnable {

    @Override
    public void run() {

        consume();
    }


    public void produce() throws InterruptedException {
        synchronized (this) {

            System.out.println("===============produce");
            System.out.println("===============produce");

            System.out.println("===============produce");
            System.out.println("===============produce");
            Thread.yield();

        }
    }

    public void consume() {
        synchronized (this) {
            System.out.println("===============consume");
            System.out.println("===============consume");
            System.out.println("===============consume");
            System.out.println("===============consume");

        }
    }


}
