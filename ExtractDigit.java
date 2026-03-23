import java.util.*;

public class ExtractDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a two digit or more than two digit number = ");
		int num = sc.nextInt();
	
		int digit ;

		while(num != 0 ){
			digit = num % 10;
			System.out.println(digit);
			num = num / 10;
		}
	}
}