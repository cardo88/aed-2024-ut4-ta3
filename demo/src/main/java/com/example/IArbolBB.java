package com.example;

public interface IArbolBB<T> {

  /**
   * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
   * clave indicada en "unElemento", retorna falso.
   *
   * @param etiqueta Etiqueta del nodo a insertar
   * @param dato     Dato del nodo a insertar
   * @return Exito de la operacián
   */

  public boolean insertar(Comparable etiqueta, T dato);

  /**
   * Busca un elemento dentro del árbol.
   *
   *
   * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
   *                    .
   * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
   */
  public TElementoAB<T> buscar(Comparable unaEtiqueta);

  /**
   * Imprime en PreOrden los elementos del árbol, separados por guiones.
   *
   * @return String conteniendo el preorden separado por guiones.
   */
  public String preOrden();

  /**
   * Imprime en InOrden los elementos del árbol, separados por guiones.
   *
   * @return String conteniendo el preorden separado por guiones.
   */
  public String inOrden();

  /**
   * Imprime en PostOrden los elementos del árbol, separados por guiones.
   *
   * @return String conteniendo el preorden separado por guiones.
   */
  public String postOrden();

  /**
   * Elimina un elemento dada una etiqueta.
   * 
   * @param unaEtiqueta
   * @return Dato del nodo eliminado, null si no se encontró.
   */
  public T eliminar(Comparable unaEtiqueta);

  /**
   * Retorna la altura del árbol.
   * 
   * @return Altura del árbol.
   */
  public int obtenerAltura();

  /**
   * Retorna el tamaño del árbol.
   * 
   * @return Tamaño del árbol.
   */
  public int obtenerTamano();
}
