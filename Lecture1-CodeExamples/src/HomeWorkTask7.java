import java.util.Scanner;

public class HomeWorkTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What time is it?");
        int time = sc.nextInt();

        System.out.println("How much money do you have?");
        double money = sc.nextDouble();

        System.out.println("Are you sick?");
        boolean sick = sc.nextBoolean();

        if (money <= 20 && sick) {
            System.out.println("I am sick, I have no money and I will not be going out");
        } else if (money >= 20 && sick) {
            System.out.println("I am sick but I have money and I will go out to buy food and drugs");
        }
        else if (money <= 20) {
            System.out.println("I have no money but I am happy and healthy and I am going out for a walk");
        }
        else if (time <= 9 || sick) {
            System.out.println("It is the time when I sleep");
        }
        else if (time >= 9 && time <= 24) {
            System.out.println("It is the time when I am awake");
        }
        else {
            System.out.println("I am happy, rich and healthy and it is crazy non existing hour");
        }
    }
}