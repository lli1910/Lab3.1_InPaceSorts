import java.util.Arrays;

public class ArrayMethod1 {
   //bubble sort
	public static void main(String args[]) {
		//Testing arrays
		int[] test1 = {1,4,4,5,2,4,3,17,0};
		double [] test2 = {1.1, 4.1, 4.2, 5.0, 2.0, 3.0, 4.0, 3.0, 17.0, 0.0};
		String [] test3 = {"zebra","tortilla", "abba", "foo","bar", "aba"};
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end -start;
		System.out.println("Test1 took: " + time+ " nanosec");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort test
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test 2 took: " + time + " nanosec");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		System.out.println("Test 3 took: " + time + " nanosec");
		System.out.println(Arrays.toString(test3));
		
		
	}
	
	public static void insertionSort(int [] list1) {
		int swapNum = 0;
		for(int i = 0; i<list1.length;i++) {
			swapNum = i;
			for(int j=i-1; j>=0;j--) {
				if(list1[swapNum]<list1[j]) {
					intSwap(list1, swapNum, j);
					swapNum--;
				}
				else if(list1[swapNum]>list1[j]) {
					break;
				}
			}
		}
		
		
		
	}
	
	public static void selectionSort(double [] doubleArr) {
		for(int i = 0; i < doubleArr.length; i++) {
			for(int j = i+1; j<doubleArr.length;j++) {
				if(doubleArr[i]>doubleArr[j]) {
					doubleSwap(doubleArr,i,j);
				}
			}
		}
	}
	
	public static void bubbleSort(String[] stringArr) {
		int swap = 100;
		
		while(swap > 0) {
			swap = 0;
			for(int i = 0; i < stringArr.length - 1; i++) {
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
