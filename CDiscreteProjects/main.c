#include <stdio.h>
#include <stdlib.h>
#include <limits.h>


int x = 10;

int main(int argc, char** argv) {
    
    //int x = 20;
    //printf("%d\n", x);  
    
    printf("The maximum value of Unsigned LONG LONG INT = %llu\n", ULLONG_MAX);
   //we need to subtract 1 from 2 to the power 64 to get the Unsigned LONG LONG INT
    
    //display();

   return (EXIT_SUCCESS);
}

display(){
    
    printf("%d", x);

}







