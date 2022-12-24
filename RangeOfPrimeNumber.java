import java.util.Scanner;
//Write a java Program to Print the range of Prime Number
public class RangeOfPrimeNumber {
	
	static boolean isPrime(int n) {
		if(n==1 || n==0) {
			return false;
		}
		else {
			for(int i=2; i<n; i++) {
				if(n%i==0)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(isPrime(i)) {
				System.out.print(" "+i);
			}
		}
		
	}
}
