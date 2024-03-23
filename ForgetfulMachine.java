import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Waht city is the capital of France? ");
        keyboard.next();

        System.out.println("What is 6 multiple by 7 ?");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 0.1? ");
        keyboard.nextFloat();

        System.out.println("Is there anything else you would like to say ? ");
        keyboard.next();
    }
    
}
