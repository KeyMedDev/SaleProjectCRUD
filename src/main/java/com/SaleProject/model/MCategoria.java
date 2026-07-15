package com.SaleProject.model;

public class MCategoria {

    // Atributos Privados
    private int idCategoria;
    private String descCategoria;

    // Métodos Getters y Setters
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getDescCategoria() {
        return descCategoria;
    }
    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    // Constructores (Inicialización y creacion del objeto)
    //Constructor Vacio
    //Inicializa los atributos con valores neutros por defecto usando los setters de la clase.
    public MCategoria() {
        this.setIdCategoria(0);
        this.setDescCategoria("");
    }

    //Constructor Parametrizado (Lleno)
    //Permite instanciar y asignar valores reales a la categoria en una sola línea.
    public MCategoria(int pIdCategoria, String pDescCategoria) {
        this.setIdCategoria(pIdCategoria);
        this.setDescCategoria(pDescCategoria);
    }
}