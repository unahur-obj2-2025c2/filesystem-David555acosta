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

        return elementos.stream().map(e -> e.archivoMasPesado()).max(Comparator.comparingInt(e -> e.tamanio()))
                .orElse(new Archivo("Archivo vacio", "", 0));
    }

    // return elementos.stream().max(Comparator.comparingInt(e ->
    // e.tamanio())).orElse(new Archivo("archivo vacio", "", 0));

    public void agregarElemento(Ielemento elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(Ielemento elemento) {
        elementos.remove(elemento);
    }

}
