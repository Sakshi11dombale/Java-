import java.util.*;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number for range=");
		int range = sc.nextInt();
		
		if(range<=1){
			System.out.println("Not Prime.");
			return;
		}
		for(int i=2;i*i<=range;i++){
			if(range%i==0){
				System.out.println("Not prime.");
				return;
			}
		}
		System.out.println("Prime.");
	}
}