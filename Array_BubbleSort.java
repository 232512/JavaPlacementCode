//Write a java program to print the Bubble Sort
public class Array_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,45,12,56,23,67,34};
		int size=arr.length;
		int temp;
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<size; i++) {
		System.out.print(arr[i]+" ");
		}

	}

}
