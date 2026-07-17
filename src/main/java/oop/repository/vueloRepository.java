package oop.repository;

import oop.model.vueloModel;
import java.util.ArrayList;
import java.util.List;

public class vueloRepository {
    // Aquí vive la fuente de datos real
    private List<vueloModel> baseDeDatos = new ArrayList<>();

    public void guardar(vueloModel vuelo) {
        baseDeDatos.add(vuelo);
    }

    public List<vueloModel> obtenerTodos() {
        return new ArrayList<>(baseDeDatos);
    }
}
