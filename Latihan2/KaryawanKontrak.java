package Latihan2;

public class KaryawanKontrak extends Karyawan{
   public int upahharian;
   public int jumlahmasuk;
   public int totalgaji;

    public void infokontrak(){
        System.out.println("Upah Perhari : "+upahharian);
        System.out.println("Jumlah Masuk : "+jumlahmasuk);
    }

   public void totalupah(){
    totalgaji = upahharian*jumlahmasuk+jumlahanak;
    System.out.println("Total Upah  : "+totalgaji);
   }
}