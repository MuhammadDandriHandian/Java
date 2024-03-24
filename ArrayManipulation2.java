import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String[] args) {
        int changeNumber, indexToChange = 0;
        int number[] = {2, 6, 7, 3, 2, 4, 8, 7, 7, 2, 8, 3, 6, 8, 4, 5, 1};
        int lastIndex = -1;

        Scanner input = new Scanner(System.in);

        System.out.println("Array numbers");
        System.out.println("2, 6, 7, 3, 2, 4, 8, 7, 7, 2, 8, 3, 6, 8, 4, 5, 1");
        System.out.println("Merubah nilai dari arrays numbers !!");
        do {
            System.out.println("Masukan posisi yang mau diganti 1 - 17");
            indexToChange = input.nextInt();
        } while (indexToChange < 1 || indexToChange > 17);

        System.out.println("Masukan nilai yang akan diinputkan kedalam array number");
        changeNumber = input.nextInt();

        for(int i=0; i<number.length; i++){
            if(indexToChange - 1 == i){
                number[i] = changeNumber;
            }
        }

        System.out.println("Menampilkan array numbers setelah dirubah");
        for(int i=0; i<number.length; i++){
            if (lastIndex != -1){
                System.out.print(", ");
            }
            System.out.print(number[i]);
            lastIndex = i;
        }
    }
}
