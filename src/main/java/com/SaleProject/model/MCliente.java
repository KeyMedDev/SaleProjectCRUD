package com.SaleProject.model;

public class MCliente {
    private int idCliente;
    private String dni;
    private String apPat;
    private String apMat;
    private String nombre;

    // Constructor Vacío
    public MCliente() {
        this.idCliente = 0;
        this.dni = "";
        this.apPat = "";
        this.apMat = "";
        this.nombre = "";
    }

    // Constructor Lleno
    public MCliente(int idCliente, String dni, String apPat, String apMat, String nombre) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apPat = apPat;
        this.apMat = apMat;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getApPat() { return apPat; }
    public void setApPat(String apPat) { this.apPat = apPat; }

    public String getApMat() { return apMat; }
    public void setApMat(String apMat) { this.apMat = apMat; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}