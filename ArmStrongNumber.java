import java.util.Scanner;

//Write a java Program to print the ArmStrongNumber or not
public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,sum=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("The Number is Armstrong Number:");
		else
			System.out.println("The Number is not Armstrong Number:");

	}

}
