package vehicule;

public abstract class Vehicule
{
    //Attibut de class
    private String brand;
    private int kilometers;

    //Constructeur
    public Vehicule(String brand, int kilometers)
    {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //Méthode
    abstract void doStuff();

    //Getters
    public String getBrand()
    {
        return brand;
    }

    public int getKilometers()
    {
        return kilometers;
    }

    //Setters
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setKilometers(int kilometers)
    {
        this.kilometers = kilometers;
    }
}
