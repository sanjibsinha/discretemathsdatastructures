void main(){
  growableList();
}

Function growableList(){
  //1. method
  List<String> names = List();
  names.add("Mana");
  names.add("Babu");
  names.add("Gopal");
  names.add("Pota");
  //there are two methods to capture the list
  print("-----------");
  //1. method
  names.forEach((v) => print('${v}'));
  print("-----------");
  //2. method
  for(int i = 0; i < names.length; i++){
    print(names[i]);
  }
}

/*
Growable Lists are dynamic in nature. We can dynamically add any number of elements
 and we can also remove it by a simple method: ‘ names.remove(“any name”)’.
 We can also use the key; as this ordered list starts from 0. So we can remove the
  first name just by passing this key value: ‘ names.removeAt(0)’.
  We use the ‘removeAt(key)’ method for that operation. We can also clear the Lists just
   by typing: ‘ names.clear()’.
 */