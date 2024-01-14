package Prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.Serializable;
public class RarArchiver implements Archiver, Serializable {
    @Override
    public void archive(File directory) {
        System.out.println("Rar archive have bean made");
    }

    @Override
    public Archiver clone() {
        return SerializationUtils.clone(this);
    }
}
