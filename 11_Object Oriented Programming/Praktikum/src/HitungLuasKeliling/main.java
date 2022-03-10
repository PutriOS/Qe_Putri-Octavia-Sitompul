package HitungLuasKeliling;

public class main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();

        System.out.println("Luas");
        System.out.println(persegi.LuasPersegi(4));
        System.out.println(segitiga.LuasSegitiga(3, 4));
        System.out.println(persegiPanjang.LuasPersegiPanjang(7,8));

        System.out.println("\nKeliling");
        System.out.println(persegi.KelilingPersegi(4));
        System.out.println(segitiga.KelilingSegitiga(3, 4));
        System.out.println(persegiPanjang.KelilingPersegiPanjang(7,8));
    }
}
