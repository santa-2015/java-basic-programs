package array;
import java.util.*;

public class ArrayReverse {
	static void reverse(Integer a[]) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void main(String[]args) {
		Integer[]arr= {38,98,321,87,3};
		reverse(arr);
	}
	
	
		
		
	

}
