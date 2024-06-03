package patterns.factory;

import patterns.factory.shapes.Shape;

public class Rectangle implements Shape {
    // Die draw-Methode wird aus dem patterns.factory.shapes.Shape-Interface überschrieben.
    @Override
    public void draw() {
        // Eine einfache Ausgabe, um zu demonstrieren, dass die Methode aufgerufen wurde.
        System.out.println("In der " + this.getClass().getSimpleName() + "::draw() Methode.");
    }
}
