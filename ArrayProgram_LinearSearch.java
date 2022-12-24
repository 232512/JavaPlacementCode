import java.util.Scanner;

//Write a java program to find the item using linear serach technique;

public class ArrayProgram_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[6];
		System.out.println("Enter the item in array list:");
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Your Array list is :");
		for(int i=1; i<=5; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter the element you want to serach");
		int item=sc.nextInt();
		int flag=0;
		for(int i=1; i<=5; i++) {
			if(item==arr[i]) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("item present in the list");
		else
			System.out.println("item not present in the list");

	}

}
