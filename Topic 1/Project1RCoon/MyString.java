package Proj1;

public class MyString {

	// A char array reference 
	char[] arr;
	// An integer curr_length  number of characters in the string
	int curr_length;

	// A constructor that initializes the array to null and the curr_length to 0
	public MyString() {
		arr = null;
		curr_length = 0;
	}

	// A constructor that takes a String parameter and initializes the char array
	// to the characters in the String.
	public MyString(String str) {
		curr_length = str.length();
		arr = new char[curr_length];
		for (int i = 0; i < curr_length; i++)
			arr[i] = str.charAt(i);
	}

	// a copy constructor
	public MyString(MyString rc) {
		curr_length = rc.curr_length;
		arr = new char[curr_length];
		for (int i = 0; i < curr_length; i++)
			arr[i] = rc.arr[i];
	}

	// a length() method  returns the number of characters in the string
	public int length() {
		return curr_length;
	}

	// a toString() method that returns a String representation of the object
	public String toString() {
		String str = "";
		for (int i = 0; i < curr_length; i++)
			str += arr[i];
		return str;
	}

	// a concat method 
	public MyString concat(MyString rc) {
		ensureCapacity();
		return new MyString(toString() + rc.toString());
	}

	// a equals method takes a parameter and returns
	// true if this MyString and the parameter are the same
	public boolean equals(MyString rc) {
		return toString().equals(rc.toString());
	}

	// a .compareTo method that takes a MyString parameter and returns as 0 as the same positive if before negative if after
	public int compareTo(MyString rc) {
		return toString().compareTo(rc.toString());
	}

	// .get(int) method that takes an integer and returns the character at that
	// index location.
	public char get(int indx) {
		if (indx >= 0 && indx < curr_length)
			return arr[indx];
		else
			return '\0';
	}

	// .toUpper()  that return a MyString that is in all upper case
	public MyString toUpper() {
		return new MyString(toString().toUpperCase());
	}

	//  .toLower() that return a MyString that is in all lower case
	public MyString toLower() {
		return new MyString(toString().toLowerCase());
	}

	// .substring(int) that takes an integer and returns the substring starting at
	// that index.
	public MyString substring(int start) {
		return new MyString(toString().substring(start));
	}

	// .substring(int , int) . Return a  substring with a start and end
	public MyString substring(int start, int end) {
		return new MyString(toString().substring(start, end));
	}

	// .indexOf that take a  parameter and return the starting
	// index

	public int indexOf(MyString rc) {
		return toString().indexOf(rc.toString());
	}

	// .lastIndexOf(MyString) and that take a  parameter and return the
	// starting index
	// of the first occurrence of  in the calling object.
	// If the parameter is not found in the calling object, the method should return
	// -1.
	public int lastIndexOf(MyString rc) {
		return toString().lastIndexOf(rc.toString());
	}
	
	private void ensureCapacity() {
		
		if (curr_length < arr.length) {
		char[] biggerArr = new char[2 * arr.length];
				for (int i = 0; i < arr.length; i++) {
					biggerArr[i] = arr[i];
					arr = biggerArr;
				}
		}
	}
}