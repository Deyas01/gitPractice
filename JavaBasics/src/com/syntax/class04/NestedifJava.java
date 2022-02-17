package com.syntax.class04;

public class NestedifJava {

	public static void main(String[] args) {
		
if()
	}
Boolean vaccine=true;
int dose=2;
System.out.println("How many does you have");

if (dose==1) {
System.out.println("You need another shot");

}else {
	System.out.println("You are fully vaccinated");
	
}

System.out.println("_______________________________________________________________________");

/* Declare a variable for allergy
 *if you have allergy -->
 *			If you have pollen
 *			If you have peanut
 *			If you have wheat
 *if no allergy --> you are lucky
 *
 */
boolean allergy=true;
if(allergy) {
System.out.println("Let's check what allergies you have");

String allergyType="pollen";

if(allergyType.equals("pollen")) {
System.out.println("Please stay at home when trees are blooming. Take more medication");
}else if (allergyType.equals("peanut")) {
	System.out.println("Please do not eat food that contains nuts. Take medication");
}else if (allergyType.equals("gluten")) {
	System.out.println("Please follow gluten free diet. Take med C");
}else {
	System.out.println("I don't know which suggestion to give you"); 
	


}else {
	
	System.out.println("You are lucky");
}
	

