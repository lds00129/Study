package org.lds00129.javasin.eclipse;
import java.util.Scanner;
public class car {
	private static Scanner car;

	public static void main(String [] args) {
		 car = new Scanner(System.in);
	        while(car.hasNextInt()) {
	        	int ho, min, money = 0;
	        	ho=car.nextInt();
	        	if(ho <= 60){
	        		min = ho / 60;
	        		money = 2000;
	        		
	        	}
				if(ho >60){
					min = ho - 60;
					money = money+3000;
					min= (min/10);
					money = money + min * 1000;
				}
		
			System.out.printf("주차 요금은 %d 입니다",money);
	
		

		}
	}
}
