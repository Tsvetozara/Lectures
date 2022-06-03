import java.util.Scanner;

public class HomeWorkTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a1: ");
        double a1 = sc.nextDouble();

        System.out.println("Enter number a2: ");
        double a2 = sc.nextDouble();

        System.out.println("Enter number a3: ");
        double a3 = sc.nextDouble();

        a3 = a3 + a2 + a1;

        a2 = a3 - (a1 + a2);
        System.out.println("a2 is now " + a2);

        a1 = a3 - (a1 + a2);
        System.out.println("a1 is now " + a1);

        a3 = a3 - (a1 + a2);
        System.out.println("a3 is now " + a3);
    }
}