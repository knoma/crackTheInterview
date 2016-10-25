package Chapter4;

/**
 * Created by knoma on 10/23/16.
 */
public class Node {

    public enum State {
        Unvisited, Visited, Visiting;
    }

    private Node adjacent[];
    public int adjacentCount;
    private String vertex;

    public State state = State.Unvisited;

    public Node(String vertex, int adjacentLength) {
        this.vertex  = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node x){
        if (adjacentCount < adjacent.length){
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent con be added");
        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
