package Pro0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pro0 {

	// method to sort the array of Strings of size in ascending order using
	// selection sort
	public static void sort(String[] words, int size) {
		int columns = 0;
		int p;
		// loop over the array from index 0 to second last index
		for (int i = 0; i < size; i++) {
			p = i;
			// loop to get the with minimum string from index i+1 to end
			for (int j = i + 1; j < size; j++) {
				if (words[j].compareTo(words[p]) < 0)
					p = j;
			}

			if (p != i) // index i and p are not equal, swap the strings at index i and p
			{
				String temp = words[i];
				words[i] = words[p];
				words[p] = temp;
			}
			if (columns % 5 == 0) {
				System.out.println();
			}
			System.out.print(words[i] + " ");
			columns++;
		}
	}

	// method to search for a string ryan in array words using binary search
	public static int binarySearch(String[] words, String ryan, int size) {
		int l = 0, h = size - 1; // initialize low and high to first and last index of array words
		int m;
		// loop that continues until range is invalid or ryan is found
		while (l <= h) {
			m = (l + h) / 2; // get the middle index of range
			if (words[m].equals(ryan)) // ryan found
				return m;
			else if (words[m].compareTo(ryan) > 0) // string at mid > ryan, find ryan in left subarray
				h = m - 1;
			else // string at mid < ryan, find the ryan in right subarray
				l = m + 1;
		}

		return -1; // ryan not found
	}

	public static void main(String[] args) {

		// create an array of 10,000 strings
		String[] words = new String[10000];
		System.out.println("Unsorted List...");
		int list = 0;
		String word;
		File file = new File("text.txt"); // create a File object
		try {
			int columns = 0;
			// open the input file
			Scanner fileScan = new Scanner(file);
			// loop that continues until end of file is reached or 10,000 words have been
			// read
			while (fileScan.hasNext() && list < words.length) {
				word = fileScan.next(); // read the next word from file
				if (word.length() > 0) // word is not an empty string
				{
					words[list] = word; // store it 
					list++; // increment number of words
				}

				if (columns % 5 == 0) {
					System.out.println();
				}
				System.out.print(word + " ");
				columns++;
			}
			System.out.println("\n");
			System.out.println("\nSorted List...");
			fileScan.close(); // close the file
			sort(words, list); // sort the words in ascending order
			System.out.println();

			Scanner scan = new Scanner(System.in);

			// loop that continues to search for string until the user exits
			do {
				System.out.print("\nEnter a word to search(0 to exit): ");
				word = scan.next(); // input a word to search
				if (!word.equals("0")) // check if user wants to exit
				{
					int index = binarySearch(words, word, list); // get the index of word using binarySearch method
					if (index == -1) // word not found
						System.out.println(word + " was not found.");
					else // word found
						System.out.println(word + " was found at index: " + index);
				}
			} while (!word.equals("0"));
			System.out.println("Goodbye");
			scan.close();

		} catch (FileNotFoundException e) {
			System.err.println("Unable to open file: text.txt");
		}

	}

}