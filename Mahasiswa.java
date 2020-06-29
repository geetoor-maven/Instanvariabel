
package Tugas7;


public class Mahasiswa {

    // Mendeklarasikan variabel instan di dalam class di luar method
    
    private String nama;
    private String alamat;
    private int umur;
    private double nilai;
    private boolean jeniskelamin;
    
    // Membuat constructor untuk memberikan nilai inputan pada kelas utama(Main) di karenakan variabel instan kita private
    
    Mahasiswa(String nama, String alamat, int umur, double nilai, boolean jeniskelamin){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.nilai = nilai;
        this.jeniskelamin = jeniskelamin;
    }
    
    // Membuat methode function agar setiap nilai variabel yang diatas yang di kembalikan di method ini dengan keyword return
    
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public double getNilai() {
        return nilai;
    }

    public boolean isJeniskelamin() {
        return jeniskelamin;
    }
    
    
    
    
}
