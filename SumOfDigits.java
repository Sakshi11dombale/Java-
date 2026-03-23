import java.util.*;

public class SumOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int num1 = sc.nextInt();

		int n = num1;
		int last_digit;
		int rem = 0;
		while(n != 0 ){
			last_digit = n % 10;
			rem = rem + last_digit;
			n = n / 10;
			
		}
		System.out.println(rem);
		
	}
}