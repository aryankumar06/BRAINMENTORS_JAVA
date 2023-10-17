import java.util.Scanner;

public class sawp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number");
        int a = sc.nextInt();
        Scanner oo = new Scanner(System.in);
        System.out.println("ENter a number");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "" + b);
    }
}
