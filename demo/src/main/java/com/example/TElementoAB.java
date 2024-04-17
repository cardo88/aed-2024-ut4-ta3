package com.example;

public class TElementoAB<T> implements IElementoAB<T> {

    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private Comparable etiqueta;
    private T datos;

    public TElementoAB(Comparable etiqueta, T datos) {
        this.etiqueta = etiqueta;
        this.datos = datos;
    }

    @Override
    public Comparable getEtiqueta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEtiqueta'");
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHijoIzq'");
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHijoDer'");
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHijoIzq'");
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHijoDer'");
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(etiqueta) == 0) {
            return this;
        }
        if (unaEtiqueta.compareTo(etiqueta) < 0) {
            return hijoIzq.buscar(unaEtiqueta);
        } else {
            return hijoDer.buscar(unaEtiqueta);
        }
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento, int[] contador) {

        contador[0]++;
        if (this.etiqueta.compareTo((T) elemento.etiqueta) == 0) {
            return false;
        } else if (this.etiqueta.compareTo((T) elemento.etiqueta) > 0) {
            if (this.hijoDer == null) {
                this.hijoDer = elemento;
                return true;
            } else {
                return this.hijoDer.insertar(elemento, contador);
            }
        } else {
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento, contador);
            }
        }
    }

    @Override
    public String preOrden() {
        String res = "";

        res += etiqueta + ", ";

        if (hijoIzq != null)
            res += hijoIzq.preOrden();
        if (hijoDer != null)
            res += hijoDer.preOrden();

        return res;
    }

    @Override
    public String inOrden() {
        String res = "";

        if (hijoIzq != null)
            res += hijoIzq.inOrden();

        res += etiqueta + ", ";

        if (hijoDer != null)
            res += hijoDer.inOrden();

        return res;
    }

    @Override
    public String postOrden() {
        String res = "";

        if (hijoIzq != null)
            res += hijoIzq.postOrden();

        if (hijoDer != null)
            res += hijoDer.postOrden();

        res += etiqueta + ", ";

        return res;
    }

    @Override
    public T getDatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDatos'");
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        if (etiqueta.compareTo(unaEtiqueta) < 0) {
            if (hijoIzq != null) {
                hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }
        if (etiqueta.compareTo(unaEtiqueta) > 0) {
            if (hijoDer != null) {
                hijoIzq = hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }

        return quitaNodo();
    }

    private TElementoAB quitaNodo() {
        if (hijoIzq == null) {
            return hijoDer;
        }
        if (hijoDer == null) {
            return hijoIzq;
        }

        TElementoAB elHijo = hijoIzq;
        TElementoAB elPadre = this;

        while (elHijo.hijoDer != null) {
            elPadre = elHijo;
            elHijo = elHijo.hijoDer;
        }

        if (elPadre != this) {
            elPadre.hijoDer = elHijo.hijoIzq;
            elHijo.hijoIzq = hijoIzq;
        }

        elHijo.hijoDer = hijoDer;

        return elHijo;
    }

    public int obtenerTamaño() {
        int tamaño = 1;

        if (hijoDer != null) {
            tamaño += hijoDer.obtenerTamaño();
        }

        if (hijoIzq != null) {
            tamaño += hijoIzq.obtenerTamaño();
        }

        return tamaño;
    }
}
