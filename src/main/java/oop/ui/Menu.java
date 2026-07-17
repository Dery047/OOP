package oop.ui;

import oop.model.pasajerosModel;
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

        System.out.println("Apellido del pasajero:");
        String apellido = sc.nextLine();

        System.out.println("Identificación del pasajero:");
        String identificacion = sc.nextLine();

        int edad = -1;
        while (edad < 0 || edad > 130) {
            System.out.println("Ingrese edad del pasajero (0-130):");
            try {
                String entrada = sc.nextLine();
                edad = Integer.parseInt(entrada); // Intenta convertir el texto a número

                if (edad < 0 || edad > 130) {
                    System.out.println("Error: La edad debe estar entre 0 y 130.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número válido.");
            }
        }

        System.out.println("Nacionalidad del pasajero:");
        String nacionalidad = sc.nextLine();

        System.out.println("Identificación del pasaporte:");
        String identificacionPasaporte = sc.nextLine();
        pasajerosModel p = new pasajerosModel(nombre, apellido, identificacion, edad, nacionalidad, identificacionPasaporte);

        gestor.registrarPasajeroEnVuelo(numVuelo, p);
    }

}