package pattern;

import java.util.Scanner;

public class pyramid3 {
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the pattern you wants to print");
		int c=sc.nextInt();
		System.out.println("your pattern is as follow \n ");
		for(int i=1;i<=c;i++) 
		{
			for(int j=1;j<=c;j++) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
/******* 
****** 
****** 
****** 
****** 
****** 
*/