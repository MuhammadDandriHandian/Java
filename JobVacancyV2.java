import java.util.Scanner;

public class JobVacancyV2 {
    public static void main(String[] args) {
        String nama, jenisKelamin, lulusan, posisi;
        int umur, pengalaman;
        double penampilan;
        String hasil = "";

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
        System.out.print("Posisi yang dilamar (SPV, Admin, Kordinator) : ");
        posisi = input.next();

        if (posisi.equalsIgnoreCase("Kordinator")){
            if ((jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2) ||
            (jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5)) {
                hasil = "Selamat, " + nama + "\nAnda memenuhi syarat sebagai Kordinator, dan akan masuk ke tahap selanjutnya";
            } else {
                hasil = "Maaf " + nama + ", anda tidak memenuhi syarat untuk sebagai " + posisi + "\nMaka tidak akan masuk ke tahap selanjutnya";
            }
        } else if (posisi.equalsIgnoreCase("Admin")){
            if ((jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8 || pengalaman >= 1)) ||
            (jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8 && pengalaman >= 3) || 
            (jenisKelamin.equalsIgnoreCase("pria") && umur >= 20 && umur <= 30 && penampilan >= 8 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2)){
                hasil = "Selamat, " + nama + "\nAnda memenuhi syarat sebagai Admin, dan akan masuk ke tahap selanjutnya";
            } else {
                hasil = "Maaf " + nama + ", anda tidak memenuhi syarat untuk sebagai " + posisi + "\nMaka tidak akan masuk ke tahap selanjutnya";
            }
        } else if (posisi.equalsIgnoreCase("SPV")){
            if ((umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1) || (umur >= 25 && umur <=35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4)){
                hasil = "Selamat, " + nama + "\nAnda memenuhi syarat sebagai SPV, dan akan masuk ke tahap selanjutnya";
            } else {
                hasil = "Maaf " + nama + ", anda tidak memenuhi syarat untuk sebagai " + posisi + "\nMaka tidak akan masuk ke tahap selanjutnya";
            }
        } else {
            hasil = "Maaf " + nama + ", kami tidak membuka lowongan tersebut.";
        }

        System.out.println();
        System.out.println("========== Output ==========");
        System.out.println(nama + ", terima kasih telah melamar di PT Secret");
        System.out.println();
        System.out.println("Berikut hasil dari lamaran yang anda kirim : ");
        System.out.println(hasil);
    }
    
}
