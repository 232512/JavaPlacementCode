import java.util.Scanner;

//Write a java program to print the fibnonnaci series in given range
public class FibnonnaciSeriesRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second; int third;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range upto print the fibnonnaci series;");
		int num=sc.nextInt();
		System.out.println("Enter the first and Second Number :");
		
		first=sc.nextInt();
		second=sc.nextInt();
		System.out.print(first+" "+second+" ");
		
		
		for(int i=second+1; i<=num; i++) {
			third=first+second; 
			System.out.print(third+" ");
			first=second;
			second=third;
		}
		
		
		

	}

}
