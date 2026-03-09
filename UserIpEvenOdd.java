import java.util.*;

public class UserIpEvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("Enter a number = ");
		num = sc.nextInt();

		if(num%2==0){
			System.out.println("Entered number is even.");
		}
		else{
			System.out.println("Entered number is odd.");
		}
	}
}