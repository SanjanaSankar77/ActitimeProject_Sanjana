package JavaPrograms;

import java.util.Scanner;

public class CountOfFactorOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		int count = 0;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
System.out.println("Count of factors of " + n + " are : " +  count);
	}
}
