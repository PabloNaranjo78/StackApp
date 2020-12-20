package cr.ac.tec.stackapp.stack;

public class Node {

    public int num;
    public Node prevNum;

    /***
     * Nodo para un stack
     * @param num el número a agregar
     */
    public Node(int num) {
        this.num = num;
        this.prevNum = null;
    }
}
