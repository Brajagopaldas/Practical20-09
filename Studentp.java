import java.util.Scanner;

public class Studentp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] marks = new int[5];
        String[] grades = new String[5];
        String[] results = new String[5];

        int totalMarks = 0;
        int pass = 0;
        int fail = 0;

        System.out.println("Enter name and marks (out of 100) for 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Name : ");
            names[i] = sc.next();
            System.out.print("Marks: ");
            marks[i] = sc.nextInt();

            totalMarks += marks[i];

            if (marks[i] >= 90) {
                grades[i] = "A+";
            } else if (marks[i] >= 80) {
                grades[i] = "A";
            } else if (marks[i] >= 70) {
                grades[i] = "B";
            } else if (marks[i] >= 60) {
                grades[i] = "C";
            } else if (marks[i] >= 50) {
                grades[i] = "D";
            } else if (marks[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }

            if (marks[i] >= 40) {
                results[i] = "Pass";
                pass++;
            } else {
                results[i] = "Fail";
                fail++;
            }
        }

        int high = 0;
        int low = 0;

        for (int i = 1; i < 5; i++) {
            if (marks[i] > marks[high]) {
                high = i;
            }
            if (marks[i] < marks[low]) {
                low = i;
            }
        }

        double classAvg = totalMarks / 5.0;

        System.out.println("\n------------------------------------------------------");
        System.out.println("Name\t\tMarks\tGrade\tResult");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t\t" + marks[i] + "\t" + grades[i] + "\t" + results[i]);
        }
        System.out.println("=================================================");

        System.out.println("\n--- Batch Statistics ---");
        System.out.println("Highest Scorer  : " + names[high] + " (" + marks[high] + " marks)");
        System.out.println("Lowest Scorer   : " + names[low] + " (" + marks[low] + " marks)");
        System.out.println("Class Average   : " + classAvg);
        System.out.println("Passed Students : " + pass);
        System.out.println("Failed Students : " + fail);

        sc.close();
    }
}
