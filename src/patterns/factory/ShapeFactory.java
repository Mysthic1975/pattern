package patterns.factory;

import patterns.factory.shapes.Shape;

public class ShapeFactory {
    // Die einzige Instanz der Klasse wird hier gespeichert
    private static ShapeFactory instance;

    // Der Konstruktor ist privat, um die Erstellung von Instanzen von außerhalb der Klasse zu verhindern
    private ShapeFactory() {}

    // Diese Methode gibt die einzige Instanz der Klasse zurück
    public static ShapeFactory getInstance() {
        // Wenn noch keine Instanz erstellt wurde, erstellen wir eine
        if (instance == null) {
            instance = new ShapeFactory();
        }
        // Wir geben die einzige Instanz der Klasse zurück
        return instance;
    }

    // Diese Methode gibt ein patterns.factory.shapes.Shape-Objekt zurück basierend auf dem übergebenen String
    public Shape getShape(String shapeType){
        // Wenn der übergebene String null ist, geben wir null zurück
        if(shapeType == null){
            return null;
        }
        // Wenn der übergebene String "RECTANGLE" ist (unabhängig von Groß- und Kleinschreibung),
        // erstellen wir ein neues patterns.factory.Rectangle-Objekt und geben es zurück
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        // Wenn der übergebene String nicht erkannt wird, geben wir null zurück
        return null;
    }
}
