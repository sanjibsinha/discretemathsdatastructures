import 'dart:math';
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
  DisplayLargestInDescendingOrder(myNumbers, lengthOfArray);

}

void DisplayLargestInDescendingOrder(List<int> myNumbers, int lengthOfArray){
  int first = 0;
  int second = 0;
  int third = 0;

  if(((first.isInfinite != false) && (second.isInfinite != false)) && third.isInfinite != false){
    print("Three largest elements in descending order: $first, $second and $third");
  } else {
    for(int i = 0; i < myNumbers.length; i++){
      if(myNumbers[i] > first){
        third = second;
        second = first;
        first = myNumbers[i];
      }
      else if(myNumbers[i] > second){
        third = second;
        second = myNumbers[i];
      }
      else if(myNumbers[i] > third){
        third = myNumbers[i];
      }
    }
    print("Three largest elements in descending order: $first, $second and $third");
  }
}