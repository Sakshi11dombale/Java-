import java.util.*;

public class VowelOrConso{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter character to check whether it is vowel or consonent=");
		char character = sc.next().charAt(0);
		
		String vowels = "aeiouAEIOU";

			if(vowels.contains(String.valueOf(character))){
				System.out.println("Entered character is vowel");
				
			}
			else if(Character.isDigit(character)){
				System.out.println("Entered character is neither vowel nor consonent.");
				
			}
			else if(Character.isLetter(character)){
				System.out.println("Entered character is consonent.");
				
			}
			else{
				System.out.println("Enter charater is the special symbol or character.");
			}
	}
}