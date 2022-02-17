package com.syntax.clas08;

public class ContinueKeyword {

	public static void main(String[] args) {
		for (int i=1; i<=7; i++) {
		
		if (i==3) {
			continue;
		}
			System.out.println("Hello "+i);
			System.out.println("We are batch 12");
		}
		System.out.println("neeeeeeeeeeeeeeeeeeeeeew");
		
		for(int i=1; i<=10; i++) {
			if(i==4 || i==7 || i==9) {
				for (int i=1; i<50; i++) {
					if (i%3==0)
					System.out.print(i +" ");			
				}	continue;
			}
			System.out.println(i+" ");
		}
			System.out.println("neeeeeeeeeeeeeeeeeeeeeew");
		
		 
	}
	}
