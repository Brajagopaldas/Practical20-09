import java.util.Scanner;

public class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];

        
        System.out.println("Enter marks of 10 students:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        
        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;
        int passCount = 0;
        int failCount = 0;

        
        for (int i = 0; i < marks.length; i++) {
            
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            
            total += marks[i];

            
            if (marks[i] >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        double average = (double) total / marks.length;

        // Display results
        System.out.println("\n--- Student Marks Report ---");
        System.out.println("Highest Marks  : " + highest);
        System.out.println("Lowest Marks   : " + lowest);
        System.out.println("Average Marks  : " + average);
        System.out.println("Students Passed: " + passCount);
        System.out.println("Students Failed: " + failCount);

        sc.close();
    }
}
