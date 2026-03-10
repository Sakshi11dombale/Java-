import java.util.*;

public class DivisibleByFiveNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number for limt = ");
		int limit = sc.nextInt();

		for(int i=1; i<=limit; i++){
			if(i%5==0){
				System.out.println(i);
			}
			
		}

		
	}
}