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
    public void mostrar(Integer identacion) {
        System.out.printf("\n" + "\t".repeat(identacion) + "├ %s%s", nombre, extension);
    }

    @Override
    public Ielemento archivoMasPesado() {
        // TODO Auto-generated method stub
        return this;
    }

}
