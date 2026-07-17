package oop.service;

import oop.model.vueloModel;
import oop.model.pasajerosModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gestorVuelos {
    private List<vueloModel> vuelos = new ArrayList<>();
    // Aquí guardamos los pasajeros vinculados a un número de vuelo
    private Map<String, List<pasajerosModel>> reservas = new HashMap<>();

    public void agregarVuelo(vueloModel v) {
        vuelos.add(v);
        reservas.put(v.numeroVuelo(), new ArrayList<>());
    }

    public void registrarPasajeroEnVuelo(String numVuelo, pasajerosModel p) {
        if (reservas.containsKey(numVuelo)) {
            reservas.get(numVuelo).add(p);
            System.out.println("Pasajero registrado.");
        } else {
            System.out.println("Vuelo no existe.");
        }
    }
}