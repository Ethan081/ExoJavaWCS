package vehicule;

public class Boat extends Vehicule {

    //Constructeur
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }
    //Redéfinir la méthode crée dans la class parent Véhicule.
    @Override
    void doStuff() {
        System.out.println("Je suis " + getBrand() + " et je fais glou glou !");
    }
}
