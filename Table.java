import java.util.*;

public class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a table number which you want to display=");
		int tablenum = sc.nextInt();

		for(int i=1; i<=10; i++){
			System.out.println(tablenum*i);
		}
	}
}