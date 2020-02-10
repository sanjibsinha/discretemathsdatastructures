# Python 3.6 manipulation of an array so that the median is maximized

def getMaximizedMedian(arrayToManipulate, lengthOfTheArray):

    # when size of the array is even
    if lengthOfTheArray % 2 == 0:
        # find 1st maximum element
        maxElement1 = arrayToManipulate.index(max(arrayToManipulate))

        # find 2nd maximum element
        maxElement2 = arrayToManipulate.index(max(arrayToManipulate[0: maxElement1]))
        maxElement2 = arrayToManipulate.index(max(arrayToManipulate[maxElement2],
                                                  max(arrayToManipulate[maxElement1 + 1:])))

        # swap position for median
        (arrayToManipulate[maxElement1], arrayToManipulate[lengthOfTheArray // 2]) = (arrayToManipulate[lengthOfTheArray // 2],
                                                                                      arrayToManipulate[maxElement1])
        (arrayToManipulate[maxElement2], arrayToManipulate[lengthOfTheArray // 2 - 1]) = (arrayToManipulate[lengthOfTheArray // 2 - 1],
                                                                                          arrayToManipulate[maxElement2])
       
    # when size of array is odd
    else:
        maxElement = arrayToManipulate.index(max(arrayToManipulate))
        (arrayToManipulate[maxElement], arrayToManipulate[lengthOfTheArray // 2]) = (arrayToManipulate[lengthOfTheArray // 2],
                                                                                     arrayToManipulate[maxElement])


        # print the resultant array
    for anyIndex in range(0, lengthOfTheArray):
       print(arrayToManipulate[anyIndex], end=" ")

arrayToManipulate = [8, 4, 6, 3, 10, 7]
lengthOfTheArray = len(arrayToManipulate)
getMaximizedMedian(arrayToManipulate, lengthOfTheArray)


