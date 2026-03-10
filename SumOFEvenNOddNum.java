import java.util.*;

public class SumOFEvenNOddNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to set the limit = ");
		int num = sc.nextInt();

		int evenSum = 0;
		int oddSum = 0;

		for(int i=1; i<=num; i++){
			if(i%2==0){
				evenSum = evenSum + i ;

			}
			else{
				oddSum = oddSum + i ;
				
			}
		}

	System.out.println("Sum of even : " + evenSum);
	System.out.println("Sum of odd : " + oddSum);
	}
}