/*
The list is a simple ordered group of objects. Creating
 a List seems easy because Dart core libraries have the necessary support
 and a List class. There are two types of Lists.
 */
void main(){
  listFunction();
}

int listFunction(){
  List<int> nameOfTest = List(3);
  nameOfTest[0] = 1;
  nameOfTest[1] = 2;
  nameOfTest[2] = 3;
  //there are three methods to capture the list
  //1. method
  for(int element in nameOfTest){
    print(element);
  }
  print("-----------");
  //2. method
  nameOfTest.forEach((v) => print('${v}'));
  print("-----------");
  //3. method
  for(int i = 0; i < nameOfTest.length; i++){
    print(nameOfTest[i]);
  }
}