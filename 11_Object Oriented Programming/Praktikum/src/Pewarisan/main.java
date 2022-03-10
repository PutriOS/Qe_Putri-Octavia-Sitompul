package Pewarisan;

public class main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.identify_myself();

        Carnivor carnivor = new Carnivor();
        carnivor.namaBinatang ="Singa";
        carnivor.gigiBinatang = "tajam";
        carnivor.jenisMakanan = "daging";

        Herbivor herbivor = new Herbivor();
        herbivor.namaBinatang = "Kambing";
        herbivor.jenisMakanan = "tumbuhan";
        herbivor.gigiBinatang = "tumpul";

        Omninor omninor = new Omninor();
        omninor.namaBinatang ="Ayam";
        omninor.jenisMakanan = "semua";
        omninor.gigiBinatang = "tajam and tumpul";

        herbivor.identify_myself();
        carnivor.identify_myself();
        omninor.identify_myself();
    }
}
