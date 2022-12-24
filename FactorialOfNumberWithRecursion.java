import java.util.Scanner;

//Write a java program to print the Factorial of Number using Recursion
public class FactorialOfNumberWithRecursion {
	public static int fact1(int num) {
		if(num==1)
			return 1;
		else
			return num*(fact1(num-1));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=fact1(num);
		System.out.println("Factorial of number is :"+result);
		

	}


	private static int fact(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
