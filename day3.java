import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        // // this is traditional for loop syntax
        // for (int i = 0; i < 5; i++) {
        // System.out.println("kill me " + i);
        // }

        // String Array[] = { "aryan", "kanishka", "himanshu", "khusboo" };
        // // for (int i = 0; i < 4; i++) {
        // // System.out.println(Array[i]);}

        // for(String name : Array){
        // System.out.println(name);
        // }
        //

        // calculator using switch case
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num1 value= ");
        // int a = sc.nextInt();
        // System.out.println("Enter num2 value= ");
        // int b = sc.nextInt();
        // System.out.println(" Select operation \n Add as 1\n sub as 2 \n Mul as 3 \n
        // Div as 4 ");
        // int op = sc.nextInt();
        // switch (op) {
        // case 1:
        // System.out.println("The addition of num is= " + (a + b));
        // break;
        // case 2:
        // System.out.println("The subtraction of num is= " + (a - b));
        // break;
        // case 3:
        // System.out.println("The multiplication of num is= " + (a * b));
        // break;
        // case 4:
        // System.out.println("The division of num is= " + (a / b));
        // break;
        // default:
        // System.out.println("Wrong choice");

        // }
        // sc.close();

        // Simple ATM Machine: Implement a simple ATM machine program using a switch
        // statement.
        // Allow users to check their balance, deposit money, and withdraw money. Keep
        // track of the user's account balance.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("SET PIN ");
        // int pin = sc.nextInt();
        // System.out.println(
        // " Select operation \n press 1 for deposite money. \n press 2 for check your
        // balance \n press 3 for withdarw your money\n");
        // int op = sc.nextInt();
        // int acc = 0;
        // switch (op) {
        // case 1:
        // System.out.println("Enter Money size= ");
        // acc = sc.nextInt();
        // System.out.println("Your money is successfully deposte :-) ");

        // break;
        // case 2:
        // System.out.println("Your Balance is= " + acc);

        // break;
        // case 3:
        // System.out.println("Enter PIN ");
        // int pin1 = sc.nextInt();
        // if (pin1 == pin) {
        // System.out.println("Enter the amount= ");
        // int withdarw = sc.nextInt();
        // int newacc =acc- withdarw;
        // System.out.println("Now your current balance is=" + newacc);
        // } else {
        // System.out.println("wrong pin :-(");
        // }
        // break;

        // default:
        // System.out.println("Wrong choice");

        // }

        // Season Determiner: Create a program that takes a month as input and uses a
        // switch statement to determine the season
        // (e.g., spring, summer, fall, or winter) associated with that month.

        // Scanner sc = new Scanner(System.in);
        // final int Jan = 1;
        // final int Feb = 2;
        // final int Mar = 3;
        // final int Apr = 4;
        // final int May = 5;
        // final int Jun = 6;
        // final int July = 7;
        // final int Aug = 8;
        // final int Sep = 9;
        // final int Oct = 10;
        // final int Nov = 11;
        // final int Dec = 12;

        // System.out.println("Enter Month");

        // int choice = sc.nextInt();
        // switch(choice){
        // case 1:
        // System.out.println("This WINTER")
        // break;
        // case 2:
        // System.out.println("This WINTER")
        // break; case 3:
        // System.out.println("This SUMMER")
        // break; case 4:
        // System.out.println("This SUMMER")
        // break; case 5:
        // System.out.println("This SUMMER")
        // break; case 6:
        // System.out.println("This WINTER")
        // break; case 7:
        // System.out.println("This WINTER")
        // break; case 8:
        // System.out.println("This WINTER")
        // break;
        // case 9:
        // System.out.println("This WINTER")
        // break; case 10:
        // System.out.println("This WINTER")
        // break;
        // case 11:
        // System.out.println("This WINTER")
        // break;
        // case 12:
        // System.out.println("This WINTER")
        // break;
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a day of the week: ");
        // String day = scanner.nextLine().toLowerCase();

        // switch (day) {
        // case "monday":
        // case "tuesday":
        // case "wednesday":
        // case "thursday":
        // case "friday":
        // System.out.println(day + " is a weekday.");
        // break;
        // case "saturday":
        // case "sunday":
        // System.out.println(day + " is a weekend day.");
        // break;
        // default:
        // System.out.println("Invalid input. Please enter a valid day of the week.");
        // }

        // scanner.close();
        String currentState = "Red";

        switch (currentState) {
        case "Red":
        System.out.println("Stop! The light is Red.");
        currentState = "Yellow";
        break;
        case "Yellow":
        System.out.println("Prepare to stop. The light is Yellow.");
        currentState = "Green";
        break;
        case "Green":
        System.out.println("Go! The light is Green.");
        currentState = "Red";
        break;
        default:
        System.out.println("Invalid state.");
        }

    

    }
}
