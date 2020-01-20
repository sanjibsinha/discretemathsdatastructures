print("hello")

numOne = 10
numTwo = 0

if(numTwo == 10 and (numOne / numTwo == 3)):
    print("It won't give any error!")
    # since the first condition is false, it won't execute the second one
    # it goes to the else bock
else:
    print("It didn't give any error because of short circuit evaluation!")

if(numTwo == 0 or (numOne / numTwo == 3)):
    print("It won't give any error!")
    # since the first condition is true, it won't execute the second one
else:
    print("It didn't give any error because of short circuit evaluation!")