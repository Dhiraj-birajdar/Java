package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CenterOfGraph {
    public static void main(String[] args) {
int[][] edgeList = { {1, 2}, {2, 3}, {4, 2} };
findCenter(edgeList);
    }

    static public int findCenter(int[][] edges) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] edge: edges){
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }
        System.out.println(map);
        return 1;
    }
}
