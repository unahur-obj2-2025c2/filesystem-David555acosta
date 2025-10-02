package ar.edu.unahur.obj2;

import java.util.*;

public class Carpeta implements Ielemento {

    private String nombre;
    private List<Ielemento> elementos = new ArrayList<>();

    public Carpeta(String nombre, List<Ielemento> elementos) {
        this.nombre = nombre;
        this.elementos = elementos;
    }

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public List<Ielemento> getElementos() {
        return elementos;
    }

    @Override
    public String nombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }

    @Override
    public Integer tamanio() {
        return elementos.stream().mapToInt(e -> e.tamanio()).sum();
    }

    @Override
    public void mostrar(Integer indentacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public Ielemento archivoMasPesado() {
        if (elementos.isEmpty()) {
            throw new IllegalArgumentException("El argumento no es válido");
        }

        return elementos.stream().max(Comparator.comparing(e -> e.tamanio()))
                .orElse(new Archivo("archivo vacio", "", 0));
    }

    public void agregarElemento(Ielemento elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(Ielemento elemento) {
        elementos.remove(elemento);
    }

}
