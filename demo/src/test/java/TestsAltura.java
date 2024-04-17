
import org.junit.jupiter.api.Test;

import com.example.TArbolBB;
import com.example.TElementoAB;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsAltura {

    @Test
    public void testVacio() {
        TArbolBB arbol = new TArbolBB<>();

        assertEquals(0, arbol.obtenerAltura());
    }

    @Test
    public void testAltura_1() {
        TArbolBB arbol = new TArbolBB<>();
        arbol.insertar(3, "tres");
        arbol.insertar(2, "dos");
        arbol.insertar(1, "uno");
        arbol.insertar(4, "cuatro");
        arbol.insertar(5, "cinco");

        assertEquals(3, arbol.obtenerAltura());
    }

    @Test
    public void testAltura_2() {
        TArbolBB arbol = new TArbolBB<>();
        arbol.insertar(2, "dos");
        arbol.insertar(1, "uno");
        arbol.insertar(3, "tres");
        arbol.insertar(4, "cuatro");
        arbol.insertar(5, "cinco");

        assertEquals(4, arbol.obtenerAltura());
    }

    @Test
    public void testArbolNoAlterado() {

        TArbolBB arbol = new TArbolBB<>();
        arbol.insertar(3, "tres");
        arbol.insertar(2, "dos");
        arbol.insertar(1, "uno");
        arbol.insertar(4, "cuatro");
        arbol.insertar(5, "cinco");

        String[] pre = new String[2];
        pre[0] = arbol.inOrden();
        pre[1] = arbol.preOrden();

        arbol.obtenerAltura();

        String[] post = new String[2];
        post[0] = arbol.inOrden();
        post[1] = arbol.preOrden();

        assertEquals(pre, post);
    }
}
