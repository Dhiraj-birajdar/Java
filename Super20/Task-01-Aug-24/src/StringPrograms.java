import java.util.stream.Collectors;

public class StringPrograms {
    public static void main(String[] args) {
        printVowels("abcdef");
        System.out.println(maxString("bbca","azzzbca"));
        System.out.println(reverseString("abcd"));
        System.out.println(isPalindrome("aba"));
        System.out.println(areAnagrams("➡️❌😵", "❌➡️😵"));
    }

    //Q31. print Vowels from given String.
    public static void printVowels(String s) {
        for (char c : s.toCharArray())
            if (String.valueOf(c).matches("[aeiou]"))
                System.out.print(c + ", ");
        System.out.println();
    }

    //Q32. compare the both of String which is Max.
    public static String maxString(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            if(s1.charAt(i)==s2.charAt(i))
                continue;
            if(s1.charAt(i)>s2.charAt(i))
                return s1;
            else
                return s2;
        }
        return s1.length()>s2.length()?s1:s2;
//        return s1.compareTo(s2)>0?s1:s2;
    }

    //Q33. reverse the String
    public static String reverseString(String s) {
        String reverse = "";
        for (char c : s.toCharArray())
            reverse = c + reverse;
        return reverse;
    }

    //Q34. check given string is pallindrome or not.
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }

    //Q35, check given both string are anagram String or not.
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        var map = (s1+s2).chars().boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        for (int c : map.keySet()) {
            if (map.get(c) % 2 == 1)
                return false;
        }
        return true;
    }
}
