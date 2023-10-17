import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number= ");
        int a = sc.nextInt();
        int rev = 0;
        rev = a % 10;
        a = a / 10;
        rev = a % 100;
        a = a / 10;
        if (rev == a) {
            System.out.println("panlindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

}
