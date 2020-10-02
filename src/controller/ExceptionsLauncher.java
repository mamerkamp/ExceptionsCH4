package controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Vierkant;

public class ExceptionsLauncher{


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            System.out.print("Geef een zijde op: ");
            double invoerZijde = keyboard.nextDouble();
            try {
                Vierkant vierkant = new Vierkant(invoerZijde);
                System.out.println("Oppervlakte is " + vierkant.geefOppervlakte(invoerZijde));
                onjuisteInvoer = false;
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            } finally {
                System.out.println("Je invoer is juist afgehandeld");
            }
        }
        System.out.println();

//        System.out.print("Geef het oppervlakte: ");
//        double oppervlaktee = keyboard.nextDouble();
//        Vierkant invoerOppervlakte = new Vierkant();
//        System.out.println("De zijde is dan: " + invoerOppervlakte.berekenZijde(oppervlaktee));

        keyboard.close();



    }

}
