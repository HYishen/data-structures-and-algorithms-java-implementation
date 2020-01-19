package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <pre>
 * Graph, 无向图。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class Graph {
    /**
     * 顶点的个数
     */
    private int v;
    /**
     * 邻接表
     */
    private LinkedList<Integer>[] adj;

    public Graph(int v) {
        this.v = v;
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    /**
     * <pre>
     * 无向图一条边存两次。
     * </pre>
     *
     * @return void
     * @Param [s, t]
     */
    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }

    /**
     * <pre>
     * 广度优先搜索（Breadth-First-Search）。
     * </pre>
     *
     * @return void
     * @Param [s, t]
     */
    public void bfs(int s, int t) {
        if (s == t) {
            return;
        }
        boolean[] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int[] prev = new int[v];
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        while (!queue.isEmpty()) {
            int w = queue.poll();
            for (int i = 0; i < adj[w].size(); i++) {
                int q = adj[w].get(i);
                if (!visited[q]) {
                    prev[q] = w;
                    if (q == t) {
                        print(prev, s, t);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }

    /**
     * <pre>
     * 深度优先搜索（Depth-First-Search）。
     * </pre>
     *
     * @return void
     * @Param [s, t]
     */
    public void dfs(int s, int t) {
        boolean[] found = new boolean[1];
        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        for (int i = 0; i < prev.length; i++) {
            prev[i] = -1;
        }
        recurDfs(s, t, visited, prev, found);
        print(prev, s, t);
    }

    private void recurDfs(int w, int t, boolean[] visited, int[] prev, boolean[] found) {
        visited[w] = true;
        if (w == t) {
            found[0] = true;
            return;
        }
        for (int i = 0; i < adj[w].size() && !found[0]; i++) {
            int q = adj[w].get(i);
            if (!visited[q]) {
                prev[q] = w;
                recurDfs(q, t, visited, prev, found);
            }
        }
    }

    /**
     * <pre>
     * 递归打印s->t的路径。
     * </pre>
     *
     * @return void
     * @Param [prev, s, t]
     */
    private void print(int[] prev, int s, int t) {
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.print(t + " ");
    }
}
