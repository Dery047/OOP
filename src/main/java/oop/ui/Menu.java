package oop.ui;

import oop.model.pasajeros;
import oop.service.gestorVuelos;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private gestorVuelos gestor;

    public Menu(gestorVuelos gestor) {
        this.gestor = gestor;
    }

    public void ejecutarRegistro() {
        System.out.println("¿A qué número de vuelo deseas registrarte?");
        String numVuelo = sc.nextLine();

        System.out.println("Nombre del pasajero:");
        String nombre = sc.nextLine();

        System.out.println("Documento:");
        String doc = sc.nextLine();



        pasajeros p = new pasajeros(nombre, apellido,iden);
        gestor.registrarPasajeroEnVuelo(numVuelo, p);
    }
}