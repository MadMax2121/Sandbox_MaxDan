package One_Strings_and_Arrays;
public class one_9 {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
    
        String new_str = str2 + str2;
        if(new_str.contains(str1)) {
            System.out.println("worked");
        }
        else {
            System.out.println("Did not work");
        }
    }

}
