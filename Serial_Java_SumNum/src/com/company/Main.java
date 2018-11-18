package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        long startTime, stopTime;
        double acum = 0;

        System.out.printf("Starting...\n");
        sumNumsInFile sm = new sumNumsInFile();

        for(int i=0; i<10;i++){
            startTime = System.currentTimeMillis();
            sm.calculate();
            stopTime = System.currentTimeMillis();
            acum +=(stopTime - startTime);
        }
        System.out.printf("Sumatoria: %d\n", sm.getSum());
        System.out.printf("avg time = %.5f\n", (acum / 10));
    }
}
