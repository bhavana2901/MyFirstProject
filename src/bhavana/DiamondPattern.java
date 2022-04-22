package bhavana;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,i,j;
		System.out.println("Enter no.of rows:");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		for(i=0;i<=row;i++)
		{
			for(j=1;j<=row-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.println("*");
			System.out.println("\n");
		}
		for(i=row-1;i>=1;i--)
		{
		for(j=1;j<=row-i;j++)
			System.out.print(" ");
		for(j=1;j<=2*i-1;j++)
			System.out.print("*");
		System.out.print("\n");
			
				

			

			

		}
		


	}

}
