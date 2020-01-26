# Quick Sort Algorithm

def smallerToGreater(array, startingNUmber, endingNUmber):
    searchingIndex = array[startingNUmber]
    lowIndex = startingNUmber + 1
    highIndex = endingNUmber

    while True:
        # we have a collection of numbers; we need to place those numbers in ascending order
        # in that collection there should be a low index number and high index number
        # we need to find the numbers that are larger than the rest amd send it to the right
        # first we need a searching index number that will check the current value
        # if the current value is larger than the searching index,
        # then we should send to the right side of the searching index and we can move left
        # to the next element.
        # the low index number should remain always lower than others,
        # and the numbers larger than the searching index should remain on the right side
        while lowIndex <= highIndex and array[highIndex] >= searchingIndex:
            highIndex = highIndex - 1

        # we also need to traverse the collection in the opposite process
        while lowIndex <= highIndex and array[lowIndex] <= searchingIndex:
            lowIndex = lowIndex + 1

        # if our above algorithm does not work, we exit the loop
        if lowIndex <= highIndex:
            array[lowIndex], array[highIndex] = array[highIndex], array[lowIndex]
            # else the loop continues
        else:
            # and we exit out of the loop
            break

    array[startingNUmber], array[highIndex] = array[highIndex], array[startingNUmber]

    return highIndex

def quickSort(arrayOfNumbers, startingNumber, endingNumber):
    if startingNumber >= endingNumber:
        return

    partitioningIndex = smallerToGreater(arrayOfNumbers, startingNumber, endingNumber)
    quickSort(arrayOfNumbers, startingNumber, partitioningIndex - 1)
    quickSort(arrayOfNumbers, partitioningIndex + 1, endingNumber)

arrayOfNUmbers = [100, 45, 1, 8, 47895, 5, 56, 23, 0, 89]

quickSort(arrayOfNUmbers, 0, len(arrayOfNUmbers) - 1)
print("The above random array of numbers in ascending order: " + str(arrayOfNUmbers))