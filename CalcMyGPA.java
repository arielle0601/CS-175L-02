import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcMyGPA {

	public static void main(String[] args) {
	
	Scanner kb = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("How many classes do you want to enter?");
		int numClasses = kb.nextInt();
		
		double totalCreditHours = 0;
		double totalGradePoints = 0;

		for (int i = 1; i <= numClasses; i ++) {
		
			System.out.println("Enter course information separated by commas "
				+ "(title, credit hours, letter grade) or type Q to quit:");
			String input = kb.next();
			
			if (input.equals("Q")) {
				System.out.println("you quit");
				break;
			}
			
			String array1[]= input.split(",");
			
			String courseTitle = array1[0];
			double creditHours = Double.parseDouble(array1[1]);
			String letterGrade = array1[2].toUpperCase();
			
			totalCreditHours += creditHours;
			
			double gradePoints = 0;
		
			if (letterGrade.equals("A")) {
				gradePoints = creditHours * 4.00;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("A-")) {
				gradePoints = creditHours * 3.70;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("B+")) {
				gradePoints = creditHours * 3.33;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("B")) {
				gradePoints = creditHours * 3.00;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("B-")) {
				gradePoints = creditHours * 2.70;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("C+")) {
				gradePoints = creditHours * 2.30;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("C")) {
				gradePoints = creditHours * 2.00;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("C-")) {
				gradePoints = creditHours * 1.70;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("D+")) {
				gradePoints = creditHours * 1.30;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("D")) {
				gradePoints = creditHours * 1.00;
				totalGradePoints += gradePoints;
			} else if (letterGrade.equals("D-")) {
				gradePoints = creditHours * 0.70;
				totalGradePoints += gradePoints;
			} else {
				gradePoints = creditHours + 0;
			}
			
			System.out.println("Course: " + courseTitle + " Credit Hours: " + df.format(creditHours) + 
					" Grade: " + letterGrade + " Grade Points: " + df.format(gradePoints));
			System.out.println("");
		
		}
		
		double GPA = totalGradePoints/totalCreditHours;
		System.out.println(df.format(totalCreditHours) + " Total credit hours attempted.");
		System.out.println(df.format(totalGradePoints) + " Total grade points.");
		System.out.println("GPA = " + df.format(GPA));

	}

}
