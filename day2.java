import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the character");
        // char op = sc.CharAt();
        // if (op == 'a' || op == 'e' || op == 'i' || op == 'o' || op == 'u') {
        // System.out.println("Vowel");
        // } else
        // System.out.println("Consonant");

        // 1.Vowel or Consonant
        // 2.Grading System
        // 3.days (1,2,3)
        // 4.palindrome no./string
        // 5.prime Number

        // Grading System
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number= ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double result = (a + b + c) / 300;
        if (result >= 50 && result < 60) {
            System.out.println("your grade is E");

            if (result >= 60 && result < 70) {
                System.out.println("your grade is D");
            }
            if (result >= 70 && result < 80) {
                System.out.println("your grade is c");
            }
            if (result >= 80 && result < 90) {
                System.out.println("your grade is B");
            }
            if (result >= 90 && result < 100) {
                System.out.println("your grade is A");
            }
            if (result >= 95 && result < 100) {
                System.out.println("your grade is A+");

            } else
                System.out.println("F");
        }

        sc.close();
    }
}