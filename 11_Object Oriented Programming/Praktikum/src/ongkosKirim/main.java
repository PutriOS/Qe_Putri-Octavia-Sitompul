package ongkosKirim;

/*Kelas Ongkos Kirim*/
class ongkosKirim {
    static double Ongkoskirim(int p, int l, int t, int berat){
        int volume = p*l*t;
        double harga = 5000;

        /*Rumus Hitung*/
        if (volume <= 50 && berat <=1){
            return harga;
        }else {
            harga = harga * berat;
            return harga;
        }
    }

    /*Kelas Main*/
    public static void main(String[] args) {
        System.out.println("Harga : " + Ongkoskirim(5,2,4,1));
    }
}
