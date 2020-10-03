package model;

import java.util.InputMismatchException;

public class Vierkant {
    private double zijde;

    public Vierkant(double zijde) {
        this.zijde = zijde;
//        geefOppervlakte(this.zijde);
    }

    public Vierkant(){
    }


    @Override
    public String toString() {
        return String.format("Oppervlakte is &f", geefOppervlakte(zijde));
    }

    public double geefOppervlakte(double zijde) throws IllegalArgumentException {

        if(zijde <= 0){
            throw new IllegalArgumentException("Je moet een positief getal invoeren");
        }
        return zijde*zijde;
    }

    public double berekenZijde(double oppervlakte) throws IllegalArgumentException {
        if (oppervlakte == 0){
            throw new IllegalArgumentException("De uitkomst mag niet kleiner dan 0 zijn.");
        } if(oppervlakte <= 0){
            throw new InputMismatchException("Je moet een positief getal invoeren");
        }

        return Math.sqrt(oppervlakte);
    }

    public double getZijde() {
        return zijde;
    }

    public void setZijde(double zijde) {
        this.zijde = zijde;
    }
}
