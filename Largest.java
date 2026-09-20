import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        
        System.out.println("Enter 5 integers : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        
        System.out.println("The largest number is: " + max);
        sc.close();
    }
}
