package try_catch_block;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a =sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		try {
		       System.out.println(a+"/"+b+"="+(a/b));
		}
		catch(ArithmeticException e) {
			System.out.println(a+"/"+b+"= Infinity");
		}
		
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println("Program Ends");
		sc.close();
	}

}
