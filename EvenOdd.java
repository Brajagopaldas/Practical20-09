import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];

        System.out.println("Enter 5 integers : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println("Even : ");
            } else
                System.out.println("Odd : ");
        }
        sc.close();
    }

}
