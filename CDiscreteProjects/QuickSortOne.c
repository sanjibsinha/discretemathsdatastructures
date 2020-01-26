#include<stdio.h>

void quicksortInOneFunction(int arrayOfNumbers[25], int firstIndex, int lastIndex){
    int firstStorage, secondStorage, pivotIndex, temporaryStorage;
    if(firstIndex < lastIndex){
        pivotIndex = firstIndex;
        firstStorage = firstIndex;
        secondStorage = lastIndex;
        while(firstStorage < secondStorage){
            while(arrayOfNumbers[firstStorage] <= arrayOfNumbers[pivotIndex] 
                    && firstStorage < lastIndex)
                firstStorage++;
            while(arrayOfNumbers[secondStorage] > arrayOfNumbers[pivotIndex])
                secondStorage--;
            if(firstStorage < secondStorage){
                temporaryStorage = arrayOfNumbers[firstStorage];
                arrayOfNumbers[firstStorage] = arrayOfNumbers[secondStorage];
                arrayOfNumbers[secondStorage] = temporaryStorage;
            }
        }
        temporaryStorage = arrayOfNumbers[pivotIndex];
        arrayOfNumbers[pivotIndex] = arrayOfNumbers[secondStorage];
        arrayOfNumbers[secondStorage] = temporaryStorage;
        quicksortInOneFunction(arrayOfNumbers, firstIndex, secondStorage - 1);
        quicksortInOneFunction(arrayOfNumbers, secondStorage + 1, lastIndex);
    }
}

int main(){
    int initialNumber, countingLimit, collectionOfNumber[6];
    printf("How many integers you want for for quick sorting?"
            " (Maximum value you can enter: 6): ");
    scanf("%d", &countingLimit);
    
    if(countingLimit <= 6){
        printf("Enter %d elements: ", countingLimit);
        for(initialNumber = 0; initialNumber < countingLimit; initialNumber++)
            scanf("%d", &collectionOfNumber[initialNumber]);
        quicksortInOneFunction(collectionOfNumber, 0, countingLimit - 1);
        printf("The Sorted Order is: ");
        for(initialNumber = 0; initialNumber < countingLimit; initialNumber++)
            printf(" %d", collectionOfNumber[initialNumber]);
    } else {
        printf("You crossed the maximum value limit, try again!");
    }
    
    return 0;
} 
