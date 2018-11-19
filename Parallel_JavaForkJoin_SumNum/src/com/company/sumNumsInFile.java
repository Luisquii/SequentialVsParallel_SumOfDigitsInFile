package com.company;
import java.util.concurrent.RecursiveTask;
import java.io.*;
import java.lang.*;
public class sumNumsInFile extends RecursiveTask<Long>{
    private long sum;
    public sumNumsInFile(){

    }


    @Override
    protected Long compute(){
        //Thread thread = Thread.currentThread();
        //System.out.println("RunnableJob is being run by " + thread.getName() + " (" + thread.getId() + ")");
        //System.out.println("by thread " +  Thread.currentThread().getName());
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
        return sum;
    }
}
