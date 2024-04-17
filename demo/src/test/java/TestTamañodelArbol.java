import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.TArbolBB;

public class TestTamañodelArbol {
    @Test
    void obtenerTamaño() {
        TArbolBB<String> arbol = new TArbolBB<String>();
        arbol.insertar(12, 12);
        arbol.insertar(25, 25);
        arbol.insertar(14, 14);
        arbol.insertar(1, 1);
        arbol.insertar(33, 33);

        assertEquals(5, arbol.obtenerTamaño());
    }

    @Test
    void obtenerTamañoVacio() {
        TArbolBB<String> arbol = new TArbolBB<String>();
        assertEquals(0, arbol.obtenerTamaño());
    }

    @Test
    void noModifica() {
        TArbolBB<String> arbol = new TArbolBB<String>();
        arbol.insertar(12, 12);
        arbol.insertar(25, 25);
        arbol.insertar(14, 14);
        arbol.insertar(1, 1);
        arbol.insertar(33, 33);

        String inorden1 = arbol.inOrden();
        String preorden1 = arbol.preOrden();

        arbol.obtenerTamaño();

        String inorden2 = arbol.inOrden();
        String preorden2 = arbol.preOrden();

        assertEquals(inorden1, inorden2);
        assertEquals(preorden1, preorden2);
    }
}
