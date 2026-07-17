package oop.dto;

public class pasajerosDTO {
    private String nombre;
    private String apellido;
    private String identificacion;
    private int edad;
    private String nacionalidad;
    private String identificacionPasaporte;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacionPasaporte() {
        return identificacionPasaporte;
    }

    public void setIdentificacionPasaporte(String identificacionPasaporte) {
        this.identificacionPasaporte = identificacionPasaporte;
    }
}
