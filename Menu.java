import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 integers for the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n---------------- MENU ----------------");
            System.out.println("1. Display all elements");
            System.out.println("2. Find largest");
            System.out.println("3. Find smallest");
            System.out.println("4. Calculate sum");
            System.out.println("5. Calculate average");
            System.out.println("6. Count even numbers");
            System.out.println("7. Count odd numbers");
            System.out.println("8. Search an element");
            System.out.println("9. Exit");
            System.out.println("--------------------------------------");
            System.out.print("Enter choice (1-9): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int i = 1; i < 10; i++) {
                        if (arr[i] > max) max = arr[i];
                    }
                    System.out.println("Largest element = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int i = 1; i < 10; i++) {
                        if (arr[i] < min) min = arr[i];
                    }
                    System.out.println("Smallest element = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < 10; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of elements = " + sum);
                    break;

                case 5:
                    int total = 0;
                    for (int i = 0; i < 10; i++) {
                        total += arr[i];
                    }
                    double avg = total / 10.0;
                    System.out.println("Average of elements = " + avg);
                    break;

                case 6:
                    int evenCount = 0;
                    for (int i = 0; i < 10; i++) {
                        if (arr[i] % 2 == 0) evenCount++;
                    }
                    System.out.println("Count of even numbers = " + evenCount);
                    break;

                case 7:
                    int oddCount = 0;
                    for (int i = 0; i < 10; i++) {
                        if (arr[i] % 2 != 0) oddCount++;
                    }
                    System.out.println("Count of odd numbers = " + oddCount);
                    break;

                case 8:
                    System.out.print("Enter number to search: ");
                    int key = sc.nextInt();
                    int pos = -1;
                    for (int i = 0; i < 10; i++) {
                        if (arr[i] == key) {
                            pos = i;
                            break;
                        }
                    }
                    if (pos != -1) {
                        System.out.println(key + " found at index " + pos + " (Position " + (pos + 1) + ")");
                    } else {
                        System.out.println(key + " not found in the array.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option! Please enter a number from 1 to 9.");
            }
        } while (choice != 9);

        sc.close();
    }
}

