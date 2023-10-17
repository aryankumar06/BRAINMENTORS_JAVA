import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ending point");
        int end = sc.nextInt();
        System.out.println("starting");
        int k = sc.nextInt();
        sc.close();
        for (int i = k; i < end; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j * j > i) {
                    System.out.println("prime " + i);
                }
            }

        }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("ending point:");
        // int end = sc.nextInt();
        // System.out.println("starting point:");
        // int start = sc.nextInt();
        // sc.close();

        // System.out.println("Prime numbers between " + start + " and " + end + ":");
        // for (int i = start; i <= end; i++) {
        // if (i > 1) {
        // boolean isPrime = true;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.println(i);
        // }
        // }
        // }

    }
}