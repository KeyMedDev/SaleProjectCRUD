package com.SaleProject.model;

public class MCajero {

    //Campos privados:
    private int idCajero;
    private String nomCajero;
    private String apPat;
    private String apMat;
    private String usuario;
    private String clave;
    private int idLocal;

    //Propiedads públicas:
    public int getIdCajero() {
        return idCajero;
    }
    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }
    public String getNomCajero() {
        return nomCajero;
    }
    public void setNomCajero(String nomCajero) {
        this.nomCajero = nomCajero;
    }
    public String getApPat() {
        return apPat;
    }
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    public String getApMat() {
        return apMat;
    }
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public int getIdLocal() {
        return idLocal;
    }
    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    //Constructores:
    public MCajero(){
        this.setIdCajero(0);
        this.setNomCajero("");
        this.setApPat("");
        this.setApMat("");
        this.setUsuario("");
        this.setClave("");
        this.setIdLocal(0);
    }

    public MCajero(int pIdCajero,String pNomCajero,String pApPat,String pApMat, String pUsuario,String pClave,int pIdLocal) {
        this.setIdCajero(pIdCajero);
        this.setNomCajero(pNomCajero);
        this.setApPat(pApPat);
        this.setApMat(pApMat);
        this.setUsuario(pUsuario);
        this.setClave(pClave);
        this.setIdLocal(pIdLocal);
    }
}
