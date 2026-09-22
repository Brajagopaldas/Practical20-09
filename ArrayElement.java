import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        int posEven = 0;
        int posOdd = 0;
        int negEven = 0;
        int negOdd = 0;
        int zero = 0;

        
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    posEven++;
                } else {
                    posOdd++;
                }
            } else if (arr[i] < 0) {
                if (arr[i] % 2 == 0) {
                    negEven++;
                } else {
                    negOdd++;
                }
            } else {
                zero++;
            }
        }

        System.out.println("\n--- Classification Summary ---");
        System.out.println("Positive Even : " + posEven);
        System.out.println("Positive Odd  : " + posOdd);
        System.out.println("Negative Even : " + negEven);
        System.out.println("Negative Odd  : " + negOdd);
        System.out.println("Zero          : " + zero);

        sc.close();
    }
}

