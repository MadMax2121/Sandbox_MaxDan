/*
Palindrome Permutation: Given a string, write a function to check if 
it is a permutation of a palin­drome. A palindrome is a word or 
phrase that is the same forwards and backwards. A permutation 
is a rearrangement of letters. The palindrome does not need to be
limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)
*/

public class one_4 {
    public static void main(String args[]) { //type psvm to shortcut
        String input = "taco cat";
        System.out.println(isPalindrome(input));
        System.out.println(input);
        permutations("", input);
        
    }


    static void permutations(String processed, String un_processed) {
        if (un_processed.isEmpty() && isPalindrome(processed)) {
    
            System.out.println(processed);
            return;
        }

        char ch = un_processed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0,i);
            String s = processed.substring(i, processed.length());
            permutations(f + ch + s, un_processed.substring(1));
        }
        
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s","");
        System.out.println(str);
        String new_str = "";
        for(int i = str.length() -1; i >= 0; i--) {
            new_str += str.charAt(i); 
        }
        System.out.println(new_str);
        return (str.compareTo(new_str) == 0);
    }


}
