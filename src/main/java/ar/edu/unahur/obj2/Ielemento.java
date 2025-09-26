package ar.edu.unahur.obj2;

public interface Ielemento {
    String nombre();

    Integer tamanio();

    void mostrar(Integer indentacion);

    Ielemento archivoMasPesado();
}
