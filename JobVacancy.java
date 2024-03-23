import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        String nama, jenisKelamin, lulusan;
        int umur, pengalaman;
        double penampilan;
        Boolean kordinator, admin, kordinator1, kordinator2, admin1, admin2;
     
        Scanner input = new Scanner(System.in);

        System.out.println("========== Input ==========");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Umur : ");
        umur = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();
        System.out.print("Lulusan : ");
        lulusan = input.next();
        System.out.print("Pengalaman : ");
        pengalaman = input.nextInt();
        System.out.print("Penampilan : ");
        penampilan = input.nextDouble();

        kordinator1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMA") || lulusan.equalsIgnoreCase("D3") && pengalaman >= 2);
        kordinator2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 5;

        admin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && penampilan > 8.5 && pengalaman > 1;
        admin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan > 8.5 && pengalaman >= 5;

        kordinator = kordinator1 || kordinator2;
        admin = admin1 || admin2;

        System.out.println("========== Output ==========");
        System.out.println(nama + ", terima kasih sudah melamar di PT Melamar Kerja");
        System.out.println();
        System.out.println("Berikut hasil dari requirtment : ");
        System.out.println("Hasil kelulusan untuk kordinator : " + kordinator);
        System.out.println("Hasil kelulusan untuk admin : " + admin);

    }
}
