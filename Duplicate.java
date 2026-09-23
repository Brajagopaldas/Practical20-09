import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        boolean[] r = new boolean[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) a[i] = sc.nextInt();

        System.out.println("\n ------- Duplicate Elements  --------");
        for (int i = 0; i < 10; i++) {
            if (r[i]) continue;

            int count = 1;
            for (int j = i + 1; j < 10; j++) {
                if (a[i] == a[j]) {
                    count++;
                    r[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(a[i] + " occurs " + count + " times");
            }
        }
    }
}

