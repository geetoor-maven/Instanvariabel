
package Tugas7;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
     
        // Membuat objek Scanner agar bisa mengambil inputan
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------");
        
        System.out.print(" -- Masukkan Nama Mahasisa : ");
        String nama = input.nextLine();
        System.out.print(" -- Masukkan Alamat Mahasiswa : ");
        String alamat = input.nextLine();
        System.out.print(" -- Masukkan Umur Mahasiswa : ");
        int umur = input.nextInt();
        System.out.print(" -- Masukkan Nilai Mahasiswa : ");
        double nilai = input.nextDouble();
        System.out.print(" -- Masukkan Jenis kelamin ? true or false : ");
        boolean jk = input.hasNextBoolean();
        
        // Membuat objek kelas Mahasiswa dan memanggil constructornya agar variabel yang di atas bisa di tampung ke parameter constructor
        
        Mahasiswa obj = new Mahasiswa(nama,alamat,umur,nilai,jk);
        
        // kemudian memanggil semua method function yang telah di buat di kelas mahasiswa agar semua variabel di atas bisa di munculkan
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println(" -- Nama Mahasiwa : "+obj.getNama());
        System.out.println(" -- Alamat Mahasiswa : "+obj.getAlamat());
        System.out.println(" -- Umur Mahasiswa : "+obj.getUmur());
        System.out.println(" -- Nilai Mahasiswa : "+obj.getNilai());
        System.out.println(" -- Jenis Kelamin : " +obj.isJeniskelamin());
        System.out.println("--------------------------------------------------------------------");
        
    }
    
}
