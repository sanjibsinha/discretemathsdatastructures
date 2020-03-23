package fun.sanjibsinha.datastructures;

public class NodeClass {

    private int dataElement;
    private NodeClass next;

    public NodeClass(){
        dataElement = 0;
        next = null;
    }

    public NodeClass(int dataInt){
        this.dataElement = dataInt;
        this.next = null;
    }

    public NodeClass(int dataElement, NodeClass node){
        this.dataElement = dataElement;
        this.next = node;
    }

    public void insertAfter(NodeClass node){
        NodeClass temporaryNode = this.next;
        this.next = node;
        node.next = temporaryNode;
    }

    public NodeClass nextNode(){
        return this.next;
    }

    public void displayDataElement(){
        System.out.println(this.dataElement);
    }

}

