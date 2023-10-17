public class day4 {
    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        // for (int j = 0; j <= 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == 1 || j == 1 || i == 5 || j == 5) {
        // System.out.print("*");
        // } else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 0; j <= i; j++) {

        // System.out.print("*");
        // for (int k = 0; k <= 5 - i; k++) {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();

        // for (int i = 0; i <= 5; i++) {
        // for (int j = 0; j <= 5-i; j++) {

        // System.out.print(" ");}
        // for (int k = 0; k <= 5; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (i ==1|| j == 1|| i == j|| i==5) {
        // System.out.print("*");
        // }
        // else
        // System.out.print(" ");
        // }
        // System.out.println();

        // }
        // doubt hai ismai

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
