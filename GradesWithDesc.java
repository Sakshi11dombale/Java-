import java.util.*;

public class GradesWithDesc{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Grades(S,A,B,C,D)= ");
		String grade = sc.nextLine();

		switch(grade){
			case "S":
				System.out.println("Your score is between 90 to 100");
				break;
			case "A":
				System.out.println("Your score is between 80 to 90");
				break;
			case "B":
				System.out.println("Your score is between 70 to 80");
				break;
			case "C":
				System.out.println("Your score is between 60 to 70");
				break;
			case "D":
				System.out.println("Your score is between 50 to 60");
				break;
			default:
				System.out.println("You have choosen wrong grade.");
				System.out.println("Please choose valid grade!");
		}
	}
}