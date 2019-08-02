package courseschedule;

import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, GraphNode> graph = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (!graph.containsKey(prerequisite[0])) {
                graph.put(prerequisite[0], new GraphNode(prerequisite[0]));
            }
            if (!graph.containsKey(prerequisite[1])) {
                graph.put(prerequisite[1], new GraphNode(prerequisite[1]));
            }

            GraphNode currentNode = graph.get(prerequisite[0]);
            GraphNode neighborNode = graph.get(prerequisite[1]);
            currentNode.neighbors.add(neighborNode);

        }
        boolean dfs = dfs(graph);
        return dfs;


    }

    public boolean dfs(HashMap<Integer, GraphNode> graph) {
        for (GraphNode value : graph.values()) {

            if (!dfsTraverse(value, new HashSet<>())) {
                return false;
            }
        }
        return true;
    }

    public boolean dfsTraverse(GraphNode graphNode, HashSet<GraphNode> visit) {
        if (visit.contains(graphNode)) {
            return  false;
        }
        visit.add(graphNode);
        for (GraphNode neighbor : graphNode.neighbors) {
            if (!dfsTraverse(neighbor, visit)) {
                return false;
            }
        }
        visit.remove(graphNode);
        return true;
    }
}

class GraphNode {
    int label;
    LinkedList<GraphNode> neighbors;

    public GraphNode(int label) {
        this.label = label;
        this.neighbors = new LinkedList<>();
    }
}
