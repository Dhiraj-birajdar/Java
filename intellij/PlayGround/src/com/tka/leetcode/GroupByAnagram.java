package com.tka.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAnagram {

    	public static void main(String[] args) {
		List<List<String>> lls = GroupByAnagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
		lls.forEach(System.out::println);

	}

	static public List<List<String>> groupAnagrams(String[] strs) {
//	    Map<String, List<String>> m = Arrays.asList(strs)
//	    .stream().collect(Collectors.groupingBy(s->{char[] a =s.toCharArray(); Arrays.sort(a);return new String(a);},mapping(s->) ));

        Map<String, List<String>> m = Arrays.asList(strs)
                .stream().collect(Collectors.groupingBy(s->{
                    char[] a =s.toCharArray();
                    Arrays.sort(a);
                    return new String(a);
                }));

        return new ArrayList<>(m.values());

    }
}
