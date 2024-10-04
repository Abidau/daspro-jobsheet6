import java.util.Scanner;
public class Latihan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hari, jenisBuku;
        int jumlahBuku, harga;
        double diskon;

        System.out.print("Masukkan hari saat anda membeli buku : ");
        hari = input.nextLine();

        System.out.print("Pilih buku yang anda inginkan (kamus/novel/selainnya) : ");
        jenisBuku = input.nextLine();

        System.out.print("Masukkan jumlah buku yang anda beli : ");
        jumlahBuku = input.nextInt();

        if (hari.equals("rabu") && jenisBuku.equals("kamus")) {
            diskon = 0.1;
            System.out.println("Besar diskon = 10% ");  
                if (jumlahBuku >2) {
                diskon = 0.02;
                System.out.println("Anda mendapatkan diskon lebih sebesar 2% ");
            }                      
        } 
            
        else if (hari.equals("rabu") && jenisBuku.equals("novel")) {
            diskon = 0.07;
            System.out.println("Besar diskon = 7% ");
            if (jumlahBuku >3) {
                diskon = 0.02;
                System.out.println("Anda mendapatkan diskon lebih sebesar 2% ");
                } else if (jumlahBuku <=3 && jenisBuku.equals("novel")) {
            diskon = 0.01;
            System.out.println("Anda mendapatkan diskon lebih sebesar 1% ");
            } 
        } 

        else if (hari.equals("rabu") && jenisBuku.equals("selainnya")) {
             if (jumlahBuku >3) {
                diskon = 0.05;
                System.out.println("Anda mendapatkan diskon lebih sebesar 5% ");
            } else if (jumlahBuku <=3) {
                System.out.println("Anda tidak mendapatkan diskon");
            } 
        } else {
            System.out.println("Selain hari rabu, anda tidak mendapatkan diskon");
        }
    }
}