package oop.service;

import oop.model.Vuelo;
import java.util.ArrayList;
import java.util.List;

public class gestorVuelos {
    private List<Vuelo> vuelos = new ArrayList<>();

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
        System.out.println("Vuelo " + vuelo.numeroVuelo() + " agregado con éxito.");
    }

    public void listarVuelos() {
        vuelos.forEach(System.out::println);
    }
}