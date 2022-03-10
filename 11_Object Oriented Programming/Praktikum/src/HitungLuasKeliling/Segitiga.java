package HitungLuasKeliling;

import static java.lang.Math.sqrt;

public class Segitiga {
    public int LuasSegitiga(int a, int b){
        int hitung = (int) (0.5 * a * b);
        return hitung;
    }

    public int KelilingSegitiga(int a, int b){
        int m = (int) sqrt((a*a)+(b*b));
        //menghitung keliling
        int kll = a+b+m;
        return kll;
    }
}
