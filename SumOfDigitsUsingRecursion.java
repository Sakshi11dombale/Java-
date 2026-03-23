import java.util.*;

public class SumOfDigitsUsingRecursion {

	public static int sumOfDigit(int n, int rem, int last_digit ){
		while(n !=0){
			last_digit = n % 10;
			rem = rem + last_digit;
			n = n / 10;
		}
		return rem;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a two digit or more two digit number = ");
		int num = sc.nextInt();
		// int n = num;
		
		


		int result = sumOfDigit(num,0,0);
		System.out.println("The sum of digits of given number = " + result);
	 
	}
}
