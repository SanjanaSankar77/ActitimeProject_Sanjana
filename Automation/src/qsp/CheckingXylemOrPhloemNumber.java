package qsp;

import java.util.Scanner;

public class CheckingXylemOrPhloemNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int lastDigit= n%10;
n=n/10;
int sum=0;
while(n>9)
{
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
}

int middleNumbersSum = sum;
int cornerNumbersSum = lastDigit+n;
System.out.println("Sum of middle numbers:" + middleNumbersSum);
System.out.println("Sum of corner numbers:" + cornerNumbersSum);
if(middleNumbersSum==cornerNumbersSum)
System.out.println("The given number is Xylem");
else
System.out.println("The given number is Phloem");
}
	}

