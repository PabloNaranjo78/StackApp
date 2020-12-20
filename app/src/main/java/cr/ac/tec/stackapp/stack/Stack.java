package cr.ac.tec.stackapp.stack;

public class Stack {

    public Node node;

    public Stack(){
        this.node = null;
    }

    public void push(int num){
        if (this.node == null){
            this.node = new Node(num);
        }
        else{
            Node newNode = new Node(num);
            newNode.prevNum = this.node;
            this.node = newNode;
        }
    }

    public void pop(){
        this.node = this.node.prevNum;
    }

    public int peek(){
        return this.node.num;
    }

}
