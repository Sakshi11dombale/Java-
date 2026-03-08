import java.util.*;

public class ArithmeticOperatons{
	public static void main(String[] args){
		int num1 ;
		int num2 ;

		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter value of first number = ");
		num1 = sc.nextInt();

		System.out.print("Enter value of second number = ");
		num2 = sc.nextInt();
	
		int addition = num1 + num2;
		System.out.println("Addition is = " + addition);

		int subtraction = num1 - num2;
		System.out.println("Subtraction is = " + subtraction);

		int multiplication = num1 * num2;
		System.out.println("Multiplication is = " +multiplication);

		double division = num1 / num2;
		System.out.println("Division is = " + division);

		double modulo = num1 % num2;
		System.out.println("Remainder is = "+modulo);

	}
}