import java.util.Arrays;

public class ArrayProgram_SecondMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,23,67,30,90,90};
		int size=arr.length;
		Arrays.sort(arr);
		for(int i=size-2; i>=0; i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.println("The second largest element is :"+arr[i]);
				break;
			}
		}
		for(int i=0;i<size; i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.println("Second smallest element is :"+arr[i+1]);
				break;
			}
		}
	

	}

}
