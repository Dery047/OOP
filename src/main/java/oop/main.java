package oop;

import oop.model.Vuelo;
import oop.service.gestorVuelos;

public class main {
    public static void main(String[] args) {
        gestorVuelos gestor = new gestorVuelos();

        // Creamos objetos
        Vuelo v1 = new Vuelo("AV123", "Medellín", 180);
        Vuelo v2 = new Vuelo("LA456", "Bogotá", 200);

        // Usamos la lógica
        gestor.agregarVuelo(v1);
        gestor.agregarVuelo(v2);

        System.out.println("--- Lista de Vuelos ---");
        gestor.listarVuelos();
    }
}