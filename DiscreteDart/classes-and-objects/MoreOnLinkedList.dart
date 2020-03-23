void main(){

  var list = LinkingList();
  list.insertData(10);
  list.showData();
  list.insertData(100);
  list.insertData(1000);
  list.insertData(10000);
  list.insertData(100000);
  list.insertData(1000000);
  list.insertData(10000000);
  list.insertData(100000000);
}

class NodeClass{
  int data;
  NodeClass next;
}

class LinkingList{
  /*
  this class will insert data into the lists
  and show the data as well
   */
  /*
  if our list is empty, the starting point of node, we will call it head, is null
  however, if the list has at least one value the head is not null
   */
  NodeClass head;

  void insertData(int data){
    var node = NodeClass();
    node.data = data;
    // at the beginning
    node.next = head;
    if(head == null){
      head = node;
    } else {
      NodeClass currentPosition = head;
      while(currentPosition.next != null){
        currentPosition.next = node;
      }
      // we take the last value added and print it out
      print("One value is added to the list. ${node.data}");
    }
  }
  void showData(){
    NodeClass node = head;
    // this method will work when the first value is added
    if(head == null){
      print("No value has been added in the list. It is empty.");
    } else {
      print("One value is added to the list: ${node.data}");
    }
  }
}
