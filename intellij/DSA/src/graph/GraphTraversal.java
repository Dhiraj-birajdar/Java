package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphTraversal {
    public static void main(String[] args) {
        char[][] graph = {{'a','b'},{'a','c'},{'b','d'},{'c','e'},{'d','f'}};
        System.out.println(toAdjacency(graph));
    }

    public static void Dfs(){

    }

    public static Map<Character, List<Character>> toAdjacency(char[][] graph){
        Map<Character,List<Character>> map = new HashMap<>();
        for (char[] edge:graph) {
            map.computeIfAbsent(edge[0],e-> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1],e-> new ArrayList<>()).add(edge[0]);
        }
        return map;
    }
}
