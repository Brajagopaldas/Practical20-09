import java.util.Scanner;

public class OccursCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

 
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("\nEnter number to search: ");
        int target = sc.nextInt();

        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

       
        System.out.println("\n" + target + " Occurs" + count + " times");

        sc.close();
    }
}

