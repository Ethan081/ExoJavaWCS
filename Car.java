package vehicule;

public class Car extends Vehicule
{
    //Constructeur
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    //Redéfinir la méthode crée dans la class parent Véhicule.
    @Override
    void doStuff() {
        System.out.println("Je suis " + getBrand() + " et je fais vroom vroom !");
    }
}
