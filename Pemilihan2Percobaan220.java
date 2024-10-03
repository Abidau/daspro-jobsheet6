import java.util.Scanner;
public class Pemilihan2Percobaan220 {

    public static void main(String[] args) {
        Scanner input20  = new Scanner(System.in);

        int pilihan_menu;
        String member;//jenisPembayaran;
        int harga = 0; 
        double diskon = 0.0;
        double total_bayar;
        // int potonganQris = 1000;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");

        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input20.nextInt();
        input20.nextLine();

        System.out.print("Apakah punya member (y/n) ? ");
        member = input20.nextLine();

        //  System.out.print("Pilih jenis pembayaran (cash/QRIS) : ");
        // jenisPembayaran = input20.nextLine();

        System.out.println("-------------------------------------");

        // if (member.equalsIgnoreCase("y")) {
            if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10% ");
        }
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bunding = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
            }
        

        total_bayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon = " + total_bayar);

        // if (member.equalsIgnoreCase("n")) {
            if (member.equals("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bunding = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");

            }
            System.out.println("Total bayar = " + harga);
        }
        
        // if (jenisPembayaran.equalsIgnoreCase("QRIS")){
        //     total_bayar -= potonganQris;
        //     System.out.println("Potongan yang anda dapatkan dari QRIS sebesar 1000");
        // }

        System.out.println("Total bayar akhir = " + total_bayar);

        System.out.println("----------------------------------------");
    }
}