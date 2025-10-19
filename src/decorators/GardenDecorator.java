package decorators;

import base.Property;

public class GardenDecorator extends PropertyDecorator {
    public GardenDecorator(Property property) {
        super(property);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Garden";
    }

    @Override
    public double getCost() {
        return super.getCost() + 15000;
    }
}

