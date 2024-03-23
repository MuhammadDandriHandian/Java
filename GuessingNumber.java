import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        int number;
        int random = (int) (Math.random() * 10);
        boolean pass = false;

        Scanner input = new Scanner(System.in);
        
        System.out.println("I am thinking of number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");
        System.out.print("Enter your number : ");

        for (int i = 0; i < 3; i++){
            number = input.nextInt();
            if (number == random){
                System.out.println("Good job, your guees is true!");
                System.out.println("You have won the game!!!");
                pass = true;
                break;
            } else if (Math.abs(number - random) == 1){
                System.out.println("HOT!!");
            } else if (Math.abs(number - random) == 2){
                System.out.println("WARM!");
            } else {
                System.out.println("Cold");
            }
        }
        if (pass == false){
            System.out.println("The correct number was " + random);
            System.out.println("YOU ARE A LOSER!!!!");
        }
    }
}
