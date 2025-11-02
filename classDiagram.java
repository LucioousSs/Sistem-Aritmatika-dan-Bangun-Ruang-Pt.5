// import java.util.Scanner;

public class classDiagram {

    public static void main (String[] args) {
        listMobil ganenCar = new listMobil();

        ganenCar.setMake("Honda");
        ganenCar.setModel("Civic");
        ganenCar.setregNo("DK 7450 BRO");
        ganenCar.setKMTravelled(5000);

        System.out.println ("Make: "+ganenCar.getMake());
        System.out.println ("Model: "+ganenCar.getModel());
        System.out.println ("No Registrasi: "+ganenCar.getRegNo());
        System.out.println ("KM: "+ganenCar.getKMTravelled());

        // Scanner sc = new Scanner(System.in);
        // Scanner scNum = new Scanner (System.in);

        // listMobil joesCar = new listMobil ();

        // System.out.println ("Input Make: ");
        // joesCar.setMake (sc.nextLine ());

        // System.out.println ("Input KM Travelled: ");
        // joesCar.setKMTravelled (sc.nextInt());

        // System.out.println ("Input Model: ");
        // joesCar.setModel (sc.nextLine());

        // System.out.println ("Input No Reg: ");
        // joesCar.setregNo (sc.nextLine());

        // sc.close();

        listMobil myCar = new listMobil();
        System.out.println ("Make: "+myCar.getMake());
        System.out.println ("Model: "+myCar.getModel());
        System.out.println ("No Registrasi: "+myCar.getRegNo());
        System.out.println ("KM: "+String.valueOf (myCar.getKMTravelled()));
    
        listMobil mobilKedua = new listMobil("Dodge", "Sedan", "DK1897ADI", 2500 );
         System.out.println ("Make: "+mobilKedua.getMake());
        System.out.println ("Model: "+mobilKedua.getModel());
        System.out.println ("No Registrasi: "+mobilKedua.getRegNo());
        System.out.println ("KM: "+String.valueOf (mobilKedua.getKMTravelled()));
    }
}
