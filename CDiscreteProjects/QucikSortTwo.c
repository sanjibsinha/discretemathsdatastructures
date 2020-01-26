#include<stdio.h>

// we need an utility function to swap two numbers
// we will use this function later 
void swappingNumber(int* numOne, int* numTwo){
    int temp = *numOne;
    *numOne = *numTwo;
    *numTwo = temp;
}
/* 
 * this function will place a random collection of numbers
 * in an ascending order
 * first we assume the last element of an array is the pivot index, 
 * such that all the smaller numbers will be on the left side
 * of pivot index, and all the higher numbers will be on
 * the right side of the pivot index
*/
int arrangeNumbers (int arrayOfNumbers[], int lowIndex, int highIndex){
    int pivotIndex = arrayOfNumbers[highIndex];
    int indexNumber = (lowIndex - 1);
    for (int initialNUmber = lowIndex; initialNUmber <= highIndex - 1; initialNUmber++){
        if (arrayOfNumbers[initialNUmber] <= pivotIndex){
            indexNumber++;
            swappingNumber(&arrayOfNumbers[indexNumber], &arrayOfNumbers[initialNUmber]);
        }
    }
    swappingNumber(&arrayOfNumbers[indexNumber + 1], &arrayOfNumbers[highIndex]);
    return (indexNumber + 1);
}

void quickSortTheCollection(int arrayOfNumbers[], int lowIndex, int highIndex){
    if (lowIndex < highIndex){
        int pivotIndex = arrangeNumbers(arrayOfNumbers, lowIndex, highIndex);
        quickSortTheCollection(arrayOfNumbers, lowIndex, pivotIndex - 1);
        quickSortTheCollection(arrayOfNumbers, pivotIndex + 1, highIndex);
    }
}

void displayInAscendingOrder(int arrayOfNumbers[], int sizeOfCollection){
    int initialNUmber;
    for (initialNUmber = 0; initialNUmber < sizeOfCollection; initialNUmber++)
        printf("%d ", arrayOfNumbers[initialNUmber]);
    printf("\n");
}

/*
 * int main(int argc, char** argv){
    
    int arrayOfNumbers[] = {22, 17, -8, 9, 11, 5};
    int numberOfNUmbers = sizeof(arrayOfNumbers)/sizeof(arrayOfNumbers[0]);
    quickSortTheCollection(arrayOfNumbers, 0, numberOfNUmbers - 1);
    printf("The sorted array is: ");
    displayInAscendingOrder(arrayOfNumbers, numberOfNUmbers);
    
    return 0;
}
*/
