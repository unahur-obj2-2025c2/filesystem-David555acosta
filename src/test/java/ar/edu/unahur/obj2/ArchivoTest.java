package ar.edu.unahur.obj2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArchivoTest {
    static Ielemento archivo1; // 👈 tiene que ser static si se usa en BeforeAll

    @BeforeAll
    static void setUp() {
        archivo1 = new Archivo("A1", "txt", 100); // 👈 suponiendo que Archivo implementa Ielemento
    }

    @Test
    void testNombre() {
        assertEquals("A1", archivo1.nombre());
    }

    @Test
    void testTamanio() {
        assertEquals(100, archivo1.tamanio());
    }

    @Test
    void testArchivoMasPesado() {
        assertTrue(archivo1.archivoMasPesado().equals(archivo1));
    }
}
