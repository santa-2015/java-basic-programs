package practices;
import java.util.Scanner;


public class JavaProgram {
	/*printing hello world*/
	/*sum method*/
	/*even odd*/
	 /*reversing a string*/
	/*largest numbers*/
	/*swapping two variables without using third*/
	/* vowel count */
	
	


public static void main (String[] args) {
	System.out.println("hello world!");
	/*sum method*/
	int a,b,sum;
	Scanner myObj=new Scanner(System.in);
	System.out.println("Enter first number:");
	 a=myObj.nextInt();
	 System.out.println("Enter second number:");
	 b=myObj.nextInt();
	 sum=a+b;
	 System.out.println("The sum is:"+ sum);
	 /*even odd*/
	 Scanner evenOdd=new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int num=evenOdd.nextInt();
	 if(num%2==0)
		 System.out.println("The number" + num + "is even");
	 else
		 System.out.println("The number"+num+"is odd");
	 /*reversing a string*/
	
	 /*factorial calculation*/
	 /*largest numbers*/
	 Scanner largest=new Scanner(System.in);
	 System.out.println("Enter first number:");
	 int x=largest.nextInt();
	 System.out.println("Enter second number:");
	 int y=largest.nextInt();
	 System.out.println("Enter third number:");
	 int z=largest.nextInt();
	 int max;
	 if(x>y){
	        if(x>z)max =x;
	        else max =z;
	      } 
	    else{
	        if(y>z)max=y;
	        else max=z;
	 System.out.println(max);
	    }
	 /*reverse string*/
	 String originalString="Sanika";
	 String reversedString="";
	 for( int i=0; i<originalString.length(); i++) {
		 reversedString=originalString.charAt(i)+reversedString;
	 }
	 System.out.println("The reversed string is:"+reversedString);
	 
	
	 /*swapping two variables without using third*/
	 int d=3;int e=5;
	 System.out.println("d="+d+"e="+e);
	 d=d+e;
	 e=d-e;
	 d=d-e;
	 System.out.println("d="+d+"e="+e);
	/* vowel count */
	 String s="helicopter";
	 char[]c=s.toCharArray();
	 int vowel=0;
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
             vowel++; 
	 }
	 System.out.println("vowels are"+ vowel );
			 
	 
	 
		 
			 
		 
	 
	 
	
	
}
}
