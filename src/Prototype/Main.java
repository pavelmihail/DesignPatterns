package Prototype;

import java.io.File;


/*
    PROTOTYPE PATTERN CHECKLIST:
    - add clone() method to the hierarchy of our objects
    - design a registry that maintains a cache of prototypical objects
    - design API that allows to clone object inside the factory and return new object as a result
    - use factory api instead of new keyword to instantiate the object
 */
public class Main {
    public static void main(String[] args) {

        String archiverType1 = "zip";
        String archiverType2 = "rar";

        Archiver zipArchiver = ArchiverFactory.getPrototypeForType(archiverType1);
        Archiver rarArchiver = ArchiverFactory.getPrototypeForType(archiverType2);

        zipArchiver.archive(new File(""));
        rarArchiver.archive(new File(""));
    }
}
