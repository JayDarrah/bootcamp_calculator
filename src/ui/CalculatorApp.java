package ui;

/* CalculatorApp.java
 * Author: J Darrah
 * 2019-05-06
 * 
 * A simple calculator app
 */

import business.PerformOperation;
import util.Console;
import util.StringUtilPlus;


public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator app -=[ Phase One ]=-\n");
	
//		Write a menu that will prompt the user for which function they want to use. Example:
//		'+' : Addition
//		'-' : Subtraction
//		'*' : Multiplication
//		etc.
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			printFunctionMenu();

//			Get selected operator from user
			String operator = Console.getRequiredString("Enter selection (+,-,*,/,%, Q): ");
			
//			  • Get user input for each calculation - just 2 numbers for now, int data type
			int operand1 = Console.getInt("Enter first operand: ");
			int operand2 = Console.getInt("Enter second operand: ");

//			Call doTheMath method to get answer based on chosen operator/operands
			int answer = PerformOperation.doTheMath(operand1, operand2, operator);

//			  • Display the result
			System.out.println("\nAnswer: "+operand1+operator+operand2+"="+answer+"\n");

			choice = Console.getChoiceString("Continue?", "y", "n");
			
		}	
		int excitement = (int) (Math.random()*75+4);
		String buhBye = StringUtilPlus.pad("Bye", excitement, "!");
		System.out.println(buhBye);
	}
	public static void printFunctionMenu() {
		StringBuilder sbMenu = new StringBuilder();
		sbMenu.append("\t╔════════════════════╗\n");
		sbMenu.append("\t║ Select a function  ║\n");
		sbMenu.append("\t╟───┬────────────────╢\n");
		sbMenu.append("\t║ + │ Addition       ║\n");
		sbMenu.append("\t╟───┼────────────────╢\n");
		sbMenu.append("\t║ - │ Subtraction    ║\n");
		sbMenu.append("\t╟───┼────────────────╢\n");
		sbMenu.append("\t║ * │ Multiplication ║\n");
		sbMenu.append("\t╟───┼────────────────╢\n");
		sbMenu.append("\t║ / │ Division       ║\n");
		sbMenu.append("\t╟───┼────────────────╢\n");
		sbMenu.append("\t║ % │ Remainder      ║\n");
		sbMenu.append("\t╚═══╧════════════════╝\n");
		System.out.println(sbMenu);

	}
	
}
