package com.syntax.class06;

import java.util.Scanner;

public class Rep45 {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
			int day = 1-7;
			switch (day){
			  case 1:
					day= Monday;
					break;
				case 2:
					day="Tuesday";
				case 3:
					day="Wedneday";
				case 4:
					day="Thurday";
				case 5:
					day="Friday";	
				case 6:
					day="Saturday";
				case 7:
					day="Sunday";
				default:
					day="Invalid";
					break;
				System.out.println(day);
			}

	}

}
