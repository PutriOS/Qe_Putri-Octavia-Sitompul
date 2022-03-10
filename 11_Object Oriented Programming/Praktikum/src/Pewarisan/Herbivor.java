package Pewarisan;

public class Herbivor extends Animals{

    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Herbivore , My name is " + namaBinatang
                + ", My Food is '" + jenisMakanan
                + "', I have " + gigiBinatang + " teeth");
    }
}
