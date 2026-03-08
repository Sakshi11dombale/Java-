import java.util.*;

public class AdditionOfTwoNum{
	public static void main(String[] args){
		 int num1;
		 int num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of First Number = ");
		num1 = sc.nextInt();

		System.out.println("Enter value of Second Number = ");
		num2 = sc.nextInt();

		 int addition = num1 + num2 ;
		
		System.out.println("Sum of Two Numbers is = " + addition);
	}
}