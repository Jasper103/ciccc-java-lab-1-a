package Lab1;

public class Model {
    private String firstName;
    private String lastName;
    private boolean canTravel;
    private boolean smokes;
    private double weight;
    private int height;
    private static final String VALUE = "Modeling";

    public Model(String firstName,String lastName,boolean canTravel,boolean smokes,double weight,int height) {
        this.firstName = "Can";
        this.lastName = "Jiang";
        this.canTravel = canTravel;
        this.smokes = smokes;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean getCanTravel() {
        return this.canTravel;
    }

    public boolean getSmokes() {
        return this.smokes;
    }
}