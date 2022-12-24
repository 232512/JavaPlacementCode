//Write a java program to print the Insertion Sort
public class Array_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,45,2,34,89,56};
		int size=arr.length;
		int temp,j;
		for(int i=1; i<size; i++) {
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp ) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
