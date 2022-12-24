import java.util.Arrays;

//Write a java program to print the second largest element in the Array
public class ArrayProgram_SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,23,65,76,90,67,90};
		int size=arr.length;
		System.out.println("You Array List is ");
		for(int i=0;i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		//Arrays.sort(arr);
		if(size<2) {
			System.out.println("invlaid input");
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=size-2; i>=0; i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.println("\nSecond largest element is :"+arr[i]);
				break;
			}
		}
		
		
		/*for(int i=0; i<size;i++) {
			int second=arr[size-2];
			if(second==arr[i]) {
			System.out.println("\nSecond largest Element is :"+arr[i]);
			break;
			}
		}*/
		

	}

}
