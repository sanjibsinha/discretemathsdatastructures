# finding greatest common divisor by two different methods

def GCDOne(numOne, numTwo):
    if(numTwo == 0):
        return numOne
    else:
        temp = numOne % numTwo
        return GCDOne(numTwo, temp)


def GCDTwo(num1, num2):
    if(num2 == 0):
        return num1
    elif(num1 > num2):
        return GCDTwo((num1 - num2), num2)
    else:
        return GCDTwo((num2 - num1), num1)


print(GCDOne(1071, 462))
print(GCDTwo(1071, 462))


