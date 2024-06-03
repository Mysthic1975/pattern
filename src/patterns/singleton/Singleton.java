package patterns.singleton;

public class Singleton {
    // Eine private statische Variable, um die einzige Instanz dieser Klasse zu speichern
    private static Singleton instance;

    // Ein privater Konstruktor, um die Instanziierung dieser Klasse von außen zu verhindern
    private Singleton() {}

    // Eine öffentliche statische Methode, um die einzige Instanz dieser Klasse zu erhalten
    public static Singleton getInstance() {
        // Wenn die Instanz noch nicht erstellt wurde, erstellen wir sie
        if (instance == null) {
            instance = new Singleton();
        }
        // Wir geben die einzige Instanz dieser Klasse zurück
        return instance;
    }

    // Eine Methode, um eine Aktion durchzuführen. In einer realen Anwendung könnte diese Methode
    // irgendeine Funktionalität bereitstellen, die nur von einer einzigen Instanz dieser Klasse
    // bereitgestellt werden sollte
    public void doSomething() {
        System.out.println("Mache etwas im " + this.getClass().getSimpleName());
    }
}
