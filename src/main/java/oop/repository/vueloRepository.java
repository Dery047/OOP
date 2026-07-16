package oop.repository;

import oop.model.Vuelo;
import java.util.ArrayList;
import java.util.List;

public class vueloRepository {
    // Aquí vive la fuente de datos real
    private List<Vuelo> baseDeDatos = new ArrayList<>();

    public void guardar(Vuelo vuelo) {
        baseDeDatos.add(vuelo);
    }

    public List<Vuelo> obtenerTodos() {
        return new ArrayList<>(baseDeDatos);
    }
}
