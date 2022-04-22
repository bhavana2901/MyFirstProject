package bhavana;

import java.util.Scanner;

public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number ");
		n = sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive Number");
			
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Neither positive nor negative number");
		}

	}

}
