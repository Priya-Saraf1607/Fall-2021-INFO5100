package edu.northeastern.priya;


public class ConstructString {

    public static boolean IsSubtring(String ransomNote, String magazine) {

        if (magazine.contains(ransomNote))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        boolean result = IsSubtring("a", "b");
        System.out.println(result);

        boolean result1 = IsSubtring("aa", "ab");
        System.out.println(result1);

        boolean result2 = IsSubtring("aa", "aab");
        System.out.println(result2);
    }
}
