package Volume;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println(kubus.VolumeKubus(10));
        Balok balok = new Balok();
        System.out.println(balok.VolumeBalok(3, 6,10));
        Tabung tabung = new Tabung();
        System.out.println(tabung.VolumeTabung(7, 10));
    }
}
