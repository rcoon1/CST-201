package Proj1;

public class MyStringDriver {
	
		
	public static void main(String[] args) {
		// creating a MyString object
		MyString rc1 = new MyString("'Jack Johnson'");
		// creating a MyString object
		MyString rc2 = new MyString("'Pizza'");
		// creating a MyString object
		MyString rc3 = rc1;

		// testing all functions using these MyString objects
		System.out.println("Test program... ");
		System.out.println("s1 = " + rc1 + "s2 = " + rc2);
		System.out.println("\ntesting . length()... ");
		System.out.println("there are " + rc1.length() + " characters in " + rc1);
		System.out.println("\ntesting concat(MyString)...");
		System.out.println("concat(MyString) = " + rc1.concat(rc2));
		System.out.println("\ntesting .equals()... ");
		System.out.println("s1=s2 = " + rc1.equals(rc2));
		System.out.println("s1=s3 = " + rc1.equals(rc3));
		System.out.println("\ntesting .compareTo()...");
		System.out.println("s1 compared to s2 = : " + rc1.compareTo(rc2));
		System.out.println("\ntest .get()...");
		System.out.println("The sixth character in s1 = " + rc1.get(6));
		System.out.println("\ntest .toUpper()...");
		System.out.println("s1 converted to uppercase = " + rc1.toUpper());
		System.out.println("\ntest .toLower()...");
		System.out.println("s2 converted to lowercase = " + rc2.toLower());
		System.out.println("\ntest .subString(7)...");
		System.out.println(".subString(7) of s1 = " + rc1.substring(7));
		System.out.println("\ntest .subString(2, 6)...");
		System.out.println("substring(2, 6) of s1 = " + rc1.substring(2, 6));
		System.out.println("\ntest s1.indexOf(s3)...");
		System.out.println("s1.indexOf(s2) =  " + rc1.indexOf(rc3));
		System.out.println("\ntest s1.lastIndexOf(s2)...");
		System.out.println("s1.lastIndexOf(s2) =  " + rc1.lastIndexOf(rc2));
	}
}