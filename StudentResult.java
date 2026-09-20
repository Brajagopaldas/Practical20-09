import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student RollNo: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter Mark for Subject 1 ");
        int m1 = sc.nextInt();

        System.out.println("Enter Mark for Subject 2 ");
        int m2 = sc.nextInt();

        System.out.println("Enter Mark for Subject 3");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        String result;
        if (m1 >= 33 && m2 >= 33 && m3 >= 33) {
            result = "Passed";
        } else {
            result = "Falled";
        }

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("Result : " + result);

    }
}
