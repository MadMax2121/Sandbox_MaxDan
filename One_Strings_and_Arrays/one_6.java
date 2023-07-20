package One_Strings_and_Arrays;
/*
String Compression: Implement a method to perform basic string
compression using the counts of repeated characters. For example,
the string aabcccccaaa would become a2blc5a3. If the "compressed" 
string would not become smaller than the original string, your 
method should return the original string. You can assume the string has only uppercase
and lowercase letters (a - z).
*/
public class one_6 {
    public static void main(String[] args) {
        String str = "fffsssshhcjqq";
        String new_str = "";
        int counter = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                counter++;  
            } else {
                new_str += "" + str.charAt(i) + counter;
                counter = 1; 
            } 
        }
        new_str += "" + str.charAt(str.length()-1) + counter;
        
        if (new_str.length() < str.length()) {
            System.out.println(new_str);
        } else {
            System.out.println(str);
        }
    }
}
