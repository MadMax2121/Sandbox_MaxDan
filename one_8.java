import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class one_8 {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {0,5,6}, {7,8,0}};
        zeroOut(arr);

    }

    public static void zeroOut(int[][] myArray){
        ArrayList<Integer> rowsToZero = new ArrayList<Integer>();
        ArrayList<Integer> columnsToZero = new ArrayList<Integer>();
    
        for(int i=0; i<myArray.length; i++) { // record which rows and columns will be zeroed
            for(int j=0; j<myArray[i].length; j++){
                if(myArray[i][j] == 0){
                    if(!rowsToZero.contains(i)) rowsToZero.add(i);
                    if(!columnsToZero.contains(j)) columnsToZero.add(j);
                }
            }
        }
        for(int row : rowsToZero){ // now zero the rows
            myArray[row] = new int[myArray.length];
        }
    
        for(int i=0; i<myArray.length; i++){
            for(int column: columnsToZero){ // now zero the columns
                myArray[i][column] = 0;
            }    
        }
        for (int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j] + " ");
        
            }
            System.out.println("");
        }
    }
}
