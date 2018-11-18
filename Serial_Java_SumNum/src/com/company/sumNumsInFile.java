package com.company;
import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
public class sumNumsInFile {
    private int sum;
    public sumNumsInFile(){

    }

    public int getSum(){
        return sum;
    }

    public void calculate() throws IOException{
        //To debug where file is
        //String workingDir = System.getProperty("user.dir");
        //Path filePath = Paths.get(workingDir+File.separator+"test.txt");
        File file = new File("./sumFile.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        int c = 0;
        sum=0;
        while((c = buffer.read()) != -1) {
            char character = (char) c;
            if(character>=48 && character<=57){
                sum += (character-48);
            }
            //System.out.print(character);
        }

    }

}
