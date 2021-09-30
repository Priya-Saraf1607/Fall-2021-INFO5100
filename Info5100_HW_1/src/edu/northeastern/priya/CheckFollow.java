package edu.northeastern.priya;

public class CheckFollow {

    public static boolean followCheck(String str) {

        if (Character.isDigit(str.charAt(0))) {
            //odd is digit
            for (int i = 1; i < str.length(); i = i + 2) {
                if (Character.isAlphabetic(str.charAt(i)))
                    continue;
                else
                    return true;
            }

            //even char are characters
            for (int i = 0; i < str.length(); i = i + 2) {
                if (Character.isDigit(str.charAt(i)))
                    continue;
                else
                    return true;
            }

            return false;
        } else {
            //odd is character
            for (int i = 1; i < str.length(); i = i + 2) {
                if (Character.isDigit(str.charAt(i)))
                    continue;
                else
                    return true;
            }

            //even char are digits
            for (int i = 0; i < str.length(); i = i + 2) {
                if (Character.isAlphabetic(str.charAt(i)))
                    continue;
                else
                    return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        boolean result = followCheck("A2bb2d4");
        System.out.println(result);

        boolean result2 = followCheck("1A3d4s5t");
        System.out.println(result2);
    }

}