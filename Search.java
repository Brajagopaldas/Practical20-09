import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        System.out.print("Enter search number: ");
        int key = sc.nextInt();

        int first = -1, count = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == key) {
                if (first == -1) first = i;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Status: Exists");
            System.out.println("First Index: " + first);
            System.out.println("Occurrences: " + count);
        } else {
            System.out.println("Element not found.");
        }
    }
}

