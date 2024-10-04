import java.util.Scanner;
public class Latihan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga;

        System.out.print("Masukkan merk sepatu (specs/910/ortus) : ");
        merk = input.nextLine();

        System.out.print("Masukkan kategori : ");
        kategori = input.nextLine();

        System.out.print("pilih ukuran : ");
        ukuran = input.nextInt();

        if (kategori.equals("slip on") && merk.equals("specs")) {
            if (ukuran >=36 && ukuran <=40) {
                harga = 800000;
                System.out.println("Sepatu terkategorikan " + " dengan harga " + harga);
            }
        } 
        
        else if (kategori.equals("high top") && merk.equals("specs")) {
            if (ukuran >=40 && ukuran <=44) {
                harga = 1200000;
                System.out.println("Sepatu terkategorikan " + " dengan harga " + harga);
            }
        } 

        else if (kategori.equals("woman") && merk.equals("910")) {
            if (ukuran >=36 && ukuran <=41) {
                harga = 1000000;
                System.out.println("Sepatu terkategorikan " + " dengan harga " + harga);
            }
        } 
        
        else if (kategori.equals("man") && merk.equals("910")) {
            if (ukuran >=41 && ukuran <=44) {
                harga = 1800000;
                System.out.println("Sepatu terkategorikan " + " dengan harga " + harga);
            }
        } 
        
        else if (kategori.equals("kids") && merk.equals("ortus")) {
            if (ukuran >=36 && ukuran <=40) {
                harga = 750000;
                System.out.println("Sepatu terkategorikan " + " dengan harga " + harga);
            }
        } 
        
        else if (kategori.equals("adult") && merk.equals("ortus")) {
            if (ukuran >=40 && ukuran <=44) {
                harga = 1500000;
                System.out.println("Sepatu terkategorikan " + " dengan harga " + harga);
            }
        } else {
            System.out.println("Invalid");
        } 
        
    }
}