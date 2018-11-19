package com.company;

import java.util.concurrent.ForkJoinPool;

public class Main {
    private static final int MAXTHREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println("Total Threads: " + MAXTHREADS);
        ForkJoinPool pool =new ForkJoinPool(MAXTHREADS);;
        long startTime, stopTime, total;
        double ms = 0;
        long sumatoria=0;

        for(int i = 0; i < 10 ; i++){
            startTime = System.currentTimeMillis();
            //pool = new ForkJoinPool(MAXTHREADS);
            sumatoria = pool.invoke(new sumNumsInFile());
            stopTime = System.currentTimeMillis();
            ms += (stopTime - startTime);
        }
        System.out.printf("Sumatoria: %d\n", sumatoria);
        System.out.printf("avg time = %.5f\n", (ms / 10));
    }
}
