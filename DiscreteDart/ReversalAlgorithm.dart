void main(){

  List<int> arrayOne = List(2);
  arrayOne[0] = 1;
  arrayOne[1] = 2;

  List<int> arrayTwo = List(2);
  arrayTwo[0] = 3;
  arrayTwo[1] = 4;

  /*
  arrayOne Union arrayTwo gives us : 1, 2, 3, 4
  suppose we call it arrayThree
  from arrayThree we want arrayTwo Union arrayOne, which gives us : 3, 4, 1, 2
  there are different solutions
  we can rotate arrayThree by 2 elements to get the same result
  we can also follow the following algorithm
   */

  List<int> arrayThree = List(4);
  arrayThree[0] = 1;
  arrayThree[1] = 2;
  arrayThree[2] = 3;
  arrayThree[3] = 4;

  print("The arrayThree is the union of arrayOne and arrayTwo and the output is : ${arrayThree.toString()}");

  int num = arrayThree.length;
  int element = 2;
  element = element % num;
  print("We are going to use reversal algorithm, so that arrayThree becomes "
      "the union of arrayTwo and arrayOne.");
  print("The new output is : ");
  rotatingLeft(arrayThree, element);
  displayReversedArray(arrayThree);

}

void reversingTheArray(List<int> arrayThree, int start, int end){
  while(start < end){
    int temp = arrayThree[start];
    arrayThree[start] = arrayThree[end];
    arrayThree[end] = temp;
    start += 1;
    end = end -1;
  }
}

void rotatingLeft(List<int> arrayThree, int element){
  int num = arrayThree.length;
  if(element != 0){
    reversingTheArray(arrayThree, 0, (element - 1));
    reversingTheArray(arrayThree, element, (num - 1));
    reversingTheArray(arrayThree, 0, (num - 1));
  } else {
    print("Wrong input");
  }
}

void displayReversedArray(List<int> arrayThree){
  for(int element in arrayThree){
    print(element);
  }
}

