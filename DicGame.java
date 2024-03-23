import java.util.Scanner;

public class DicGame {
    public static void main(String[] args) {
        int roll, turnTotal;
        int ptot = 0;
        int ctot = 0;
        String choice = "";

        Scanner input = new Scanner(System.in);

        do {
            if(ptot < 100){
                turnTotal = 0;
                System.out.println("Computer has " + ctot + " points");

                do{
                    roll = 1 + (int) (Math.random() * 6);
                    System.out.println("\tComputer rolled a " + roll);
                    if (roll == 1){
                        System.out.println("\tThat ends its turn");
                        turnTotal = 0;
                    } else {
                        turnTotal += roll;
                        System.out.print("\tComputer has " + turnTotal);
                        System.out.println(" points so far this round.");
                        if (turnTotal < 10){
                            System.out.println("\tComputer will roll again");
                        }
                    }
                } while (roll != 1 && turnTotal < 10);

                ctot += turnTotal;
                System.out.print("\tComputer ends the round with ");
                System.out.println(ctot + " points");
            }

            turnTotal = 0;
            System.out.println("You have " + ptot + "points");

            do{
                roll = 1 + (int) (Math.random() * 6);
                System.out.println("\tYou rolled a " + roll);
                if (roll == 1){
                    System.out.println("\tThat ends your turn");
                    turnTotal = 0;
                } else {
                    turnTotal += roll;
                    System.out.print("\tYou have " + turnTotal + " points");
                    System.out.println(" so far this round");
                    System.out.print("\tWould you like to \"roll\" again");
                    System.out.print(" or \"hold\"? ");
                    choice = input.next();
                }
            } while(roll != 1 && choice.equals("roll"));

            ptot += turnTotal;
            System.out.println("\tYou end the round with " + ptot + " points");
        } while(ptot < 50 && ctot < 50);

        if (ptot > ctot){
            System.out.println("Humanity wins!!!");
        } else {
            System.out.println("Computer wins");
        }
    }
}
