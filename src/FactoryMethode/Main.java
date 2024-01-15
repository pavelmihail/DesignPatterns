package FactoryMethode;

import java.io.File;

/*
    To do:
    - define hierarchy of objects
    - design the arguments for the factory method.
    - call Factory method during the runtime to instantiate the object that you need 
 */

public class Main {

    public static void main(String[] args) {
        Archiver arc1 = ArchiverFactory.getArchiver("zip");
        Archiver arc2 = ArchiverFactory.getArchiver("rar");

        assert arc1 != null;
        arc1.archive(new File(""));
        assert arc2 != null;
        arc2.archive(new File(""));

        System.out.println(ArchiverFactory.getArchiver("zip") == arc1);
    }
}
