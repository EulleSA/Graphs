public class Main{
    public static void main(String[] args){
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,1);
        g.addEdge(2,1);
        g.addEdge(2,2);
        
        System.out.println(g.isEdge(2,2));
    }
}