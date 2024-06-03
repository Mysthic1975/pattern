package patterns.builder;

public class Pizza {
    // Diese Variablen speichern die Eigenschaften der patterns.builder.Pizza
    private final String dough;
    private final String sauce;
    private final String topping;

    // Der Builder ist eine innere Klasse, die zum Erstellen einer patterns.builder.Pizza-Instanz verwendet wird
    public static class Builder {
        // Diese Variablen speichern die Eigenschaften der patterns.builder.Pizza, die erstellt werden soll
        private String dough;
        private String sauce;
        private String topping;

        // Diese Methoden setzen die Eigenschaften der patterns.builder.Pizza und geben den Builder zurück,
        // um das Fluent Interface zu ermöglichen
        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        // Diese Methode erstellt eine neue patterns.builder.Pizza-Instanz mit den gesetzten Eigenschaften
        public Pizza build() {
            return new Pizza(this);
        }
    }

    // Der private Konstruktor nimmt einen Builder und setzt die Eigenschaften der patterns.builder.Pizza
    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    // Diese Methode simuliert das Essen der patterns.builder.Pizza
    public void eat() {
        System.out.println("Pizza essen mit " + dough + "em Teig, " + sauce + "n Soße und " + topping + " Belag.");
    }
}