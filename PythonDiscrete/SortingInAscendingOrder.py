# take three numbers and sort them in ascending order

print("Enter first number: ")
first = int(input())
print("Enter second number: ")
second = int(input())
print("Enter third number: ")
third = int(input())
outputOne = 0
outputTwo = 0
outputThree = 0

if((first <= second) and (second <= third)):
    outputOne = first
    outputTwo = second
    outputThree = third
elif((first <= third) and (third <= second)):
    outputOne = first
    outputTwo = third
    outputThree = second
elif((second <= first) and (first <= third)):
    outputOne = second
    outputTwo = first
    outputThree = third
elif((second <= third) and (third <= first)):
    outputOne = second
    outputTwo = third
    outputThree = first
elif((third <= first) and (first <= second)):
    outputOne = third
    outputTwo = first
    outputThree = second
else:
    outputOne = third
    outputTwo = second
    outputThree = first

print("The numbers in ascending order: " + str(outputOne) + ", "
      + str(outputTwo) + ", and " + str(outputThree))

