import java.util.Scanner;

public class Pemilihan2Percobaan120 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        double tahun = input20.nextInt();

        //PERTAMA
        // if ((tahun % 4) == 0) {
        //     if ((tahun % 100) !=0) 

        //KEDUA
        // if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
        //      System.out.println("Tahun Kabisat");
        // } else
        //      System.out.println("Bukan Tahun Kabisat");
        
        //KETIGA
        if (tahun % 4 == 0) { //apaka kelipatan 4
            if (tahun % 100 == 0) { // kalau kelipatan 100
                if (tahun % 400 == 0) { // kalau kelipatan 400
                    System.out.print("Tahun Kabisat");
                } else { //kelipatan 100 bukan 400
                    System.out.print("Bukan Tahun Kabisat");
                }
            } else { //kelipatan 4 bukan 100
                System.out.println("Tahun Kabisat");
            }
        } else { //tidak kelipatan 4
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
