package bhavana;

import java.util.Scanner;

public class SpeedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float timeSeconds;
		float mps,kph,mph;
		System.out.println("Input distance in meters:");
		float distance = sc.nextFloat();
		System.out.println("Input hour:");
		float hr = sc.nextFloat();
		System.out.println("Input minutes:");
		float min = sc.nextFloat();
		System.out.println("Input seconds:");
		float sec = sc.nextFloat();
		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = (distance/1000.0f) / (timeSeconds/3600.0f);
		mph = kph / 1.609f;
		System.out.println("Your speed in meters/second is:" +mps);
		System.out.println("your speed in km/hr is :" +kph);
		System.out.println("your speed in miles/hr is :"+mph);
		
		

		

		

		
		

	}

}
