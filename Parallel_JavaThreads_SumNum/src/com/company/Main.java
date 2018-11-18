package com.company;

public class Main {

    private static final int MAXTHREADS = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        System.out.println("Total Threads: " + MAXTHREADS);
        double ms=0;
        long initTimer, endTimer;

        sumNumsInFile threads[];
        threads = new sumNumsInFile[MAXTHREADS];

        for(int i=0; i<10; i++){
            for(int j = 0; j < threads.length / MAXTHREADS; j++){
                if(j != threads.length -1){
                    threads[j] = new sumNumsInFile(i);
                }else{
                    threads[j] = new sumNumsInFile(i);
                }
            }

            initTimer = System.currentTimeMillis();
            for(int j = 0; j < threads.length / MAXTHREADS; j++){
                threads[j].start();
            }

            for(int j= 0; j < threads.length / MAXTHREADS; j++){
                try{
                    threads[j].join();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            endTimer = System.currentTimeMillis();
            ms += (endTimer - initTimer);
        }

        //System.out.printf(threads.getSum());
        System.out.printf("avg time = %.5f\n", (ms / 10));
    }
}
