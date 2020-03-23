void main(){
  var alisa = Person("Alica");
  var john = Person("John");

  alisa.isFollowing(john);
  john.isNotFollowing(alisa);
}

class Person{
  String name;
  Person friend;
  Person(String name){
    this.name = name;
  }
  void isFollowing(Person friend){
    this.friend = friend;
    print("${name} is following ${friend.name}");
  }
  void isNotFollowing(Person friend){
    this.friend = friend;
    print("${name} is not following back ${friend.name}");
  }
}
