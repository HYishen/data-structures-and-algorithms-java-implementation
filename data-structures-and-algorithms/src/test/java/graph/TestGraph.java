package graph;

import org.junit.Test;

/**
 * <pre>
 * Test graph。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class TestGraph {
    @Test
    public void testBfs() {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);
        graph.bfs(0, 6);
    }

    @Test
    public void testDfs() {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);
        graph.dfs(0, 6);
    }
}
