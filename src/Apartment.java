import java.util.Arrays;

public class Apartment implements Residentsable {
    private String family;
    private Family[]families;
    private int energy;
    private double watter;
    private int garbage;
    private double rent;

    public Apartment(String family, Family[] families, int energy, double watter, int garbage,double rent) {
        this.family = family;
        this.families = families;
        this.energy = energy;
        this.watter = watter;
        this.garbage = garbage;
        this.rent = rent;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getWatter() {
        return watter;
    }

    public void setWatter(double watter) {
        this.watter = watter;
    }

    public int getGarbage() {
        return garbage;
    }

    public void setGarbage(int garbage) {
        this.garbage = garbage;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    @Override
    public void expenditure() {
        System.out.println(energy+watter*3+garbage*5+rent+" coм");

    }

    @Override
    public String toString() {
        return "Apartment{" +
                "family:" + family + "\n" +
                " families:" + Arrays.toString(families) +"\n"+
                " energy:" + energy +"\n"+
                " watter:" + watter +"\n"+
                " garbage:" + garbage +"\n"+
                " rent:" + rent;
                }
    }





