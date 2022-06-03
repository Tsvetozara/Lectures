import java.util.Scanner;

public class HomeWorkTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number A: ");
        double numberA = sc.nextDouble();

        System.out.println("Enter number B: ");
        double numberB = sc.nextDouble();

        System.out.println("Enter number C: ");
        double numberC = sc.nextDouble();

        if (numberA > numberC && numberB < numberC) {
            System.out.println("Number C is between number A and number B");
        } else if (numberA < numberC && numberB > numberC) {
            System.out.println("Number C is between number A and number B");
        } else System.out.println("Number C is not between number A and number B");
        {
        }
    }
}