package ar.edu.unahur.obj2;

import java.util.*;

public class Carpeta implements Ielemento {

    private String nombre;
    private List<Ielemento> archivos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public Integer tamanio() {
        Integer resultado = 0;
        if (!this.archivos.isEmpty()) {
            resultado = this.archivos.stream().mapToInt(a -> a.tamanio()).sum();
        }
        return resultado;
    }

    @Override
    public void mostrar(Integer identacion) {
        System.out.printf("\n" + "\t".repeat(identacion) + "├ Carpeta %s Nivel %d ( %d-Bytes )", nombre, identacion,
                tamanio());
        this.archivos.forEach(a -> a.mostrar(identacion + 1));
    }

    @Override
    public Ielemento archivoMasPesado() {
        Ielemento masPesado = this.archivos.stream()
                .max((a, b) -> Integer.compare(a.archivoMasPesado().tamanio(), b.archivoMasPesado().tamanio()))
                .orElse(null);
        return masPesado;
    }

}
