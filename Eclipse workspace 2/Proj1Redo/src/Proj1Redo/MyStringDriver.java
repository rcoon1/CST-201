package Proj1Redo;

public class MyStringDriver {

	public static void main(String[] args) {
		MyString s1 = new MyString("'Jack Johnson'");
		// creating a MyString object
		MyString s2 = new MyString("'Bilbo Baggins'");
		// creating a MyString object
		MyString s3 = s1;

        // toString method
		System.out.println("s1 - " + s1);
		System.out.println("s2 - " + s2);

		// .length() method
		System.out.println("The length of s1 is: " + s1.length());
		System.out.println("The length of s2 is: " + s2.length());

		// concat() method
		System.out.println("My Concat string is: " + s1.concatString(s2));

		// equals() method

		System.out.println("Do my two strings equal each other? " + s2.equals(s3));

		// compareto() method
		int comparedValue = s1.compareTo(s2);
		if (comparedValue == 0) {
			System.out.println(s1 + " & " + s2 + " are the same, compareTo returned a " + comparedValue);
		} else if (comparedValue == -1) {
			System.out.println(s1 + " is lower in the alphabet than " + s2 + ", compareTo returned a " + comparedValue);
		} else {
			System.out
					.println(s1 + " is higher in the alphabet than " + s2 + ", compareTo returned a " + comparedValue);
		}

		// getChar() method
		System.out.println("The character at index of 3 for s1 is " + s1.getChar(3));

		// toUpper() method
		System.out.println("To upper case is " + s1.toUpper());

		// toLower() method
		System.out.println("To lower case is " + s2.toLower());

		// subString() starting index only
		System.out.println("With the starting index of 2 on s2 is the remaining string is " + s2.subString(2));

		// subString() start and end index
		System.out.println("With the starting index of 1 and an end index of 4 for s1, what's left over is: "
				+ s1.subString(1, 4));

		// indexOf() method
		int indexOfChar = s3.indexOf('s');
		if (indexOfChar == -1) {
			System.out.println("Char of 's' not found in " + s3);
		} else {
			System.out.println("Char of 's' found at index of: " + indexOfChar + " in " + s3);
		}

		// lastIndexOf() method
		int lastIndexOfChar = s2.lastIndexOf('s');
		if (lastIndexOfChar == -1) {
			System.out.println("Char of 's' not found in " + s2);
		} else {
			System.out.println("The last char of 's' found at index of: " + lastIndexOfChar + " in " + s2);
		}
	}

}