import java.util.Scanner;

public class CalculateMoneySpent {

    public static void main(String[] args) {
        String name;
        int money;
        int total;
        double avg;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Your Money !!!");
        System.out.println();

        System.out.println("Hey, What is your name ? ");
        name = input.next();

        System.out.println("How much money did you spend at the club on Monday ?");
        money = input.nextInt();
        total = money;

        System.out.println("How much money did you spend at the club on Tuesday ?");
        money = input.nextInt();
        total = total + money;

        System.out.println("How much money did you spend at the club on Wednesday ?");
        money = input.nextInt();
        total = total + money;

        System.out.println("How much money did you spend at the club on Thursday ?");
        money = input.nextInt();
        total = total + money;

        System.out.println("How much money did you spend at the club on Friday ?");
        money = input.nextInt();
        total = total + money;

        System.out.println("How much money did you spend at the club on Saturday ?");
        money = input.nextInt();
        total = total + money;

        System.out.println("How much money did you spend at the club on Sunday ?");
        money = input.nextInt();
        total = total + money;

        avg = total/7;

        System.out.println("The Calculator Result");
        System.out.println("Hi " + name);
        System.out.println("Your total expenditure at the club this week is " + total);
        System.out.println("With a average daily expenditure of " + avg);

    }
}