package com.syntaclass5;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
	Scanner customer=new Scanner(System.in);
		
		System.out.println("Please enter a number!");
		int number = customer.nextInt();
		
		if (number>=1 && number<=10) {
			System.out.println("Small Number");
		}else if (number>=11 && number<=100) {
			System.out.println("Medium Number");
		}else if (number>=101 && number<=1000) {
			System.out.println("Large Number");
		}
	}
}

