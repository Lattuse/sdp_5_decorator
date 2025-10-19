import base.BasicApartment;
import base.Property;
import decorators.FurnishedDecorator;
import decorators.GardenDecorator;

public class Main {
    public static void main(String[] args) {
        Property apartment = new BasicApartment();
        apartment = new FurnishedDecorator(apartment);
        apartment = new GardenDecorator(apartment);

        String description = "Description: " + apartment.getDescription();
        String cost = "Total Cost: $" + apartment.getCost();
        // gg

        System.out.println(description);
        System.out.println(cost);
    }
}
