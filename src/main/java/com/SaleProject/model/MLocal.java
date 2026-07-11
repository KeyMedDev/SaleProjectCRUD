package com.SaleProject.model;

public class MLocal {

    //Campos privados:
    private int idLocal;
    private String administrador;
    private String diasAtenc;
    private String horario;
    private String direccion;

    //Propiedads públicas:
    public int getIdLocal() {
        return idLocal;
    }
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }
    public String getAdministrador() {
        return administrador;
    }
    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }
    public String getDiasAtenc() {
        return diasAtenc;
    }
    public void setDiasAtenc(String diasAtenc) {
        this.diasAtenc = diasAtenc;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Constructores:
    public MLocal(){
        this.setIdLocal(0);
        this.setAdministrador("");
        this.setDiasAtenc("");
        this.setHorario("");
        this.setDireccion("");
    }

    public MLocal(int pIdLocal, String pAdministrador, String pDiasAtenc, String pHorario, String pDireccion) {
        this.setIdLocal(pIdLocal);
        this.setAdministrador(pAdministrador);
        this.setDiasAtenc(pDiasAtenc);
        this.setHorario(pHorario);
        this.setDireccion(pDireccion);
    }
}
