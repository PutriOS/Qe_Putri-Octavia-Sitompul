package muatanOOP;

class Hewan{
    int berat;
}

class Mobil extends Hewan {
    String nama = "";
    int kapasitas;
    int muatan;

    public void tambahMuatan(int berat, int kapasitas, String nama, String muatan) {
        if (berat < kapasitas) {
            System.out.println("Muatan berhasil ditambah");
        } else {
            System.out.println("Hewan " + nama + " dengan berat " + berat
                    + " kg, telah mencapai batas maksimum " + kapasitas + " kg" +" dengan jenis angkutan " + muatan);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.tambahMuatan(1001,1000,"Kerbau","Mobil PickUp");
    }
}