//Write a program to print the reverse of array element
public class ArrayProgram_ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,52,3,6,1,7};
		int size=arr.length;
		System.out.println("Your Array list is ");
		for(int i=0; i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		//Reverse of element in array
		System.out.println("\nElement in Reverse Order:");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
