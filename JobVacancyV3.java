import java.util.Scanner;

public class JobVacancyV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Input ==========");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Umur : ");
        int umur = input.nextInt();
        System.out.print("Jenis Kelamin (Pria/Wanita) : ");
        String jenisKelamin = input.next();
        System.out.print("Lulusan : ");
        String lulusan = input.next();
        System.out.print("Pengalaman : ");
        int pengalaman = input.nextInt();
        System.out.print("Penampilan : ");
        double penampilan = input.nextDouble();
        System.out.print("Posisi yang dilamar (SPV, Admin, Kordinator) : ");
        String posisi = input.next();

        String hasil = getJobVacancyResult(nama, umur, jenisKelamin, lulusan, pengalaman, penampilan, posisi);

        System.out.println();
        System.out.println("========== Output ==========");
        System.out.println(nama + ", terima kasih telah melamar di PT Secret");
        System.out.println();
        System.out.println("Berikut hasil dari lamaran yang anda kirim : ");
        System.out.println(hasil);
    }

    public static String getJobVacancyResult(String nama, int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan, String posisi) {
        String hasil;

        if (posisi.equalsIgnoreCase("Kordinator")) {
            hasil = validateCoordinator(nama, umur, jenisKelamin, lulusan, pengalaman);
        } else if (posisi.equalsIgnoreCase("Admin")) {
            hasil = validateAdmin(nama, umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else if (posisi.equalsIgnoreCase("SPV")) {
            hasil = validateSPV(nama, umur, lulusan, pengalaman);
        } else {
            hasil = "Maaf " + nama + ", kami tidak membuka lowongan tersebut.";
        }

        return hasil;
    }

    public static String validateCoordinator(String nama, int umur, String jenisKelamin, String lulusan, int pengalaman) {
        if ((jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2) ||
            (jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5)) {
            return "Selamat, " + nama + "\nAnda memenuhi syarat sebagai Kordinator, dan akan masuk ke tahap selanjutnya";
        } else {
            return "Maaf " + nama + ", anda tidak memenuhi syarat untuk sebagai Kordinator\nMaka tidak akan masuk ke tahap selanjutnya";
        }
    }

    public static String validateAdmin(String nama, int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        if ((jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8 || pengalaman >= 1)) ||
            (jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8 && pengalaman >= 3) || 
            (jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2)) {
            return "Selamat, " + nama + "\nAnda memenuhi syarat sebagai Admin, dan akan masuk ke tahap selanjutnya";
        } else {
            return "Maaf " + nama + ", anda tidak memenuhi syarat untuk sebagai Admin\nMaka tidak akan masuk ke tahap selanjutnya";
        }
    }

    public static String validateSPV(String nama, int umur, String lulusan, int pengalaman) {
        if ((umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1) || 
            (umur >= 25 && umur <=35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4)) {
            return "Selamat, " + nama + "\nAnda memenuhi syarat sebagai SPV, dan akan masuk ke tahap selanjutnya";
        } else {
            return "Maaf " + nama + ", anda tidak memenuhi syarat untuk sebagai SPV\nMaka tidak akan masuk ke tahap selanjutnya";
        }
    }
}
