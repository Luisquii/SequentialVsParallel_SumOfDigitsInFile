#include <iostream>
#include <fstream>
#include "cppheader.h"

using namespace std;


class sumNumsInFile{
private:
    int sum;

public:
    sumNumsInFile() : sum(0) {}


    int getSum() const{
        return sum;
    }

    void calculate(){
        sum=0;
        ifstream myfile;
        char file[]= "sumFile.txt";
        //char file[]= "test.txt";
        myfile.open(file);
        char c;
        while(myfile.get(c)){
            if(c>=48 && c<=57){
                sum += (c-48);
            }
        }
        myfile.close();

    }
};

int main(int argc, char* argv[])
{
    sumNumsInFile sm;
    double ms;
    Timer t;
    ms=0;
    cout << "Starting..." << endl;
    for(int i =0; i<N; i++){
        t.start();
        sm.calculate();
        ms += t.stop();
    }

    cout << "Sum of digits= " << sm.getSum() <<endl;
    cout << "Avg time= " << (ms/N) << "ms" << endl;

    return 0;
}
