package bhavana;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		System.out.println("Enter no.of rows:");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println("");
			

			
		}
			}

}
