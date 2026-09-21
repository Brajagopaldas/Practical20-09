import java.util.Scanner;

class PassedFailed { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[] marks = new int[5]; 
        int total = 0; 
        boolean passed = true; 

        
        System.out.println("Enter 5 numbers:"); 

        
        for (int i = 0; i < marks.length; i++) { 
            System.out.print("subject " + (i + 1) + ": "); 
            marks[i] = sc.nextInt(); 
            total += marks[i]; 

            
            if (marks[i] < 40) { 
                passed = false; 
            } 
        } 

        double percentage = (double) total / marks.length; 
        String grade; 

        if (percentage >= 90) { 
            grade = "A+"; 
        } else if (percentage >= 80) { 
            grade = "A"; 
        } else if (percentage >= 70) { 
            grade = "B"; 
        } else if (percentage >= 60) { 
            grade = "C"; 
        } else if (percentage >= 50) { 
            grade = "D"; 
        } else if (percentage >= 40) { 
            grade = "E"; 
        } else { 
            grade = "F"; 
        } 

        System.out.println("\n----- Result Summary -----"); 
        System.out.println("Total Marks :" + total + " / 500"); 
        System.out.println("Percentage :" + percentage + "%"); 
        
       
        System.out.println("Grade :" + grade); 

        if (passed) { 
            System.out.println("\nPasses all Subjects"); 
        } else { 
            System.out.println("Failed"); 
        } 
        
       
        sc.close();
    } 
}
