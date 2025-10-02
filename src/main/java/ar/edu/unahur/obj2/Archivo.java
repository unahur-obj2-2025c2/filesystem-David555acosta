package ar.edu.unahur.obj2;

public class Archivo implements Ielemento {

    private String nombre;
    private String extension;
    private Integer tamanio;

    public Archivo(String nombre, String extension, Integer tamanio) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public Integer tamanio() {
        return this.tamanio;
    }

    @Override
    public void mostrar(Integer indentacion) {
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    @Override
    public Ielemento archivoMasPesado() {
        return this;
    }

}
