// Author : Ivan Zhang
/*
 * Why?
 * Quicksort is one of the most applicable sorting algorithms out there. It runs at worst cast O(n^2) 
 * however it averages O(nlogn) which is why this is a suitable algorithm. Furthermore it only uses 
 * space complexity of O(1). 
 * 
 * When designing an algorithm it shouldn't be too complex. Quicksort is a few more lines than
 * bubble sort, therefore making it applicable to code and debug as well.
 * 
 */

import java.util.Arrays;

public class ownQuickSort {
	
	public int partition(int arr[], int left, int right){
		int start = left;
		int end = right;
		int pivot = arr[(left + right) / 2];
		while(start < end){
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if(start <= end){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
		return start;
	}
	
	public void quickSort(int arr[], int left, int right){
		int index = partition(arr, left,right);
		if(left < index - 1) quickSort(arr, left, index - 1);
		if(index < right) quickSort(arr, index, right);
 	}
	

	public static void main(String args[]){
		int array[] = {4,3,10,22,32,1,32,9,0,92};
		//System.out.println(Arrays.toString(array));
		ownQuickSort obj = new ownQuickSort();
		obj.quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
}
