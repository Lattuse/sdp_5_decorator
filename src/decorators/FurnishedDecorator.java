package decorators;

import base.Property;

public class FurnishedDecorator extends PropertyDecorator {
    public FurnishedDecorator(Property property) {
        super(property);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Furnished";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10000;
    }
}

