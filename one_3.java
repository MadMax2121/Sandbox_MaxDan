/*
Write a method to replace all spaces in a string with 
'%20'. You may assume that the string has sufficient space at the 
end to hold the additional characters,and that you are given the "true" length of the string. 
(Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith" Hints: #53, #118
*/
public class one_3 {
    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    ", 13));
        System.out.println(urlify("doosh woosh  ", 11));
    }


    static char[] urlify (String str, int size) {
        char[] arr = str.toCharArray();  
        char[] arr2 = new char[arr.length];

        for (int i = 0, j = 0; j < arr.length; i++, j++) {

            if (!Character.isWhitespace(arr[i])) {
                arr2[j] = arr[i];  

            }
            else {
                arr2[j] = '%';
                arr2[j+1] = '2';
                arr2[j+2] = '0';
                j += 2;
            }
        }
        
        return arr2;
    } 
    }   
