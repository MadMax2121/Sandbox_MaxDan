package One_Strings_and_Arrays;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        
        table.put(100, "max");
        table.put(201, "dan");
        table.put(103, "mike");
        table.put(104, "jason");
        table.put(105, "courtney");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
            System.out.println("\n");


        Hashtable<String, String> table_string = new Hashtable<>(10);
        
        table_string.put("100", "max");
        table_string.put("201", "dan");
        table_string.put("103", "mike");
        table_string.put("104", "jason");
        table_string.put("105", "courtney");

        for (String key : table_string.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table_string.get(key));
        }
    }
}