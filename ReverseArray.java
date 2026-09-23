import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nReversed Array with Conditions:");
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];

            if (val == 0) {
                System.out.print("Zero ");
            } else if (val < 0) {
                System.out.print("Negative ");
            } else if (val % 2 == 0) {
                System.out.print("Even ");
            } else {
                System.out.print("odd ");
            }
        }
        System.out.println();

        sc.close();
    }
}

