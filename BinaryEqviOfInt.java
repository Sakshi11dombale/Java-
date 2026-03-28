import java.util.*;

public class BinaryEqviOfInt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int number = sc.nextInt();
		int binary=0;
		int rem ;

		while(number != 0){
			rem = number % 2;
			System.out.print(rem);
			number = number / 2;
		}
	}
}