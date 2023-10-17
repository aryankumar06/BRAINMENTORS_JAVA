import java.util.Scanner;

public class EvenODD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number");
        int num = sc.nextInt();

        System.out.println((num % 2 == 0) ? " even" : "odd");
    }

}
