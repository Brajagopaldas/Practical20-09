import java.util.Scanner;

class NumberFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int[] number = new int[5]; 
        
        System.out.println("Enter 5 integers:");
        
        
        for (int i = 0; i < 5; i++) { 
            number[i] = sc.nextInt();
        } 
        
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < 5; i++) { 
            if (number[i] == search) { 
                found = true; 
                break; 
            } 
        } 
        
        if (found) { 
            System.out.println("Number is present"); 
        } else { 
            System.out.println("Number is not present"); 
        }
        
        sc.close();
    }
}
