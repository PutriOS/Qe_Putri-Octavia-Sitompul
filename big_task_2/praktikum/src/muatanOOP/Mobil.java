package muatanOOP;

public class Mobil {
    double muatan; // Property Muatan
    double muatanmax; //Property Kapasitas/berat muatan

    public Mobil(double muatanmax){

        this.muatanmax = muatanmax;
    }

    public double getMuatan(){

        return muatan;
    }
    public double getMuatanMaks(){

        return muatanmax;
    }

    //Method tambah muatan
    public String tambahMuatan(double berat){
        if (muatan > muatanmax) {
            return "maaf muatan anda melebihi maksimal";
        } else {
            muatan += berat;
            return "";
        }
    }
    public static void main(String args[]){
        Mobil truk = new Mobil(1000);
        System.out.println("Muatan maksimal = "+truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500 ");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 350 ");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 100 ");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150 ");
        System.out.println("Muatan sekarang = " + truk.getMuatan());
        System.out.println(truk.tambahMuatan(truk.muatan));
    }
}
