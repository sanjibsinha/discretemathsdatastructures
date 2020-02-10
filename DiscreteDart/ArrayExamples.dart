// array in dart is known as List
// two types of List, they are index based
/*
fixed length : once defined cannot be changed
growable : length is dynamic
 */
void main(){
  List<int> myNumbers = List(5);
  myNumbers[0] = 1;
  myNumbers[1] = 2;
  myNumbers[2] = 3;
  myNumbers[3] = 4;
  myNumbers[4] = 5;

  // first method
  for(int element in myNumbers){
    print(element);
  }
  print("*****");

  //second method
  myNumbers.forEach((element) => print(element));
  print("*****");

  //third method
  for(int initializer = 0; initializer < myNumbers.length; initializer++){
    print(myNumbers[initializer]);
  }
}



