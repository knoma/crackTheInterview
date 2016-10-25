package Chapter4;

/**
 * Created by knoma on 10/23/16.
 */
public class Graph {


    public static int MAX_VERTICES = 6;

    private Node vertices[];
    public int count;

    public Graph() {
        vertices = new Node[MAX_VERTICES];
        count = 0;
    }

    public void addNode(Node x){
        if (count < vertices.length){
            vertices[count] = x;
            count++;
        } else {
            System.out.println("Graph fill");
        }
    }

    public Node[] getNodes() {
        return vertices;
    }
}
