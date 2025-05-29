package array;
import java.util.Arrays;

public class ZerosEnd {
	static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

       
        int j = 0;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];
        }

 
        while (j < n)
            temp[j++] = 0;

     
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 0, 0, 32, 0, 0, 0};
        pushZerosToEnd(arr);

    
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
	

}
