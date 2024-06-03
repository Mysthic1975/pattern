package patterns;

import patterns.builder.Pizza;
import patterns.factory.ShapeFactory;
import patterns.factory.shapes.Shape;
import patterns.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo und willkommen!");

        // Verwendung des patterns.singleton.Singleton-Patterns
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        System.out.println("(Das war das " + Singleton.class.getSimpleName() + "-Pattern)"); // Für das Singleton-Pattern

        // Verwendung des Factory-Patterns
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        System.out.println("(Das war das " + ShapeFactory.class.getSimpleName() + "-Pattern)"); // Für das Factory-Pattern

        // Verwendung des Builder-Patterns
        Pizza pizza = new Pizza.Builder()
                .dough("Dick")
                .sauce("Tomate")
                .topping("Käse")
                .build();
        pizza.eat();
        System.out.println("(Das war das Builder-Pattern)"); // Für das Builder-Pattern
    }
}
