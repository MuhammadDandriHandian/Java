import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {
        String name, gender, day;
        int age, attractive, money;
        String result = "";

        Scanner input = new Scanner(System.in);

        System.out.println("=============== Input ===============");
        System.out.println("Welcome to reservation cafe");
        System.out.println();
        System.out.print("Please insert your name : ");
        name = input.next();
        System.out.print("How old are you ? ");
        age = input.nextInt();
        System.out.print("What is ur gender (male/female)? ");
        gender = input.next();
        System.out.print("How attractive are u ? (1-10) ");
        attractive = input.nextInt();
        System.out.print("How much ur money ? ");
        money = input.nextInt();
        System.out.println("What do you want to make a reservation ? ");
        day = input.next();

        if (day.equalsIgnoreCase("monday")){
            if (age >= 20 && age <=30 && money >= 500){
                result = "Reservation successfully, you can order on monday. Young Night";
            } else {
                result = "Sorry, u can't order on monday. Because it is for young night";
            }
        } else if (day.equalsIgnoreCase("tuesday")){
            if (age >= 32 && age <=50 && money >= 250){
                result = "Reservation successfully, you can order on tuesday. Oldest night";
            } else {
                result = "Sorry, u can't order on tuesday. Because it is for oldest night";
            }
        } else if (day.equalsIgnoreCase("wednesday")){
            if (age >= 20 && age <= 35 && gender.equalsIgnoreCase("female") && attractive > 8 && money >= 300){
                result = "Reservation successfully, you can order on wednesday. Ladies night";
            } else {
                result = "Sorry, u can't order on wednesday. Because it is for ladies night";
            }
        } else if (day.equalsIgnoreCase("thursday")){
            if (age >= 21 && age <= 30 && gender.equalsIgnoreCase("male") && money >= 1000){
                result = "Reservation successfully, you can order on thursday. Party night for single";
            } else if (age >= 21 && age <= 30 && gender.equalsIgnoreCase("female") && money >= 300 && attractive > 8){
                result = "Reservation successfully, you can order on thursday. Party night for single";
            } else {
                result = "Sorry, u can't order on thursday. Because it is for single";
            }
        } else if (day.equalsIgnoreCase("friday")){
            if (gender.equalsIgnoreCase("female") && age >= 31 && age <= 45 && money >= 1000){
                result = "Reservation successfully, you can order on friday. Women night";
            } else if (gender.equalsIgnoreCase("male") && age >= 21 && age <= 25 && attractive > 8){
                result = "Reservation successfully, you can order on friday. Women night";
            } else {
                result = "Sorry, u can't order on friday. Because it is for women";
            }
        } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")){
            if (age >= 18 && age <= 60 && money >= 100){
                result = "Reservation successfully, you can order on saturday/sunday";
            } else {
                result = "Sorry, u can't order";
            }
        } else {
            result = "Please enter the day corectly";
        }

        System.out.println("=============== Output ===============");
        System.out.println("Hi " + name + ", thankyou for using our application." );
        System.out.println("Following results for ur reservation : ");
        System.out.println(result);

    }
    
}
