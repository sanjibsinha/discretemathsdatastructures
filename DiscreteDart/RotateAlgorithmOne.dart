void main(){

  List<int> anArray = List(4);
  anArray[0] = 1;
  anArray[1] = 2;
  anArray[2] = 3;
  anArray[3] = 4;
  print("The array before rotating by one element.");
  for(int element in anArray){
    print(element);
  }
  print("Rotating the array clockwise just by one element.");
  justRotate(anArray);

}

void justRotate(List<int> someArray){
  int x;
  int i;
  x = someArray.length;
  for(i = (someArray.length - 1); i > 0; i--){
    someArray[i] = someArray[i - 1];
  }
  someArray[0] = x;
  for(int element in someArray){
    print(element);
  }
}
