void main(){
  List<int> myNumbers = List(7);
  myNumbers[0] = 100;
  myNumbers[1] = 2;
  myNumbers[2] = 23;
  myNumbers[3] = 4;
  myNumbers[4] = 15;
  myNumbers[5] = 155;
  myNumbers[6] = 1;
  int lengthOfArray = myNumbers.length;
  print("The array before left rotation by two elements: ${myNumbers}");
  print("The array after rotation.");
  rotateArrayLeft(myNumbers, 2, lengthOfArray);
  displayArray(myNumbers, lengthOfArray);
}

void rotateArrayLeft(List<int> myArray, int rotatingNumbers, int arrayLength){
  for(int i = 0; i < rotatingNumbers; i++){
    rotateLeftByOne(myArray, arrayLength);
  }
}

void rotateLeftByOne(List<int> myArray, int arrayLength){
  int temp = myArray[0], i;
  for (i = 0; i < arrayLength - 1; i++){
    myArray[i] = myArray[i + 1];
  }
  myArray[i] = temp;
}

void displayArray(List<int> myArray, int arrayLength){
  for(int i = 0; i < arrayLength; i++){
    print(myArray[i]);
  }
}