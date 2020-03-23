void main(){
  
  int countNodes(NodeClass start){
    int count = 0;
    NodeClass currentPosiion = start;
    while(currentPosiion.next != null){
      currentPosiion = currentPosiion.next;
      count = count + 1;
    }
    return count;
  }

  var nodeOne = NodeClass(10);
  print("The value of node 1 is - ${nodeOne.data} and the count is ${countNodes(nodeOne)}");
  var nodeTwo = NodeClass(12);
  nodeOne.next = nodeTwo;
  print("The value of node 2 is - ${nodeTwo.data} and the count is ${countNodes(nodeOne)}");
  var nodeThree = NodeClass(122);
  nodeTwo.next = nodeThree;
  print("The value of node 3 is - ${nodeThree.data} and the count is ${countNodes(nodeOne)}");
  var nodeFour = NodeClass(1122);
  nodeThree.next = nodeFour;
  print("The value of node 4 is - ${nodeFour.data} and the count is ${countNodes(nodeOne)}");
  var nodeFive = NodeClass(1226);
  nodeFour.next = nodeFive;
  print("The value of node 5 is - ${nodeFive.data} and the count is ${countNodes(nodeOne)}");
}

class NodeClass{
  int data;
  NodeClass next;
  NodeClass(int data){
    this.data = data;
  }
}

/*
The value of node 1 is - 10 and the count is 0
The value of node 2 is - 12 and the count is 1
The value of node 3 is - 122 and the count is 2
The value of node 4 is - 1122 and the count is 3
The value of node 5 is - 1226 and the count is 4
 */