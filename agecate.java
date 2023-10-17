import java.util.Scanner;

public class agecate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AGe= ");
        int age = sc.nextInt();
        System.out.println((age >= 18) ? "Teenager " : "child", ((age >= 24) ? "Adult " : "older"));

    }
}
