package Chapter4;

import Libary.LinkedListNode;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.LinkedList;

import static Chapter4.Node.*;

/**
 * Created by knoma on 10/23/16.
 */
public class Chapter_4_1 {


    public static void main(String[] args) {
        Graph g = createNewGraph();
        Node[] n = g.getNodes();


        Node start = n[3];
        Node end = n[5];

        System.out.println(searchFDS(g,start,end));
        System.out.println(searchBFS(g,start,end));
    }

    private static boolean searchFDS(Graph g, Node current, Node target){

        if(current == null || target == null) return false;

        if(current == target) return true;
        current.state = State.Visited;

        for (Node node : current.getAdjacent()) {
            if (node.state !=State.Visited && searchFDS(g, node, target)) return true;
        }

        return false;
    }

    private static boolean searchBFS(Graph g, Node start, Node end) {


        for (Node node : g.getNodes()) {
            node.state = State.Unvisited;
        }

        start.state = State.Visiting;

        LinkedList<Node> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()){
            Node node = q.removeFirst();
            if(node !=null){
                for (Node v : node.getAdjacent()) {
                    if (v == end) return true;
                    else {
                        v.state = State.Visited;
                        q.add(v);
                    }
                }
            }
        }


        return false;
    }


    private static Graph createNewGraph() {
        Graph graph = new Graph();
        Node[] tmp = new Node[6];


        tmp[0] = new Node("a", 3);
        tmp[1] = new Node("b", 0);
        tmp[2] = new Node("c", 0);
        tmp[3] = new Node("d", 1);
        tmp[4] = new Node("e", 1);
        tmp[5] = new Node("f", 0);

        tmp[0].addAdjacent(tmp[1]);
        tmp[0].addAdjacent(tmp[2]);
        tmp[0].addAdjacent(tmp[3]);
        tmp[3].addAdjacent(tmp[4]);
        tmp[4].addAdjacent(tmp[5]);

        for (int i = 0; i < 6; i++) {
            graph.addNode(tmp[i]);
        }
        return graph;
    }
}
