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
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {

                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");
    }
}
