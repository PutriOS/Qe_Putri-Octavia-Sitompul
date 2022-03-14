package muatanOOP;

import java.util.ArrayList;
import java.util.List;

class Hewan{

    List<Integer > berat_hewan = new ArrayList<>();

}

class Mobil {
    List<Integer> muatan_mbl = new ArrayList<>();
    int total_muatan=0;
    int sisa;

    public void tambah_muatan(){
        int kapasitas_mbl = 2000;
        System.out.println("Kapasitas mobil : "+ kapasitas_mbl);
        for( int jumlah : muatan_mbl){
            total_muatan = total_muatan + jumlah;
            sisa =  kapasitas_mbl-total_muatan;
        }
        if(total_muatan<=kapasitas_mbl){
            System.out.println("Jumlah Dari Semua Muatan Hewan Adalah: "+ total_muatan + " Masih ada sisa " + sisa);
        }else {
            System.out.println("total muatan kamu : " +total_muatan+" telah melebihi kapasitas " + kapasitas_mbl);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Daftar Berat Hewan: ");

        hewan.berat_hewan.add(400);
        hewan.berat_hewan.add(700);
        hewan.berat_hewan.add(1500);
        System.out.println(hewan.berat_hewan);

        Mobil mobil = new Mobil();
        mobil.muatan_mbl.add(400);
        mobil.muatan_mbl.add(700);
        mobil.muatan_mbl.add(1500);
        mobil.tambah_muatan();
    }
}