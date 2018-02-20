import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
Scanner scanner = new Scanner (System.in);
System.out.println("Enter two numbers, and choose to add subtract, multiply, or divide them");

System.out.println("First Number");
int num1 = scanner.nextInt();

System.out.println("Second Number");
int num2 = scanner.nextInt();



int decision = scanner.nextInt();

if (decision ==1)
{
  System.out.println("you have chosen addition");
	
  int operation1 = addition(num1, num2);	
  
  System.out.println("The result is " + operation1);
}

else if (decision == 2)
{
  System.out.println("you have chosen subtraction");
  int operation2 = subtraction(num1, num2); 
  System.out.println("The result is " + operation2);
}
else if (decision ==3)
{
  System.out.println("you have chosen multiplication");
  int operation3 = multiply (num1, num2);	
  System.out.println("The result is " + operation3);
}
	
else if (decision ==4)
{
  System.out.println("you have chosen division");
  int operation4 = divide (num1, num2);	
  System.out.println("The result is " + operation4);
}
	
	}

public static int addition (int a, int b)
{
	int math = (a + b);
	return math;
}

public static int subtraction (int a, int b){
	int math = (a - b);
	return math;
}

public static int multiply (int a, int b){
	int math = (a * b);
	return math;
}

public static int divide (int a, int b){
	int math = (a / b);
	return math;
}


}


	


