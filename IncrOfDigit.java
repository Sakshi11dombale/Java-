import java.util.*;

public class IncrOfDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a more than two digit number = ");
		int num = sc.nextInt();
		int rem=0;
		int last_digit;	
		int result;
		int rslt;	

		while(num !=0){
			last_digit = num % 10;
			result = rem + last_digit;
			rslt = result + 1 ;
			num = num /10;
			System.out.println(rslt);
		}
	
	}
}