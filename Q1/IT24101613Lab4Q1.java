import java.util.Scanner;
public class IT24101613Lab4Q1 {
	public static void main(String [] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number=reader.nextDouble();
		if (number>0) {
			System.out.println("The number is: Positive");
		}
		else if (number<0) {
			System.out.println("The number is: Negative");
		}
		else if (number==0) {
			System.out.println("The number is Zero");
		}
	}
}
