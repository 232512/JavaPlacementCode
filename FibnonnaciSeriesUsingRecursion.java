import java.util.Scanner;

//Write a java program to print the Fibnonnci Series using Recursion
public class FibnonnaciSeriesUsingRecursion {
	static int n1=0,n2=1,n3=0;
	 static void PrintFibnoaaci(int count) {
		 if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		PrintFibnoaaci(count-1);
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.println(n1+" "+n2);
		PrintFibnoaaci(count-2);
		
		

	}

}
