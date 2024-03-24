import java.util.Scanner;

public class ArrayManipulation1 {
    public static void main(String[] args) {
        int findNumber = 0;
        int count = 0;
        int number[] = {2, 6, 7, 3, 2, 4, 8, 7, 7, 2, 8, 3, 6, 8, 4, 5, 1, 7};
        int lastIndex = -1;
        boolean isThere = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Mencari angka yang ada di array numbers !!");
        System.out.print("Masukan angka yang dicari : ");
        findNumber = input.nextInt();

        for(int i = 0; i < number.length; i++){
            if (findNumber == number[i]){
                isThere = true;
                count++;
            }
        }

        if(isThere == true){
            System.out.println("Angka " + findNumber + " yang anda cari ditemukan di array numbers");
            System.out.println("Ada " + count + " angka " + findNumber +" didalam array number");
            System.out.println("Yaitu pada index ke :");
            for (int i = 0; i < number.length; i++){
                if (findNumber == number[i]){
                    if (lastIndex != -1){
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    lastIndex = i;
                }
            }
            System.out.println();
        } else {
            System.out.println("Angka " + findNumber + " yang anda cari tidak ditemukan di array");
        }
    }
    
}
