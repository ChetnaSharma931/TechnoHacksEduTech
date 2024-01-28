package TechnoHacksEduTech;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		char ArOperator;
		int num1,num2,outcome;
		Scanner S1= new Scanner(System.in);
		System.out.println("Enter the operator (+,-,*,/):");
		ArOperator= S1.next().charAt(0);
		System.out.print("Enter the First Number");
		num1= S1.nextInt();
		System.out.print("Enter the Second Number");
		num2= S1.nextInt();
		
		
		switch(ArOperator) {
		
		case '+': outcome= num1+num2;
		System.out.println(num1 + " + " + num2 + " = " + outcome);
        break;
        
		case '-': outcome= num1-num2;
		System.out.println(num1 + " - " + num2 + " = " + outcome);
        break;
        
		case '*': outcome= num1*num2;
		System.out.println(num1 + " * " + num2 + " = " + outcome);
        break;
        
		case '/': outcome= num1/num2;
		System.out.println(num1+ " / " + num2 + " = " + outcome);
        break;
        
        default: System.out.println("Invalid operator!");
        break;
        
		}
		
	}



	}


