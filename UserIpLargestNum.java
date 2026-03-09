import java.util.*;

public class UserIpLargestNum{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter values of numbers = ");
		System.out.print("Number 1 = ");
		int num1 = sc.nextInt();

		System.out.print("Number 2 = ");
		int num2 = sc.nextInt();

		System.out.print("Number 3 = ");
		int num3 = sc.nextInt();

		if(num1 > num2 && num1 > num3){
			System.out.println("Number 1 is greater.");
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("Number 2 is greater.");
		}
		else{
			System.out.println("Number 3 is greater.");
		}
	}
}