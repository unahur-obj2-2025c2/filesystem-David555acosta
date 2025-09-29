package ar.edu.unahur.obj2;

import java.util.*;

public class Carpeta implements Ielemento {

    private String nombre;
    private List<Ielemento> elementos = new ArrayList<>();

    public Carpeta(String nombre, List<Ielemento> elementos) {
        this.nombre = nombre;
        this.elementos = elementos;
    }

    @Override
    public String nombre() {
        // TODO Auto-generated method stub
        return this.nombre;
    }

    @Override
    public Integer tamanio() {
        // TODO Auto-generated method stub
        return elementos.stream().mapToInt(e -> e.tamanio()).sum();
    }

    @Override
    public void mostrar(Integer indentacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public Ielemento archivoMasPesado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'archivoMasPesado'");
    }

}
