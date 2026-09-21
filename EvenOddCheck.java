import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

      
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        int evenSum = 0;
        int oddSum = 0;

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
                evenSum += arr[i];
            } else {
                odd++;
                oddSum += arr[i];
            }
        }

        
        System.out.println("\n--- Summary ---");
        System.out.println("Count of even numbers: " + even);
        System.out.println("Count of odd numbers : " + odd);
        System.out.println("Sum of even numbers  : " + evenSum);
        System.out.println("Sum of odd numbers   : " + oddSum);

        sc.close();
    }
}

