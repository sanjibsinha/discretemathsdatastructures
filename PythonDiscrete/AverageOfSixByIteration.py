# we will compute average of six numbers by iteration using while loop

totalNumberToCompute = 6

# since number of iteration yet to be taken
numberOfIteration = 0
# we have not got the total addition of all numbers
total = 0.00
print("Please enter " + str(totalNumberToCompute) + " numbers : ")
print()

while(numberOfIteration < totalNumberToCompute):
    value = 0.00
    value = float(input())
    total += value
    numberOfIteration += 1

averageOfSixNumbers = 0.00
averageOfSixNumbers = total / numberOfIteration
print("The average of six numbers is : " + str(averageOfSixNumbers))

