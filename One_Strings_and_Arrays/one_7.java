package One_Strings_and_Arrays;
public class one_7 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        for (int c = 0; c < arr[0].length; c++) {
            for (int r = arr.length-1; r >= 0; r--) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
       
    }
}
