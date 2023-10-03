package sandbox;

import java.util.Date;
import java.util.Random;

public class Tesla {
    
    public enum Color {RED, BLACK, WHITE, GREY};
    private String owner;
    private String model;
    private double mileage;
    private Color color;

    static long unixTime = System.currentTimeMillis();
    Random rand = new Random(unixTime);
    

    public Tesla(String owner, String model, double mileage, Color color) {
        this.owner = owner;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
    }

    public Tesla(String owner, String model, double mileage) {
        this.owner = owner;
        this.model = model;
        this.mileage = mileage;
        this.color = Color.values()[rand.nextInt(4)];
    }



    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }




    @Override
    public String toString() {
        return "{" +
            " owner='" + getOwner() + "'" +
            ", model='" + getModel() + "'" +
            ", mileage='" + getMileage() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }



}
