import java.lang.reflect.Array;
import java.util.Arrays;

//Write a java program to print the Occurance of duplicate element
public class ArrayElement_CountOccuranceOfDupElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,2,3,4,5,2,3,3,4,4,4,67};
		int size=arr.length;
		System.out.println("Array List is :");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		//count the duplicate element
		for(int i=0;i<size-1; i++) {
			int count=1;
			
			for(int j=i+1; j<size; j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
				
			}
			if(count>1) {
				System.out.println();
				System.out.println(arr[i]+" ->"+count);
				i+=(count-1);
			  
			}
		}

	}

}
