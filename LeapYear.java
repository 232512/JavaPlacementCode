import java.util.Scanner;

//Write a java Program to print the leap year or not;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if((year%400==0)||(year%4==0 && year%100!=0)) {
			System.out.println("The Year is Leap Year:");
		}
		else {
			System.out.println("The Year is not Leap Year");
		}

	}

}
