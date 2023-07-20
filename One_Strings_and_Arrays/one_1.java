package One_Strings_and_Arrays;
//This program checks wheter a string has all unique characters (ASCII)
// ASK INTERVIEWER IF THE INPUT STRING IS ASCII OR UNICODE
public class one_1  {
    public static void main(String[] args) {
        System.out.println(isUniqueChars("String"));
        System.out.println(isUniqueChars("LOLLLLL"));
        int value = '1'; // prints ascii value of character '1'
        System.out.println(value);
        

}


static boolean isUniqueChars(String str) {
    if (str.length() > 128) return false;

    boolean[] char_set = new boolean[128];
    for (int i= 0; i < str.length(); i++) {
    
    int val= str.charAt(i);

    if (char_set[val]) {//Already found this char in string
        return false;
    }

    char_set[val]= true;
}
    return true;
}
}

