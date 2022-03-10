package Volume;

public class Tabung {
    public int VolumeTabung(int a, int b){
        double alas = Math.round(3.14 * a * a);
        int hitung = (int) (alas * b);
        return Math.round(hitung);
    }
}
