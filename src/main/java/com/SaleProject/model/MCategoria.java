package com.SaleProject.model;

public class MCategoria {

    // Campos privados:
    private int idCategoria;
    private String descCategoria;

    // Propiedades públicas:
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

    // Constructores:
    public MCategoria() {
        this.setIdCategoria(0);
        this.setDescCategoria("");
    }

    public MCategoria(int pIdCategoria, String pDescCategoria) {
        this.setIdCategoria(pIdCategoria);
        this.setDescCategoria(pDescCategoria);
    }
}