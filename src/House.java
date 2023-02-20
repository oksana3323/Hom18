import java.util.Arrays;

public class House implements Residentsable {
    private String familyName;
    private Family[]family;
    private int energy;
    private double watter;
    private int garbage;

    public House(String familyName, Family[] family, int energy, double watter, int garbage) {
        this.familyName = familyName;
        this.family = family;
        this.energy = energy;
        this.watter = watter;
        this.garbage = garbage;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Family[] getFamily() {
        return family;
    }

    public void setFamily(Family[] family) {
        this.family = family;
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

    @Override
    public void expenditure() {
        System.out.println(energy+watter*5+garbage*5+" coм");

    }

    @Override
    public String toString() {
        return "House"+"\n"+
                "familyName:" + familyName +"\n"+
                " family:" + Arrays.toString(family) +
                " energy:" + energy +"\n"+
                " watter:" + watter +"\n"+
                " garbage:" + garbage;
                }
    }

