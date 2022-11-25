package HM8;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class splitt {

    public static void main(String[] args) {
        String line = "cat, dog, rabbit, cat, turtle, rabbit, humster, dog";
        parseMethod(line);
    }

    public static void parseMethod(String line) {
        String[] words = line.split(", ");
        Set<String> list = new HashSet<>(Arrays.asList(words));
        for (final String s : list) {
            System.out.println(firstUpperCase(s));
        }
    }

    public static String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) return ""; //или return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}


