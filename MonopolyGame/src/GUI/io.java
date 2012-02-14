import java.util.Scanner;

//Type in "Zach" and the program will read it into the String answer and match it to the String myName and return true
public class io{

	public static void main(String [] args){
		System.out.println("Enter your name:");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next();
		String myName = "Zach";
		if(answer.equals(myName)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
			}
		}
}
