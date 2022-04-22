package bhavana;

import java.util.Scanner;

public class SumOfDigitsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum = 0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of Digits"+sum);
	}

}
