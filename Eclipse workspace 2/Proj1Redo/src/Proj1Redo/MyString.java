package Proj1Redo;

import java.util.Arrays;

public class MyString {

	private char[] charArray;
	private int curr_length;

	public MyString() {
		this.charArray = null;
		this.curr_length = 0;
	}

	public MyString(String inputString) {
		this.charArray = inputString.toCharArray();
		this.curr_length = this.charArray.length;
	}

	MyString(MyString myString) {
		charArray = myString.charArray;
		curr_length = myString.curr_length;
	}

	public int length() {
		return charArray.length;
	}

	@Override
	public String toString() {
		return  Arrays.toString(charArray).replace(",","") + " current length = " + curr_length;
	}
//concat 
	public MyString concatString(MyString myString) {
		ensureCapacity();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.charArray);
		stringBuilder.append(myString.charArray);
		this.charArray = stringBuilder.toString().toCharArray();
		this.curr_length = this.charArray.length;
		return this;
	}
//equals
	public boolean equals(MyString myString) {
		return Arrays.equals(this.charArray, myString.charArray);
	}
//compare to
	public int compareTo(MyString myString) {
		int returnValue = 0;
		int indexLength = compareArrayLength(this.charArray.length, myString.charArray.length);

		for (int i = 0; i < indexLength; i++) {
			if (this.charArray[i] == myString.charArray[i]) {
				returnValue = 0;
			} else if (this.charArray[i] < myString.charArray[i]) {
				return returnValue = -1;
			} else if (this.charArray[i] > myString.charArray[i]) {
				return returnValue = 1;
			}
		}
		return returnValue;
	}
//compare length
	private int compareArrayLength(int originalArray, int secondArray) {
		if (originalArray > secondArray) {
			return secondArray;
		}
		return originalArray;
	}
//getchar
	public char getChar(int index) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.charArray);
		String myString = stringBuilder.toString();
		char returnChar = myString.charAt(index);
		return returnChar;
	}
//set to uppercase
	public MyString toUpper() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.charArray);
		this.charArray = stringBuilder.toString().toUpperCase().toCharArray();
		return this;
	}
//set to lowercase
	public MyString toLower() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.charArray);
		this.charArray = stringBuilder.toString().toLowerCase().toCharArray();
		return this;
	}

	public MyString subString(int index) {
		String subString = new String(this.charArray, index, this.charArray.length - (index));
		this.charArray = subString.toCharArray();
		this.curr_length = this.charArray.length;
		return this;
	}

	public MyString subString(int start, int end) {
		String subString = new String(this.charArray, start, end);
		this.charArray = subString.toCharArray();
		this.curr_length = this.charArray.length;
		return this;
	}
//index of
	public int indexOf(char characterSearched) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.charArray);
		String builtString = stringBuilder.toString();
		int rIndex = 0;

		for (int i = 0; i < this.charArray.length; i++) {
			if (builtString.charAt(i) != characterSearched) {
				rIndex = -1;
			} else if (builtString.charAt(i) == characterSearched) {
				rIndex = i;
				return rIndex;
			}

		}
		return rIndex;
	}
//last index of
	public int lastIndexOf(char characterSearched) {
		int currentIndex = indexOf(characterSearched);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.charArray);
		String builtString = stringBuilder.toString();
		for (int i = currentIndex + 1; i < this.charArray.length; i++) {
			if (builtString.charAt(i) == builtString.charAt(currentIndex)) {
				currentIndex = i;
			} else if (currentIndex == -1) {
				return currentIndex;
			}
		}
		return currentIndex;
	}

	private void ensureCapacity() {
		if (curr_length < this.charArray.length) {
			char[] biggerCharArray = new char[2 * this.charArray.length];
			for (int i = 0; i < this.charArray.length; i++) {
				biggerCharArray[i] = this.charArray[i];
				this.charArray = biggerCharArray;
			}
		}
	}

	public char[] getCharArray() {
		return charArray;
	}

	public void setCharArray(char[] charArray) {
		this.charArray = charArray;
	}

	public int getCurr_length() {
		return curr_length;
	}

	public void setCurr_length(int curr_length) {
		this.curr_length = curr_length;
	}

}