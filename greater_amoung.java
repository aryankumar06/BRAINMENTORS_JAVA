import java.util.Scanner;

public class greater_amoung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a > b) && (a > c) ? "a is bada" : ((b > a) && (b > c) ? "b is bada" : "c is bada"));

    }

}
