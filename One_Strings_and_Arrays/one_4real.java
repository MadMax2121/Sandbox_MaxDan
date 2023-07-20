package One_Strings_and_Arrays;
/*x
Palindrome Permutation: Given a string, write a function to check if 
it is a permutation of a palin­drome. A palindrome is a word or 
phrase that is the same forwards and backwards. A permutation 
is a rearrangement of letters. The palindrome does not need to be
limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat", "atco eta", etc.)
*/

public class one_4real {
    public static void main(String args[]) { //type psvm to shortcut
        String input = "taco cat";
        char str[] = input.toCharArray();
        int n = str.length;
        findPermutations(0, str, 0, n);    
    }
    // Returns true if str[curr] does not matches with any of the
    // characters after str[start]
    static boolean shouldSwap(char str[], int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (str[i] == str[curr]) {
                return false;
            }
        }
        return true;
    }
    // Prints all distinct permutations in str[0..n-1]
    static void findPermutations(int checker, char str[], int index, int n) {
        if (index >= n) {
            if (isPalindrome(str)) {
                if (checker == 0) {
                    System.out.print("True (permutations: ");
                    checker++;
                }
                System.out.print("\"");
                System.out.print(str);
                System.out.println("\"");

            return;
        }
        return;  
        }
        for (int i = index; i < n; i++) {
            // Proceed further for str[i] only if it
            // doesn't match with any of the characters
            // after str[index]
            boolean check = shouldSwap(str, index, i);
            if (check) {
                swap(str, index, i);
                findPermutations(checker,str, index + 1, n);
                swap(str, index, i);
            }
        }
    }

    static void swap(char[] str, int i, int j) {
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
    }

    static boolean isPalindrome(char[] arr) {
        String str = "";
        for (char s : arr) {
            str += s;
        }
        str = str.replaceAll("\\s","");
        
        String new_str = "";
        for(int i = str.length() -1; i >= 0; i--) {
            new_str += str.charAt(i); 
        }

        return (str.compareTo(new_str) == 0);
    }
}

