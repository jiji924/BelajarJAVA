public class MechanicalEnergy {
    public static void main(String[] args) {
        //mendefinisikan variable
        EnergiesCal instance = new EnergiesCal();
        instance.speed = 4.9;
        instance.massObject = 10.2;//kg
        instance.height = 7.2; //meter

        //munculkan hasil energy
        instance.MekanikalE();
    }
}
