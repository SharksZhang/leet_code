package courseschedule;

import java.util.*;

public class Solution1 {
    List<List<Integer>> graph;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 如果有环则说明失败。
        //1. 使用 List<List<>> 可以表示图。
        //2. 判断图有环， 深度优先遍历图，使用状态记录每个节点的状态，0.表示未遍历，1.表示正在遍历 2.表示该节点已被遍历
        //   当正在遍历时再次被遍历，则表示有环。当发现有换时，整个函数返回
        graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new LinkedList<>());
        }

        for(int i = 0; i< prerequisites.length; i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        ArrayList<Integer> visit = new ArrayList<>(Collections.nCopies(numCourses, 0));
        for(int i =0; i<numCourses; i ++){
            if(visit.get(i) != 2){
                if(!dfs(i, visit)){
                    return false;
                }
            }
        }
        return true;

    }

    public boolean dfs(int cur, ArrayList<Integer> visit){
        if(visit.get(cur) == 1){
            return false;
        }
        if(visit.get(cur) == 2){
            return true;
        }
        visit.set(cur, 1);
        for(int i =0;i < graph.get(cur).size(); i++){
             if(!dfs(graph.get(cur).get(i), visit)){
                 return false;
             }
        }
        visit.set(cur, 2);
        return true;
    }
}
