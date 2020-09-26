package com.cbellmont;

public class Main {

    public static void main(String[] args) {
        concurrencyWithThreadNormal();
        //concurrencyWithThreadJoin();
    }

    private static void concurrencyWithThreadNormal(){
        System.out.println("Iniciando concurrencyWithThreadNormal");
        Thread t1 = new ThreadCustom();
        t1.start();
        Thread t2 = new ThreadCustom();
        t2.start();
    }

    private static void concurrencyWithThreadJoin(){
        System.out.println("Iniciando concurrencyWithThreadJoin");

        Thread t1 = new ThreadCustom();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new ThreadCustom();
        t2.start();
    }
}
