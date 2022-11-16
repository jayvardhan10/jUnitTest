package jUnitTestPackage;
import java.util.Scanner;
public class jUnitFunctions {
	static void AddNumbers() {
	    int x, y, sum1;
	    Scanner Ob1 = new Scanner(System.in);
	    System.out.println("Type first number:");
	    x = Ob1.nextInt();

	    System.out.println("Type second number:");
	    y = Ob1.nextInt();

	    sum1 = x + y; 
	    System.out.println("Sum is: " + sum1);
		}
	
	static void AddStrings() {
		Scanner sc1 = new Scanner(System.in);
	    System.out.println("Type first string:");
		 String s1= sc1.nextLine();
		    System.out.println("Type second string:");
		   String s2= sc1.nextLine();  
		   String s3= s1.concat(s2);  
		   System.out.println(s3);
		
	}
	
	
	
	public static void main(String[] args) {
		AddNumbers();
		AddStrings();
	  }
}

