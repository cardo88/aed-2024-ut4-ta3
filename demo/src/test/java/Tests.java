
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.example.TArbolBB;
import com.example.TElementoAB;
/*
 * Desarrolla los casos de test para la funcionalidad de Eliminar(unaEtiqueta)
 * del TDA ArbolBinarioBusqueda.
 * En estos tests se debe:
 * a) Insertar elementos en el árbol con claves 12, 25, 14, 1, 33, 88, 45, 2, 7,
 * 66,5, 99
 * b) Emitir por consola el recorrido en inorden c) Eliminar del árbol los
 * elementos con las siguientes claves: 99, 15, 2, 12, 77, 33
 * d) Emitir por consola los recorridos en inorden, preorden y postorden
 * e) Verificar que la salida luego de efectuar cada eliminación es la esperada.
 * 
 * public class Tests {
 * 
 * @Test
 * public void test() {
 * TArbolBB<String> root = new TArbolBB<String>();
 * root.insertar(12, null);
 * root.insertar(25, null);
 * root.insertar((14, null));
 * root.insertar((1, null));
 * root.insertar((33, null));
 * root.insertar((88, null));
 * root.insertar((45, null));
 * root.insertar((2, null));
 * root.insertar((7, null));
 * root.insertar((66, null));
 * root.insertar((5, null));
 * root.insertar((99, null));
 * System.out.println(root.inOrden());
 * root.eliminar(99);
 * System.out.println(root.inOrden());
 * System.out.println(root.preOrden());
 * System.out.println(root.postOrden());
 * assertEquals("1-2-5-7-12-14-25-33-45-66-88", root.inOrden());
 * root.eliminar(15);
 * assertEquals("1-2-5-7-12-14-25-33-45-66-88", root.inOrden());
 * root.eliminar(2);
 * assertEquals("1-5-7-12-14-25-33-45-66-88", root.inOrden());
 * root.eliminar(12);
 * assertEquals("1-5-7-14-25-33-45-66-88", root.inOrden());
 * root.eliminar(77);
 * assertEquals("1-5-7-14-25-33-45-66-88", root.inOrden());
 * root.eliminar(33);
 * assertEquals("1-5-7-14-25-45-66-88", root.inOrden());
 * }
 * }
 */