import java.util.Scanner;

//Write a java program to print the factorial of a number without Recursion
public class FactoralOfNumberWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of a Number is :"+fact);
	}

}
