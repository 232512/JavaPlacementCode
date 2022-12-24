//Write a java program to perform the selection sort
public class Array_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,4,23,67,45,89};
		int size=arr.length;
		int temp=0;
		for(int i=0; i<size-1; i++) {
			int smallest=i; 
			for(int j=i+1; j<size; j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
