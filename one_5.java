// One Away: There are three types of edits that can be performed on strings:
// insert a character, remove a character, or replace a character. Given 
// two strings, write a function to check if they are one edit (or zero edits) away.

public class one_5 {
    public static void main(String[] args) {
        System.out.println("pale, pal -> " + oneAway("pale","pal"));
        System.out.println("bane, pale -> " + oneAway("bane","pale"));
        System.out.println("pale, bale -> " + oneAway("pale","bale"));
        System.out.println("pale, bake -> " + oneAway("pale","bake"));
    }

    static boolean oneAway(String str1, String str2) {
        int comparator = 0;
        if (str1.length() > str2.length() || str1.length() == str2.length()) {
            comparator = str1.length() - 1;
        }
        else if (str2.length() > str1.length()) {
            comparator = str2.length() - 1;
        }
        boolean[] char_set1 = new boolean[128];
        boolean[] char_set2 = new boolean[128];

        for (int i = 0; i < str1.length(); i++) {
            int val= str1.charAt(i);
            char_set1[val]= true;
        }


        for (int i = 0; i < str2.length(); i++) {
            int val= str2.charAt(i);
            char_set2[val]= true;
        }
        
        int match = 0;
        for (int i = 0; i < 128; i++){   
            if (match >= comparator) {
                return true;
            }
            if (char_set1[i] == true && char_set2[i] == true) {
                match++;
            }
        }
        return false;
    }
}
