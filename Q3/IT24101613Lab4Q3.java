import java.util.Scanner;
public class IT24101613Lab4Q3 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number=reader.nextDouble();
		String answer= number>0? "Positive": number<0? "Negative": "Zero";
		System.out.println("The number is : "+answer);
	}
}