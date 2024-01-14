package Prototype;

import java.util.HashMap;
import java.util.Map;

public class ArchiverFactory {

    private static final Map<String, Archiver> prototypes = new HashMap<>();

    static {
        prototypes.put("zip", new ZipArchiver());
        prototypes.put("rar", new ZipArchiver());
    }

    public static Archiver getPrototypeForType(String archiverType) {
        return prototypes.get(archiverType).clone();

    }
}
