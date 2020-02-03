/*
 * an array is a collective name given to a group of similar quantities
 * find average marks obtained by a class of 10 students
 */

int main(int argc, char** argv) {
    
   float averageNumber, sumOfNumbers = 0;
   
   int indexNumber;
   
   // declaring array
   int individualMarks[10]; 
   
   for(indexNumber = 0; indexNumber <= 9; indexNumber++){
       
       printf("Enter marks: ");
       // storing data in array
       scanf("%d", &individualMarks[indexNumber]);  
   
   }
   
   for(indexNumber = 0; indexNumber <= 9; indexNumber++){
       sumOfNumbers = sumOfNumbers + individualMarks[indexNumber];
   }
   
   averageNumber = sumOfNumbers / 10;
   
   printf("Average number = %f", averageNumber);
    

    return 0;
}

