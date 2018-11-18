#include <stdio.h>
#include <stdlib.h>
#include "cheader.h"
#include <omp.h>

//This program will sum all the digits of the sumFile.txt. This algorithm is parallelized with OpenMP
char file[11] = "sumFile.txt";

int sumNumsInFile(){
    FILE *arch;
    arch = fopen(file,"r");

    int sum=0;
    char caracter;

    if(arch != NULL){
        while(!feof(arch)){
            caracter = fgetc(arch);
            //printf("%c", caracter);
            if(caracter >= 48 && caracter <= 57){
                sum += (caracter-48) ;
            }
        }
    }else
        printf("Error al abrir el archivo");

    //printf("%d\n",sum);
    fclose(arch);
    return sum;
}

int main()
{

    double ms;
    int i;
    int sumatoria;

    printf("Starting...\n");
    ms=0;

    #pragma omp parallel for
    for(i=0; i<N; i++){
        start_timer();
        sumatoria = sumNumsInFile();
        ms += stop_timer();
    }

    printf("Sum of digits= %d\n", sumatoria);
    printf("avg time = %.5lf\n", (ms/N));

    return 0;
}
