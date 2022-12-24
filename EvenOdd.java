import java.util.Scanner;

//Write a java program to print the even number upto the range
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Even Number:");
		for(int i=1; i<=num; i++) {
			if(i%2==0)
				System.out.print(i+" ");
			
		}
		System.out.println("\nOdd Number:");
		for(int i=1; i<=num; i++) {
			if(i%2!=0)
				System.out.print(i+" ");
			
		}

	}

}
