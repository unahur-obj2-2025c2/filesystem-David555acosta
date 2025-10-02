package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.Carpeta;
import ar.edu.unahur.obj2.Archivo;

public class FileSystemTest {
    static Archivo archivo1;
    static Archivo archivo2;
    static Archivo archivo3;
    static Archivo archivo4;
    static Archivo archivo5;
    static Archivo archivo6;

    static Carpeta carpeta1;
    static Carpeta carpeta2;
    static Carpeta carpeta3;
    static Carpeta carpeta4;
    static Carpeta carpeta5;
    static Carpeta carpeta6;

    @BeforeAll
    static void setUp() {
        archivo1 = new Archivo("A1", "txt", 100);
        archivo2 = new Archivo("A2", "jpg", 100);
        archivo3 = new Archivo("A3", "jpg", 300);
        archivo4 = new Archivo("A4", "mp3", 50);
        archivo5 = new Archivo("A5", "MP4", 600);
        archivo6 = new Archivo("A6", "TXT", 10);

        carpeta1 = new Carpeta("C1");
        carpeta2 = new Carpeta("C2");
        carpeta3 = new Carpeta("C3");
        carpeta4 = new Carpeta("C4");
        carpeta5 = new Carpeta("C5");
        carpeta6 = new Carpeta("C6");

        carpeta1.agregarElemento(archivo1);
        carpeta1.agregarElemento(archivo2);

        carpeta2.agregarElemento(archivo3);

        carpeta3.agregarElemento(carpeta1);
        carpeta3.agregarElemento(carpeta2);

        carpeta4.agregarElemento(carpeta3);

        carpeta5.agregarElemento(archivo4);
        carpeta5.agregarElemento(archivo5);
        carpeta5.agregarElemento(archivo6);

        carpeta6.agregarElemento(archivo1);
        carpeta6.agregarElemento(carpeta5);

        FileSystem.getInstance().agregarElemento(carpeta3);
        FileSystem.getInstance().agregarElemento(carpeta6);
    }

    @Test
    void dadaUnaCarpetaHacemosUnTestDePrueba() {
        assertTrue(Boolean.TRUE);
    }

    @Test
    void testArchivoMasPesado() {
        assertEquals("A5", FileSystem.getInstance().archivoMasPesado().nombre());
    }

    @Test
    void testGetInstance() {
        assertNotNull(FileSystem.getInstance());
    }

    @Test
    void testTamanio() {
        assertEquals(1260, FileSystem.getInstance().tamanio());
    }

}
