import java.util.Scanner;

//Write a java program to print the Binary Search
public class ArrayProgram_BinarySerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,40,60,80};
		int size=arr.length;
		System.out.println("You Array list is :");
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
		int item,beg=0,end=size-1,mid;
		System.out.println("\nEnter the element you want to serarch");
		Scanner sc=new Scanner(System.in);
		item=sc.nextInt(); int flag=0;
		while(beg<=end) {
			mid=(beg+end)/2;
			if(item==arr[mid]) {
				flag=1;
				break;
			}
			else if(item>arr[mid]) {
				beg=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		if(flag==1)
			System.out.println("Item present at list:");
		else
			System.out.println("Item not present in the list");

	}

}
