package insertionsort;

public class wk1dq2 {
//function to sort array with insertion sort
	void sort(int array[]) {
		int p = array.length;
		for (int i = 1; i < p; ++i) {
			int run = array[i];
			int j = i - 1;

			/*
			 * Move elements of array, that are greater than run, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && array[j] > run) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = run;
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int array[]) {
		int p = array.length;
		for (int i = 0; i < p; ++i)
			System.out.print(array[i] + " ");

		System.out.println();
	}

	// Driver
	public static void main(String args[]) {
		int array[] = { 62, 15, 1, 22, 10, 54, 85, 6 };

		System.out.println("Unsorted array");
		printArray(array);

		wk1dq2 ob = new wk1dq2();
		ob.sort(array);

		System.out.println("Sorted array using Insertion sort.");
		printArray(array);
	}
}