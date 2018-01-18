public class ArrayMethod1 {
   //bubble sort
	public static void main(String args[]) {
		String[] bubble = {"Delta","Alpha", "Charlie", "Beta"};
		bubbleSort(bubble);
		System.out.println(bubble);
	}
	
	public static void bubbleSort(String[] stringArr) {
		for(int i = 0; i < stringArr.length - 2; i++) {
			//remember swap value
			//if arr element is greater than the next array element, swap
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
