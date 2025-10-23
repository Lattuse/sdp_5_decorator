package abstractprop;

import base.Property;

public abstract class PropertyDecorator implements Property {
    protected Property decoratedProperty;

    public PropertyDecorator(Property property) {
        this.decoratedProperty = property;
    }

    @Override
    public String getDescription() {
        return decoratedProperty.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedProperty.getCost();
    }
}

