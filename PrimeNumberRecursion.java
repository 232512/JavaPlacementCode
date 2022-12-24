import java.util.Scanner;

public class PrimeNumberRecursion {
	static int prime(int num,int i) {
		if(i==1)
			return 1;
		if(num%i==0)
			return 0;
		return prime(num,i-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,p;
		Scanner sc=new Scanner(System.in);
		int num11=sc.nextInt();
		p=prime(num11,num11/2);
		if(p==1)
			System.out.println("prime");
		else
			System.out.println("Not Prime");

	}

}
