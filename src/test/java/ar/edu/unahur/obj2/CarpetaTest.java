package ar.edu.unahur.obj2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarpetaTest {
    static Ielemento archivo1;
    static Ielemento archivo2;
    static Ielemento archivo3;
    static Ielemento archivo4;
    static Ielemento carpeta1;
    static Ielemento carpeta2;
    static Ielemento carpeta3;

    @BeforeAll
    static void setUp() {
        archivo1 = new Archivo("A1", "txt", 100);
        archivo2 = new Archivo("A2", "jpg", 100);
        archivo3 = new Archivo("A3", "jpg", 300);
        archivo4 = new Archivo("A4", "mp3", 50);
        carpeta1 = new Carpeta("C1");
        carpeta2 = new Carpeta("C2");
        carpeta3 = new Carpeta("C3");


        
    }

    @Test
    void testAgregarElemento() {

    }

    @Test
    void testArchivoMasPesado() {

    }

    @Test
    void testEliminarElemento() {

    }

    @Test
    void testMostrar() {

    }

    @Test
    void testNombre() {

    }

    @Test
    void testTamanio() {

    }
}
