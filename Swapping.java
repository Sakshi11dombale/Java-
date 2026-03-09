import java.util.*;

public class Swapping{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of first number = ");
		int number1 = sc.nextInt();

		System.out.println("Enter value of second number = ");
		int number2 = sc.nextInt();
	
		System.out.println("Befor Swapping number 1 is " + number1 + " and number 2 is " + number2);

		int temp;
	
		System.out.println("After Swapping : ");

		temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("number 1 is " + number1 + " and number 2 is " + number2);

	}
}