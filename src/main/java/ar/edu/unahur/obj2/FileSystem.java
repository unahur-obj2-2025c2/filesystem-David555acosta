package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private List<Ielemento> archivos = new ArrayList<>();

    public void agregarArchivo(Ielemento archivo) {
        this.archivos.add(archivo);
    }

    public Integer tamanio() {
        return this.archivos.stream().mapToInt(a -> a.tamanio()).sum();
    }

    public void mostrar() {
        System.out.printf("└ Root ( %d-Bytes )", tamanio());
        this.archivos.forEach(a -> a.mostrar(1));
    }

    public Ielemento archivoMasPesado() {
        Ielemento masPesado = this.archivos.stream()
                .max((a, b) -> Integer.compare(a.archivoMasPesado().tamanio(), b.archivoMasPesado().tamanio()))
                .orElse(null);
        if (masPesado instanceof Carpeta) {
            masPesado = masPesado.archivoMasPesado();
        }
        return masPesado;
    }

}
