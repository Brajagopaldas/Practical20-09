import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        int total = 0, high = 0, low = 0;
        int p75 = 0, p60 = 0, p40 = 0, fail = 0;

        System.out.println("Enter marks of 10 students:");
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];

            
            if (marks[i] > marks[high]) high = i;
            if (marks[i] < marks[low]) low = i;

            
            if (marks[i] >= 75) p75++;
            else if (marks[i] >= 60) p60++;
            else if (marks[i] >= 40) p40++;
            else fail++;
        }

        System.out.println("\nHighest Marks : " + marks[high] + " (Student " + (high + 1) + ")");
        System.out.println("Lowest Marks  : " + marks[low] + " (Student " + (low + 1) + ")");
        System.out.println("Average Marks : " + (total / 10.0));
        System.out.println("Scoring >= 75 : " + p75);
        System.out.println("Scoring 60-74 : " + p60);
        System.out.println("Scoring 40-59 : " + p40);
        System.out.println("Failed (< 40) : " + fail);

        sc.close();
    }
}

