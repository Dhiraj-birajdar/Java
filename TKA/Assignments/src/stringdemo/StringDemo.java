package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        // Creating strings using literals
        String str1 = "Hello, ";
        String str2 = "World!";
        
        // Creating string using new keyword
        String str3 = new String("Hello, World!");

        // Creating string using new StringBuffer, StringBuilder
        StringBuffer stringBuffer = new StringBuffer("Hello"); 
        StringBuilder stringBuilder = new StringBuilder("World");

        // methods of StringBuffer and StringBuilder modifies original string
        stringBuffer.append(stringBuilder);  
        stringBuilder.replace(0, 5, str3);
          
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);     
        
        // Concatenating strings
        String result = str1 + str2;
        System.out.println("Concatenated String: " + result);

        // Finding the length of a string
        int length = result.length();
        System.out.println("Length of the String: " + length);

        // Accessing characters in a string
        char firstChar = result.charAt(0);
        char lastChar = result.charAt(length - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // Substring extraction
        String substring = result.substring(0, 5);
        System.out.println("Substring: " + substring);

        // String comparison
        String anotherString = "Hello, World!";
        boolean isEqual = result.equals(anotherString);
        System.out.println("Strings are equal: " + isEqual);

        // Case-insensitive comparison
        boolean isEqualIgnoreCase = result.equalsIgnoreCase(anotherString);
        System.out.println("Case-insensitive comparison: " + isEqualIgnoreCase);
 
        // Searching for a substring
        boolean contains = result.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Replacing characters in a string
        String replacedString = result.replace('o', 'X');
        System.out.println("Replaced String: " + replacedString);

        // Converting to uppercase and lowercase
        String upperCase = result.toUpperCase();
        String lowerCase = result.toLowerCase();
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
     }
}

