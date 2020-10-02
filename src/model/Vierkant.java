package model;

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

    public double berekenZijde(double zijde) throws IllegalArgumentException {
        if (Math.sqrt(zijde) <= 0){
            throw new IllegalArgumentException("De uitkomst mag niet kleiner dan 0 zijn.");
        } if(zijde <= 0){
            throw new IllegalArgumentException("Je moet een positief getal invoeren");
        }

        return Math.sqrt(zijde);
    }

    public double getZijde() {
        return zijde;
    }

    public void setZijde(double zijde) {
        this.zijde = zijde;
    }
}
