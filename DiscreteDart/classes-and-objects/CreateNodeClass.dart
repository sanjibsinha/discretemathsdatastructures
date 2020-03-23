void main(){
  // list.insertNode(node)
  var node = NodeClass();
  var lists = ListsLinked(node);
  lists.insertData(10, 101);
  lists.insertData(20, 201);
  lists.insertData(30, null);
}

class NodeClass{
  int data;
  int address;
}

class ListsLinked{
  NodeClass first;
  ListsLinked(NodeClass node){
    this.first = node;
  }

  void insertData(int data, int address){
    this.first.data = data;
    this.first.address = address;
    print("${data} and ${address}");
  }

}