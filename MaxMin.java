package array;

public class MaxMin {
	public static void main(String[]args) {
		int []num= {3,10,90,101,1000};
		int maxNum=num[0];
		int minNum=num[0];
		for(int i=1;i<num.length;i++) {
			int numbers=num[i];
			if (numbers>maxNum) {
				maxNum=numbers;
				
			}
			if (numbers<minNum) {
				minNum=numbers;
			}
			
		}
System.out.println("maximum element in array"+maxNum);
System.out.println("minimum element in arrray"+minNum);
		
		
	}

}
