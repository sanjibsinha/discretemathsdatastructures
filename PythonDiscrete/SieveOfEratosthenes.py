# Sieve Of Eratosthenes

def SieveOfEratosthenes(rangeOfNumbers):
    # let us create a boolean array "primeArray[...]" that takes a range of any numbers
    # next we initialize the array with the entries as true
    # now if primeArray[anyNUmber] is false if it is not prime, else the number is prime
    # the startingNumber is 2, because 1 is not prime
    primeArray = [True for anyNumber in range(rangeOfNumbers + 1)]
    # we have added 1 with the rangeOfNumbers, so that the endNumber is included
    startingNUmber = 2
    while (startingNUmber * startingNUmber <= rangeOfNumbers):
        # logically if primeArray[startingNumber] is not changed, then it is a prime
        # in fact, 2 is prime
        if (primeArray[startingNUmber] == True):
            # all multiples of startingNumber is not prime
            # the factors of the multiples are greater than 2
            for anyNumber in range(startingNUmber * 2, rangeOfNumbers + 1, startingNUmber):
                # in such cases, those numbers are not prime
                primeArray[anyNumber] = False
        startingNUmber += 1
    primeArray[0] = False
    primeArray[1] = False
    # now we can print all prime numbers belonging to that range of numbers
    for startingNUmber in range(rangeOfNumbers + 1):
        if primeArray[startingNUmber]:
            print(startingNUmber)

SieveOfEratosthenes(20)