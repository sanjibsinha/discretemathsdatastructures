package fun.sanjibsinha.datastructures;

public class DisplayLinkedList {

    public static void main(String[] args) {

        NodeClass headNode;
        NodeClass nextNodeOne;
        NodeClass nextNodeTwo;
        NodeClass nextNodeThree;
        NodeClass currentNode;

        headNode = new NodeClass(10);

        nextNodeOne = new NodeClass(120);
        headNode.insertAfter(nextNodeOne);

        nextNodeTwo = new NodeClass(1200);
        nextNodeOne.insertAfter(nextNodeTwo);

        nextNodeThree = new NodeClass(12000);
        nextNodeTwo.insertAfter(nextNodeThree);

        currentNode = headNode;
        while (currentNode != null){
            currentNode.displayDataElement();
            currentNode = currentNode.nextNode();
        }
    }
}

