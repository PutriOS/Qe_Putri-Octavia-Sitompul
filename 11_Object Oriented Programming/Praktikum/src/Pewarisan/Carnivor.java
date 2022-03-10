package Pewarisan;

public class Carnivor extends Animals{
    @Override
    public void identify_myself() {
        System.out.println("Hi I'm Carnivore , My name is " + namaBinatang
                + ", My Food is '" + jenisMakanan
                + "', I have " + gigiBinatang + " teeth");
    }
}
