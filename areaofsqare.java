import java.util.Scanner;

public class areaofsqare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value= ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        double pi = 3.14;
        System.out.println("area of sqaure= " + a * b);
        System.out.println("area of circle= " + pi * r * r);
    }

}
