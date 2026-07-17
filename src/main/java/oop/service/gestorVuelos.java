package oop.service;

import oop.model.Vuelo;
import oop.model.pasajeros;
import oop.model.aircraft;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gestorVuelos {
    private List<Vuelo> vuelos = new ArrayList<>();
    // Aquí guardamos los pasajeros vinculados a un número de vuelo
    private Map<String, List<pasajeros>> reservas = new HashMap<>();

    public void agregarVuelo(Vuelo v) {
        vuelos.add(v);
        reservas.put(v.numeroVuelo(), new ArrayList<>());
    }

    public void registrarPasajeroEnVuelo(String numVuelo, pasajeros p) {
        if (reservas.containsKey(numVuelo)) {
            reservas.get(numVuelo).add(p);
            System.out.println("Pasajero registrado.");
        } else {
            System.out.println("Vuelo no existe.");
        }
    }
}