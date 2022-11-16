package jUnitTestPackage;
import java.util.Scanner;
public class jUnitFunctions {
	static int AddNumbers(int a, int b) {
	    int x, y, sum1;
	    Scanner Ob1 = new Scanner(System.in);
	    System.out.println("Type first number:");
	    x = Ob1.nextInt();

	    System.out.println("Type second number:");
	    y = Ob1.nextInt();

	    sum1 = x + y; 
	    System.out.println("Sum is: " + sum1);
	    return sum1;
		}
	
	static String AddStrings(String a, String b) {
		Scanner sc1 = new Scanner(System.in);
	    System.out.println("Type first string:");
		 String s1= sc1.nextLine();
		    System.out.println("Type second string:");
		   String s2= sc1.nextLine();  
		   String s3= s1.concat(s2);  
		   System.out.println(s3);
		   return s3;
		
	}
	
	
	public static void main(String[] args) {
		AddNumbers(10, 90);
		AddStrings("ab","cd");
	  }
}

