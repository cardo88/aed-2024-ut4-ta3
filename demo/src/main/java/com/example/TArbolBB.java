package com.example;

public class TArbolBB<T> implements IArbolBB {

    private TElementoAB<T> raiz;

    @Override
    public boolean insertar(Comparable etiqueta, Object dato) {
        TElementoAB<T> unElemento = new TElementoAB<>(etiqueta, (T) dato);
        if (raiz == null) {
            raiz = unElemento;
            return true;
        } else {
            int[] contador = new int[1];
            contador[0] = 0;
            raiz.insertar(unElemento, contador);
            System.out.println("Contador: " + contador[0]);
            return true;
        }
    }

    @Override
    public TElementoAB buscar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public String preOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'preOrden'");
    }

    @Override
    public String inOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inOrden'");
    }

    @Override
    public String postOrden() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postOrden'");
    }

    @Override
    public Object eliminar(Comparable unaEtiqueta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    public void insertar(Object etiqueta, TElementoAB<String> dato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertar'");
    }

    public int obtenerTamaño() {
        if (raiz != null) {
            return raiz.obtenerTamaño();
        }
        return 0;
    }
}
