import java.util.Arrays;

public class ArrayProgram_RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,63,3,2,3,4,5,6,3,4,5,3,2};
		int size=arr.length;
		Arrays.sort(arr);
		int temp[]=new int[size];
		int j=0;
		for(int i=0; i<size-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[size-1];
		for(int i=0;i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
