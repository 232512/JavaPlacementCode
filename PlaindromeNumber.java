import java.util.Scanner;

//Write a java program to print Plaindrome Number
public class PlaindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0;
		while(num!=0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum)
			System.out.println("The Number is Plaindorome");
		else
			System.out.println("The Number is Not Plaindorome");

	}

}
