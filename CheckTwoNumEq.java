import java.util.*;

public class CheckTwoNumEq{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num 1 = ");
		int num1 = sc.nextInt();

		System.out.print("Enter num 2 = ");
		int num2 = sc.nextInt();

		if(num1 == num2){
			System.out.println("Entered both numbers are equal.");
		} 
		else{
			System.out.println("Entered both numbers are not equal.");
		}
	}
}