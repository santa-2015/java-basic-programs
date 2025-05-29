package array;
import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {
	 static List<Integer> intersection(int[] a, int[] b) {
	        List<Integer> res = new ArrayList<>();

	     
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < b.length; j++) {

	             
	                if (a[i] == b[j]) {
	                    if (!res.contains(a[i])) {
	                        res.add(a[i]);
	                    }
	                }
	            }
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        int[] a = {11, 2, 3, 2, 1};
	        int[] b = {32, 2, 2, 3, 3, 2};

	        List<Integer> res = intersection(a, b);

	        for (int val : res) {
	            System.out.print(val + " ");
	        }
	    }
	}


