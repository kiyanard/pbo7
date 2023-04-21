package Latihan1;

public class Mobil2 {
    
    int Gear = 0;

    void hidupkanmobil () {
        System.out.println("Mobil hidup...");
    }
    void matikanmobil () {
        System.out.println("Mobil mati...");
    }
    void Gear (String gigi) {
        if (gigi == "tambah") {
            gigi += 1;
            System.out.println("gear mobil sekarang "+ Gear);
        } else if (gigi == "kurang"){
            if (Gear == 0){
                System.out.println("mundur");
        }else {
            Gear -= 1;
            System.out.println("gear mobil sekarang "+ Gear);
        }
    }
}
}