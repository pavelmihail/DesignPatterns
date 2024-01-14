package FactoryMethode;

import java.io.File;

public class RarArchiver implements Archiver {

    @Override
    public void archive(File direrctory) {
        System.out.println("Rar archiver created");
    }
}
