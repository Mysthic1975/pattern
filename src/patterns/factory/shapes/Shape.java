package patterns.factory.shapes;

public interface Shape {
    // Eine abstrakte Methode, die in den implementierenden Klassen überschrieben werden muss.
    // In diesem Fall müssen alle Klassen, die das patterns.factory.shapes.Shape-Interface implementieren, eine draw-Methode bereitstellen.
    void draw();
}
