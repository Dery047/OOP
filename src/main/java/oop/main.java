package oop;

import oop.service.gestorVuelos;
import oop.ui.Menu;

public class main {
    public static void main(String[] args) {
        // 1. Creamos el gestor (el cerebro)
        gestorVuelos gestor = new gestorVuelos();

        // 2. Creamos el menú y le inyectamos el gestor creado arriba
        Menu menu = new Menu(gestor);

        // 3. Ejecutamos el registro
        menu.ejecutarRegistro();
    }
}