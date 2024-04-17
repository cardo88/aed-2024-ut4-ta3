package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TArbolBB<Integer> arbol = new TArbolBB<>();
        String[] lineas = ManejadorArchivosGenerico
                .leerArchivo("demo\\src\\main\\java\\com\\example\\clavesPrueba.txt");
        for (String linea : lineas) {
            arbol.insertar(Integer.parseInt(linea), Integer.parseInt(linea));
        }
    }
}