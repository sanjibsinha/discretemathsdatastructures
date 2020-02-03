# we are to find the probability of finding an element in an array
# it depends on two factors

# Probability = number of favorable outcome / number of possible outcomes
# number of possible outcomes is the length of the array
# number of favourable outcome is the total number of the element in the list
# Probability = total number of the element present / size or length of the array.

# define the function to find the probability
def findTheProbability(theArray, theLenghtOfArray, theElement):
    count = theArray.count(theElement)

    # find probability up to 4 decimal places
    return round(count / theLenghtOfArray, 4)

theArrayVariable = [45, 22, 62, 72, 82, 92, 122]
theElementToFind = 22
theLenghtOfTheArrayVariable = len(theArrayVariable)

print(findTheProbability(theArrayVariable, theLenghtOfTheArrayVariable, theElementToFind))
