//Write a java program to perform the Quick Sort
public class Array_QuickSort {
	int partition(int arr[],int low,int high) {
		int pivot=arr[(low+high)/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}
			while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	
	void qucikSortRecursion(int[]arr,int low, int high) {
		int pi=partition(arr,low,high);
		if(low<pi-1) {
			qucikSortRecursion(arr,low,pi-1);
		}
		if(pi<high) {
			qucikSortRecursion(arr,pi,high);
		}
		
	}
	
	void printArray(int[] arr,int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,34,67,23,78,45,65,89,34};
		int size=arr.length;
		Array_QuickSort qs=new Array_QuickSort();
		qs.qucikSortRecursion(arr,0,size-1);
		qs.printArray(arr,size);
		
		
		
		
		

	}

	

}
