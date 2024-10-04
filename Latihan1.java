import java.util.Scanner;
public class Latihan1 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input20.nextInt();

        System.out.print("Masukkan bilangan kedua : "); 
        int bil2 = input20.nextInt();

        System.out.print("Masukkan bilangan ketiga : ");
        int bil3 = input20.nextInt();

        // Tidak menggunakan operator logika dan output angka
        if (bil1 >= bil2) {
        } if (bil1 >= bil3) {
            System.out.println(bil1 + " bilangan terbesar");
        } 
        
        else if (bil2 >= bil1) {
        }  if (bil2 >= bil3) {
            System.out.println(bil2 + " bilangan terbesar");
        } 
        
        else if (bil3 >= bil1) {
        } if (bil3 >= bil2) {
            System.out.println(bil3 + " bilangan terbesar");
        }

        // Tidak menggunakan operator logika dan output bilangan
        // if (bil1 >= bil2) {
        // } if (bil1 >= bil3) {
        //     System.out.println("bilangan terbesar adalah bilangan 1");
        // } 
        
        // if (bil2 >= bil1) {
        // }  if (bil2 >= bil3) {
        //     System.out.println("bilangan terbesar adalah bilangan 2");
        // } 
        
        // if (bil3 >= bil1) {
        // } if (bil3 >= bil2) {
        //     System.out.println("bilangan terbesar adalah bilangan 3");
        // }

        // Menggunakan operator logika
        // if (bil1 > bil2 && bil1 > bil3) {
        //     System.out.println("Bilangan terbesar adalah bilangan 1");
        // } else if (bil2 > bil1 && bil2 > bil3) {
        //     System.out.println("Bilangan terbesar adalah bilangan 2");
        // } else if (bil3 > bil1 && bil3 > bil1) {
        //     System.out.println("bilangan terbesar adalah bilangan 3");
        // }
    }
}