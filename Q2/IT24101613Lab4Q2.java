import java.util.Scanner;
public class IT24101613Lab4Q2 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100): ");
		double exam_marks=reader.nextDouble();
		if (exam_marks<0 || exam_marks>100) {
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		System.out.print("Please enter lab submission marks (out of 100): ");
		double lab_marks=reader.nextDouble();
		if (lab_marks<0 || lab_marks>100) {
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
		}
		System.out.print("Please enter the percentage given for the exam: ");
		double exam_pt=reader.nextDouble();
		System.out.print("Please enter the percentage given for the lab submission: ");
		double lab_pt=reader.nextDouble();
		if ( (exam_pt+lab_pt) !=100.0) {
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		double final_marks=(exam_marks*exam_pt/100) + (lab_marks*lab_pt/100);
		System.out.println("Final Exam Mark is : "+final_marks);

	}
}
