public class ArrayMethod1 {
   //bubble sort
	public static void main(String args[]) {
		String[] bubble = {"Delta","Alpha", "Charlie", "Beta"};
		int [] insert = {2,3,6,5,4,1};
		double [] select = {1.2,7.8,2.3,5.6,3.4}
		
		bubbleSort(bubble);
		for(String s:bubble) {
			System.out.print(s);
		}
		
		selectionSort(select);
		for(String a:select) {
			System.out.print(a);
		}
		
	}
	
	
	public static void insertionSort(int [] list1) {
		//https://www.geeksforgeeks.org/insertion-sort/
		
		
		
	}
	
	public static void selectionSort(double [] doubleArr) {
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = i+1; j<doubleArr.length-1;j++) {
				if(doubleArr[i]>doubleArr[j]) {
					doubleSwap(doubleArr,i,j)
				}
			}
		}
		 
		
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
	public static void doubleSwap(double[]arr, int index1, int index2) {
		double num = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=num;
	}
	public static void stringSwap(String[]arr, int index1, int index2) {
		String string = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = string;
	}

}
