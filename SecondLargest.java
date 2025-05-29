package array;
import java.util.Arrays;

public class SecondLargest {
	//without sorting
	static int getSecondLargest(int[] arr) {
		int a=arr.length;
		int largest=-1, SecondLargest=-1;
		for(int i=0;i<a;i++) {
			 if(arr[i] > largest) {
	                SecondLargest = largest;
	                largest = arr[i];
			 }
			 else if (arr[i] < largest && arr[i] > SecondLargest) {
				 SecondLargest = arr[i];
	            }
			 
			 }
		return SecondLargest;
		}
	public static void main(String[]args){
        int[] arr = {12, 35, 1, 10, 34, 70};
        System.out.println(getSecondLargest(arr));
		
	}
	

}
