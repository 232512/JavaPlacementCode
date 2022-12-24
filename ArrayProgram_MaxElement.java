//Write a java program to Finding the Max Element in Array
public class ArrayProgram_MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,3,2,56,3,57,2};
		int size=arr.length;
		System.out.println("Your Array list is :");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		for(int i=0; i<size; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("\nMaximum Element in Array is :"+max);
		int min=arr[0];
		for(int i=0; i<size; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("\nMinimum Element in Array is :"+min);
		
		//For Duplicate Element 
		 
		for(int i=0; i<size; i++) {
			int dup=arr[i];
			for(int j=i+1; j<size; j++) {
				if(dup==arr[j]) {
					System.out.println("Duplicate Element is :"+dup);
				}
			}
		}

	}

}
