package controller;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Vierkant;

public class ExceptionsLauncher{


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


//        boolean onjuisteInvoer = true;
//        while (onjuisteInvoer) {
//            System.out.print("Geef een zijde op: ");
//            double invoerZijde = keyboard.nextDouble();
//            try {
//                Vierkant vierkant = new Vierkant(invoerZijde);
//                System.out.println("Oppervlakte is " + vierkant.geefOppervlakte(invoerZijde));
//                onjuisteInvoer = false;
//            } catch (IllegalArgumentException fout) {
//                System.out.println(fout.getMessage());
//            } finally {
//                System.out.println("Je invoer is juist afgehandeld");
//            }
//        }

        boolean onjuisteInvoer = true;
        while (onjuisteInvoer) {
            System.out.print("Geef het oppervlakte: ");
            double oppervlakte = keyboard.nextDouble();
            try {
                Vierkant invoerOppervlakte = new Vierkant();
                System.out.printf("De zijde is dan: %.2f\n", invoerOppervlakte.berekenZijde(oppervlakte));
                onjuisteInvoer = false;
            } catch (InputMismatchException fout) {
                System.out.println(fout.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Je invoer is juist afgehandeld");
            }
        }
        keyboard.close();



    }

}
