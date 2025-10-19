package base;

public class BasicApartment implements Property {
    @Override
    public String getDescription() {
        String description;
        description = "Basic Apartment";
        return description;
    }

    @Override
    public double getCost() {
        double cost;
        cost = 50000;
        return cost;
    }
}

