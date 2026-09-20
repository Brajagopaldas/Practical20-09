import java.util.Scanner;
public class CheckNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 Integer");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }    else {
                zero++;
            }
        }
        System.out.println("Positve : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zero : " + zero);
    }
}
