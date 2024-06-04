
# Der vorliegende Code nutzt drei Design Patterns: das Singleton-Pattern, das Factory-Pattern und das Builder-Pattern.

## Singleton-Pattern: 

Das Singleton-Pattern stellt sicher, dass eine Klasse nur eine einzige Instanz hat und bietet einen 
globalen Zugriffspunkt zu dieser Instanz. Im Code wird das Singleton-Pattern in der **`Singleton`**-Klasse implementiert. 
Die **`getInstance()`**-Methode gibt die einzige Instanz der **`Singleton`**-Klasse zurück. 
Die **`doSomething()`**-Methode ist ein Beispiel für eine Funktion, die von der Singleton-Instanz bereitgestellt wird.  

## Factory-Pattern: 

Das Factory-Pattern bietet eine Möglichkeit, ein Objekt zu erstellen, 
ohne die genaue Klasse des Objekts zu spezifizieren. Im Code wird das Factory-Pattern in der **`ShapeFactory`**-Klasse 
implementiert, die auch als Singleton implementiert ist. 
Die **`getShape()`**-Methode der **`ShapeFactory`**-Klasse erstellt und gibt ein **`Shape`**-Objekt zurück, 
basierend auf dem übergebenen String.  

## Builder-Pattern: 

Das Builder-Pattern wird verwendet, um die Erstellung komplexer Objekte zu vereinfachen. 
Im Code wird das Builder-Pattern in der **`Pizza.Builder`**-inneren Klasse implementiert. 
Die **`Builder`**-Klasse hat Methoden zum Setzen der Eigenschaften der **`Pizza`** und eine **`build()`**-Methode zum Erstellen der Pizza.  

## Main-Klasse:

In der **`Main`**-Klasse wird zuerst das Singleton-Pattern verwendet, um eine Instanz der **`Singleton`**-Klasse zu erhalten 
und die **`doSomething()`**-Methode aufzurufen. Dann wird das Singleton-Pattern erneut verwendet, 
um eine Instanz der **`ShapeFactory`**-Klasse zu erhalten, die das Factory-Pattern ausführt, 
um eine Instanz der **`Rectangle`**-Klasse zu erstellen und die **`draw()`**-Methode aufzurufen. Schließlich wird das 
Builder-Pattern verwendet, um eine **`Pizza`**-Instanz zu erstellen und die **`eat()`**-Methode aufzurufen.