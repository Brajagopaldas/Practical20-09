import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        int largest = arr[0];
        int smallest = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        
        int diff = largest - smallest;

        
        System.out.println("\nLargest number  : " + largest);
        System.out.println("Smallest number : " + smallest);
        System.out.println("Difference      : " + diff);

        g
        System.out.print("Difference Category: ");
        if (diff > 50) {
            System.out.println("Greater than 50");
        } else if (diff >= 20 && diff <= 50) {
            System.out.println("Between 20 and 50");
        } else {
            System.out.println("Less than 20");
        }

        sc.close();
    }
}

