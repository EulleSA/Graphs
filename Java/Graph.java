
// Undirected Graph

public class Graph{
    private boolean adjMatrix[][];
    private int numVertix;

    public Graph(int numVertix){
        this.numVertix = numVertix;
        adjMatrix = new boolean[numVertix][numVertix];
    }

    public void addEdge(int from,int to){
        adjMatrix[from][to] = true;
        adjMatrix[to][from] = true;
    }

    public boolean isEdge(int from,int to){
        return adjMatrix[from][to];
    }

}