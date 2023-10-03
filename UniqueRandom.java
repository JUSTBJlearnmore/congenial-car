
public class UniqueRandom {

	public static void main(String[] args) {

	}
	

	// insertion sort from textbook modified for integer array
	static void insertionSort(int[] list) {
	    for (int i = 1; i < list.length; i++) {
	        /** insert list[i] into a sorted sublist list[0..i-1] so that
	             list[0..i] is sorted. */
	        int currentElement = list[i];
	        int k;
	        for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
	          list[k + 1] = list[k];
	        }

	        // Insert the current element into list[k+1]
	        list[k + 1] = currentElement;
	    }
	}
	
	
	// linear search from textbook
	/** The method for finding a key in the list */	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

	// binary search from textbook
	/** Use binary search to find the key in the list */
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		
		return -low - 1; // Now high < low
	}

}
