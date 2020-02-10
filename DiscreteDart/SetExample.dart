void main(){

  Set<String> names = Set.from(["Mana", "Babu", "Gopal"]);

  Set<int> phones = Set();
  phones.add(123456);
  phones.add(12345);
  phones.add(1234);
  phones.add(123);
  phones.add(12);

  for(int element in phones){
    print(element);
  }
  print("********");
  
  phones.forEach((element) => print(element));
}