import java.util.Scanner;

public class SimulasiPassingGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mtk, indo, inggris, ipa;
        int syaratSMK = 73;
        int syaratSastra = 75;
        int syaratTeknik = 80;
        double nilaiTotal, nilaiIndoInggris;
        Boolean smk, sastra, teknik;

        System.out.println("Masukan nilai ujian Matematika : ");
        mtk = input.nextInt();

        System.out.println("Masukan nilai ujian B.Indonesia : ");
        indo = input.nextInt();

        System.out.println("Masukan nilai ujian B.Inggris : ");
        inggris = input.nextInt();

        System.out.println("Masukan nilai ujian IPA : ");
        ipa = input.nextInt();

        nilaiTotal = (mtk + indo + inggris + ipa) / 4;
        nilaiIndoInggris = ((indo + inggris) / 2);
        smk = (nilaiTotal > syaratSMK);
        sastra = (nilaiIndoInggris > syaratSastra);
        teknik = (mtk > syaratTeknik);
        
        System.out.println("Hasil simulasi untuk persyaratan penerimaan calon siswa di SMK Padepokan 79 adalah sebagai berkut");
        System.out.println("=================================================================================================");
        System.out.println("Apakah anda memenuhi syarat masuk ke SMK Padepokan 79 : " + smk);
        System.out.println("Apakah anda Apakah anda memenuhi syarat masuk ke jurusan Sastra : " + sastra);
        System.out.println("Apakah anda memenuhi syarat masuk ke jurusan Teknik Informatika : " + teknik);


    }
}
