public class ArrayMethod1 {
   //bubble sort
	public static void main(String args[]) {
		String[] bubble = {"Delta","Alpha", "Charlie", "Beta"};
		int [] insert = {2,3,6,5,4,1};
		bubbleSort(bubble);
		for(String s:bubble) {
			System.out.print(s + ", ");
		}
	}
	
	
	public static void insertionSort(int [] list1) {
		//https://www.geeksforgeeks.org/insertion-sort/
		
		
		
	}
	
	public static void selectionSort(double [] list1) {
		
		
		
	}
	
	public static void bubbleSort(String[] stringArr) {
		int swap = 100;
		
		while(swap != 0) {
			for(int i = 0; i < stringArr.length - 1; i++) {
				swap = 0;
				if(stringArr[i].compareTo(stringArr[i+1]) > 0) {
					stringSwap(stringArr,i,i+1);
					swap++;
				}
			}
		}
	}
	
	

	
	
	public static void intSwap(int[]arr, int index1, int index2) {
		int num = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=num;
	}
	public static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}

}
