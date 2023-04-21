package Latihan2;

public class Karyawan {
    public String nama;
    public int umur;
    public int jumlahanak;

    public void DetailKaryawan(){
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
    }
    
    public void tunjanganAnak(){
        
        jumlahanak = jumlahanak * 120000;
        System.out.println("Tunjangan anak total "+ jumlahanak);
    }
}

