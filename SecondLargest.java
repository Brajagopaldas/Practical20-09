import java.util.Scanner;

class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < 10; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
            else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}
