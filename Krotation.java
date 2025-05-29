package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Krotation {
	static void RightRotate(int a[], 
            int n, int k)
{


k=k%n;

for(int i = 0; i < n; i++)
{
if(i<k)
{

System.out.print(a[n + i - k] 
                 + " ");
}
else
{

System.out.print(a[i - k] 
                 + " ");
}
}
System.out.println();
}


public static void main(String args[])
{
int Array[] = {221, 2, 33, 44, 56};
int N = Array.length;

int K = 2;
RightRotate(Array, N, K);
}

}
