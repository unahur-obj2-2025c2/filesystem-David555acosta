package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.Carpeta;
import ar.edu.unahur.obj2.Archivo;

public class CarpetaTest {
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
        
        carpeta1 = new Carpeta("C1");
        carpeta2 = new Carpeta("C2");
        carpeta3 = new Carpeta("C3");

        carpeta1.agregarElemento(archivo1);
        carpeta1.agregarElemento(archivo2);
        carpeta2.agregarElemento(archivo3);
        carpeta3.agregarElemento(carpeta1);
        carpeta3.agregarElemento(carpeta2);
        carpeta3.agregarElemento(archivo4);
    }

    @Test
    void testAgregarElemento() {
        assertTrue(carpeta3.getElementos().size() == 3);
    }

    @Test
    void testArchivoMasPesado() {
        assertEquals(archivo3, carpeta3.archivoMasPesado());
    }

    @Test
    void testEliminarElemento() {
        carpeta1.eliminarElemento(archivo4);
        assertEquals(2, carpeta3.getElementos().size());
    }

    @Test
    void testMostrar() {

    }

    @Test
    void testNombre() {
        assertEquals("C3", carpeta3.nombre());
    }

    @Test
    void testTamanio() {
        assertEquals(450, carpeta3.tamanio());
    }
}
