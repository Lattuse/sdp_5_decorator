package base;

public class BasicApartment implements Property {
    @Override
    public String getDescription() {
        return "Basic Apartment";
    }

    @Override
    public double getCost() {
        return 50000;
    }
}

