package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FileSystem {
    private List<Ielemento> elementos = new ArrayList<>();
    private static FileSystem instance = new FileSystem();

    private FileSystem() {
    }

    public static FileSystem getInstance() {
        return instance;
    }

    public Integer tamanio() {
        return elementos.stream().mapToInt(e -> e.tamanio()).sum();
    }

    public Ielemento archivoMasPesado() {
        if (elementos.isEmpty()) {
            throw new IllegalArgumentException("El argumento no es válido");
        }

        return elementos.stream().max(Comparator.comparing(e -> e.tamanio()))
                .orElse(new Archivo("archivo vacio", "", 0));
    }

}
