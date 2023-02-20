import java.util.Arrays;

public class Hotel implements Residentsable {
private String family;
private Family[]families;
private int energy;
private double watter;
private int garbage;
private  double payMent;


    public Hotel(String family, Family[] families, int energy, double watter, int garbage,double payMent) {
        this.family = family;
        this.families = families;
        this.energy = energy;
        this.watter = watter;
        this.garbage = garbage;
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

    public double getPayMent() {
        return payMent;
    }

    public void setPayMent(double payMent) {
        this.payMent = payMent;
    }

    @Override
    public void expenditure() {
        System.out.println(payMent*2*30+2+" сом");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "family:" + family + "\n" +
                " families:" + Arrays.toString(families) + "\n" +
                " energy:" + energy + "\n" +
                "watter:" + watter + "\n" +
                " garbage:" + garbage + "\n" +
                " payMent:" + payMent ;
    }
    }

