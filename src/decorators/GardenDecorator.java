package decorators;

import base.Property;

public class GardenDecorator extends PropertyDecorator {
    public GardenDecorator(Property property) {
        super(property);
    }

    @Override
    public String getDescription() {
        String newDescription;
        newDescription = super.getDescription() + ", with Garden";
        return newDescription;
    }

    @Override
    public double getCost() {
        double newCost;
        newCost = super.getCost() + 15000;
        return newCost;
    }
}

