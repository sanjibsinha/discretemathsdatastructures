/*
unordered collection of key=>value pair
key can be int, value can be String; or, vice-versa
key should be unique; cannot be repeated
value can be repeated

it is also called hash or dictionary
size is not fixed, it can dynamically changed

hashMap is the implementation by hash table
 */

void main(){
  //first method of declaration
  Map<int, String> phonesAndNames = Map();
  phonesAndNames[123456] = "Babu";
  phonesAndNames[12345] = "Mana";
  phonesAndNames[1234] = "John";

  print(phonesAndNames[1234]);

  for(var key in phonesAndNames.keys){
    print(key);
  }
  for(String value in phonesAndNames.values){
    print(value);
  }
  phonesAndNames.forEach((key, value) => print("Key: $key and Value: $value"));

  //second method of declaration
  Map<String, int> studentMarks = {
    "Babu" : 63,
    "Mana" : 65,
    "John" : 85
  };


}