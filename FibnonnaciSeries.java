import java.util.Scanner;

//Write a java program to print the Fibnonnaci Series
public class FibnonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		
		System.out.print(n1+" "+n2);
		for(int i=2;i<=num; i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		

	}

}
