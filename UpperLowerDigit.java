import java.util.*;

public class UpperLowerDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character= ");
		char c = sc.next().charAt(0);

		if(Character.isDigit(c)){
			System.out.println("Entered character is a digit.");
		}
		else if(Character.isUpperCase(c)){
			System.out.println("Entered character is in Upper Case");
		}
		else if(Character.isLowerCase(c)){
			System.out.println("Entered character is in Lower Case");
		}
		else{
			System.out.println("Special character");
		}
	}
}