package assignment;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		int n, sum =0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum:"+sum);
		average=(float)sum/n;
		System.out.println("Average:"+average);
		

	}

}
