package vehicule;

public class Hangar {
    public static void main(String [] args){

        //Création de nouveaux instances de Class
        Car maVoiture = new Car("Clio", 160);

        Boat monBateau = new Boat("Titanic", 40);


        maVoiture.doStuff();

        monBateau.doStuff();
    }
}
