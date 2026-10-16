public class EnergiesCal {
    //mengambil variable dari MechanicalEnergy.java
    public double massObject;
    public double gravity = 9.8;
    public double speed;
    public double height;

    //menghitung energi potensial
    private double PotensialE(){
        double ResultPot = massObject*gravity*height;
        System.out.println(ResultPot + " Joule Potential Energy");
        return ResultPot;
    }

    //menghitung energi kinetik
    private double KinetikE(){
        double ResultKin = 0.5*massObject*(Math.pow(speed,2));
        System.out.println(Math.round(ResultKin) + " Joule Kinetik Energy");
        return ResultKin;
    }

    //menghitung energi mekanik
    public void MekanikalE(){
        double PotE = PotensialE();
        double KinE = KinetikE();
        double Result = PotE + KinE;
        System.out.println(Result +" Joule Mechanical Energy");
    }
}