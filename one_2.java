
// Java implementation of QuickSort
class one_2 {
	// A utility function to swap two elements
	static void swap(String str, int i, int j)
	{
        String middle;
		String start = str.substring(0, i);
        if (i != j) {
         middle = str.substring(i+1,j);
        } 
        else {
            middle = "";
        }
        if (j == str.length() - 1) {
            char end = str.charAt(j);
            str = start + str.charAt(j) + middle + str.charAt(i) + end;
        } else {
       
            String end = str.substring(j+1);
            str = start + str.charAt(j) + middle + str.charAt(i) + end;
        }
        System.out.println(str);
       
	}

	// This function takes last element as pivot,
	// places the pivot element at its correct position
	// in sorted array, and places all smaller to left
	// of pivot and all greater elements to right of pivot
	static int partition(String str, int low, int high)
	{
		// Choosing the pivot
		char pivot = str.charAt(high);

		// Index of smaller element and indicates
		// the right position of pivot found so far
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller than the pivot
			if (str.charAt(j) < pivot) {

				// Increment index of smaller element
				i++;
				swap(str, i, j);
			}
		}
		swap(str, i + 1, high);
		return (i + 1);
	}

	// The main function that implements QuickSort
	// arr[] --> Array to be sorted,
	// low --> Starting index,
	// high --> Ending index
	static void quickSort(String str, int low, int high)
	{
		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(str, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(str, low, pi - 1);
			quickSort(str, pi + 1, high);
		}
        //System.out.println(str);
	}
	// Driver Code
	public static void main(String[] args)
	{
		String first = "dbca";
        int N = first.length();
		// Function call
		quickSort(first, 0, N - 1);
		System.out.println("Sorted string:");
		System.out.println(first);
	}
}
 
// Distributed by Maxim Moskalenko and Daniel Araujo :D

