import java.util.Scanner;

//Write a Java Program to print the reverse of number
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number You want to reverse");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,rem;
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println("The Reverse Of number is :"+sum);

	}

}
