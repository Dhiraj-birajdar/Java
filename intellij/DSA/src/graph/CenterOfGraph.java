package graph;

import java.util.*;
import java.util.function.Function;

public class CenterOfGraph {
    public static void main(String[] args) {
int[][] edgeList = { {1, 2}, {2, 3}, {4, 2} };
        System.out.println(findCenter(edgeList));
        
    }

    static public int findCenter(int[][] edges) {

        // edge pair to adjacency list
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        for (int[] edge: edges){
//            map.computeIfAbsent(edge[0], i-> new ArrayList<Integer>()).add(edge[1]);
//            map.computeIfAbsent(edge[1], i-> new ArrayList<Integer>()).add(edge[0]);
//        }
//        System.out.println(map);

        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }
}
