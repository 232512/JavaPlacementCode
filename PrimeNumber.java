import java.util.Scanner;

//Write a java program to print the Prime Number
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Prime Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num-1;i++) {
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0) {
			System.out.println("The Number is Prime:");
		}
		else {
			System.out.println("The Number is not Prime");
		}

	}

}
