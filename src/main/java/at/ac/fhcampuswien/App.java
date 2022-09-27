package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901");
        String stringToPrint = "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`\n";

        System.out.print(stringToPrint);
    }

    //todo Task 3
    public void sumOfLiterals() {
        char c = 'Z';
        int i = 0xFace;
        int i1 = 012;
        long l = 80L;
        float f = 44e-1f;
        float f1 = 5.5f;
        double d = 8.88e1;
        double f2 = 99.9;

        int sum = (int) c + i + i1 + (int) l + (int) f + (int) f1 + (int) d + (int) f2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();

        System.out.println(i1 + i2);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("n1 == n2");
        }

        if (n1 < n2) {
            System.out.println("n2 > n1");
        }

        if (n1 > n2) {
            System.out.println("n1 > n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        System.out.print("Enter annual Revenue: ");
        int input = scanner.nextInt();

        if (input < 0 || input >= 100000) {
            System.out.println("Invalid Revenue");
        }
        if (input >= 0 && input < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        if (input >= 20000 && input < 50000) {
            System.out.println("Average Sales Revenue");
        }
        if (input >= 50000 && input < 80000) {
            System.out.println("Good Sales Revenue");
        }
        if (input >= 80000 && input < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate() {
        System.out.print("Enter CommissionClass: ");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear() {
        System.out.print("Year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0) && year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        System.out.print("Number: ");
        int numberInput = scanner.nextInt();

        int firstDigit = numberInput % 10;
        numberInput /= 10;
        int secondDigit = numberInput % 10;
        numberInput /= 10;
        int thirdDigit = numberInput % 10;

        System.out.printf("%d%d%d\n", firstDigit, secondDigit, thirdDigit);
    }

    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}