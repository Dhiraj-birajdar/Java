package problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstUniqueCharMap {
    public static void main(String[] args) {
//        System.out.println(FirstUniqueCharMap.firstUniqChar("e1lloorlde"));
        System.out.println(FirstUniqueCharMap.canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }

    static public int firstUniqChar(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), -1);
            } else
                m.put(s.charAt(i), i);
        }
//        return IntStream.range(0, s.length()).boxed()
//                .collect(
//                        Collectors.toMap(
//                                i -> s.charAt(i),
//                                i -> i,
//                                (existing, replacement) -> -1,
//                                LinkedHashMap::new
//                        )
//                ).values().stream().filter(i -> i != -1).findFirst().orElse(-1);

        for(int i: m.values()){
            if(i!=-1)
                return i;
        }
        return -1;

    }
    static public boolean canConstruct(String ransomNote, String magazine) {
            if(magazine.length()<ransomNote.length()) return false;
       for (char c : magazine.toCharArray()) {
            ransomNote = ransomNote.replaceFirst(String.valueOf(c), "");
        }
        return ransomNote.isEmpty();
        

//       var r = ransomNote.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i, Collectors.counting()));
//       var m = magazine.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(i->i, Collectors.counting()));
//
//        System.out.println(r);
//        System.out.println(m);
//       for(char c: r.keySet()){
//           if(m.get(c)==null || m.get(c)<r.get(c))
//               return false;
//       }
//       return true;
    }
}
