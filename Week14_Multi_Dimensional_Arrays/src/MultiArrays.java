
public class MultiArrays {

	public static void main(String[] args) {
		double[][][] scores = {
				{{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
				{{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
				{{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
				{{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
				{{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
				{{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}
		};

		//for each student, for each exam, show the total score
		for (int student = 0 ; student < scores.length ; student++) {
			System.out.println("Student " + (student + 1) + "'s Exam Scores:");

			for (int exam = 0 ; exam < scores[student].length ; exam++) {
				System.out.print("\tExam: " + (exam + 1) + ": ");
				int examScore = 0;

				for (int part = 0 ; part < scores[student][exam].length ; part++) {
					examScore += scores[student][exam][part];
				}

				System.out.print(examScore + "\n");
			}
		}
	}
}
