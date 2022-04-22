package bhavana;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3,largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		n1 = sc.nextInt();
		System.out.println("Enter the number2");
		n2 = sc.nextInt();
		System.out.println("Enter the number3");
		n3 = sc.nextInt();
		if(n1>n2 && n1>n3)
			largest = n1;
		else if (n2>n1 && n2>n3)
			largest = n2;
		else
			largest = n3;
		System.out.printf("Largest among %d %d and %d is %d",n1,n2,n3,largest);
		
		
		

	}

}
