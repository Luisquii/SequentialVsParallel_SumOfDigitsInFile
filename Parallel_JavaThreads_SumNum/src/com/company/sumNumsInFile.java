package com.company;

import java.io.*;
import java.lang.*;

public class sumNumsInFile extends Thread{

    private int sum;
    int i;
    public sumNumsInFile(int i){
        this.i = i;
    }
    public int getSum(){
        return sum;
    }

    public void run(){

        int c = 0;
        try {
            File file = new File("./sumFile.txt");
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            while ((c = buffer.read()) != -1) {
                char character = (char) c;
                if (character >= 48 && character <= 57) {
                    sum += (character - 48);
                }
            }
        }catch (Exception e){
            System.out.printf("Please Verify Code");
        }
        if(i ==9) {
            System.out.print(sum + "\n");
        }
    }
}
