import java.util.*;

public class HeightOfPerson{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your height=");
		int height = sc.nextInt();

		if(height>=190){
			System.out.println("You are taller.");
		}
		else if(height>=150 && height<190){
			System.out.println("Your height is average.");
		}
		else{
			System.out.println("Oppss..! You are dwarf.");
		}
	}
}