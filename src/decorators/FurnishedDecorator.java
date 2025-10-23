package decorators;

import base.Property;
import abstractprop.PropertyDecorator;

public class FurnishedDecorator extends PropertyDecorator {
    public FurnishedDecorator(Property property) {
        super(property);
    }

    @Override
    public String getDescription() {
        String newDescription;
        newDescription = super.getDescription() + ", Furnished";
        return newDescription;
    }

    @Override
    public double getCost() {
        double newCost;
        newCost = super.getCost() + 10000;
        return newCost;
    }
}

