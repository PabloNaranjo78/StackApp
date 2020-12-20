package cr.ac.tec.stackapp.stack;

public class Stack {

    public Node node;

    /***
     * Constructor del stack
     */
    public Stack(){
        this.node = null;
    }

    /***
     * Añade un elemento a la pila
     * @param num
     */
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

    /***
     * Elimina un elemento de la pila
     */
    public void pop(){
        this.node = this.node.prevNum;
    }

    /***
     * Toma y retorna el elemento del tope de la pila
     * @return un entero con el número que tiene este nodo
     */
    public int peek(){
        return this.node.num;
    }

}
