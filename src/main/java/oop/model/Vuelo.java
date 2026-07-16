package oop.model;

public record Vuelo(String numeroVuelo, String destino, int capacidad) {
    // Los records ya traen constructor, getters y toString() gratis
}