import java.util.Scanner;
public class ExamAverage {
	
	public void examAverage() {
		Scanner keys = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		int highestScore = -1;
		int lowestScore = 101;
		int count = 0;
		int sum = 0;
		int input = 0;
		
		System.out.println("Enter an exam score between 0 and 100. A value of < 0 breaks the loops.");
		input = keys.nextInt();
		if (input < 0) {
			System.out.println("You entered a sentinal value.");
			System.exit(0);
			}
		while (input >= 0 && input < 101) {
			if (input > highestScore) {
				highestScore = input;
				}
			if (input < lowestScore) {
				lowestScore = input;
				}
			if (input >= 90) {
				A++;
				}
			else if (input >= 80) {
				B++;
				}
			else if (input >= 70) {
				C++;
				}
			else if (input >= 60) {
				D++;
				}
			else {
				F++;
				}					
			count++;
			sum += input;
			input = keys.nextInt();					
			}
		System.out.println("Total number of scores: " + count);
		System.out.println("Number of As: " + A);
		System.out.println("Number of Bs: " + B);
		System.out.println("Number of Cs: " + C);
		System.out.println("Number of Ds: " + D);
		System.out.println("Number of Fs: " + F);	
		System.out.println("Lowest score: " + lowestScore);
		System.out.println("Highest score: " + highestScore);
		System.out.println("Average: " + ((double)(sum / count)));
		}
	
	public static void main (String args[]) {
		ExamAverage demo =  new ExamAverage();
		demo.examAverage();			
	}
}

