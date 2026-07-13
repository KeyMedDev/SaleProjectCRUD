package com.SaleProject.model;

public class MProducto {
    private int idProducto;
    private String descProducto;
    private String unidad;
    private double precioVenta; // Usamos double primitivo para precisión monetaria sutil
    private int stock;
    private int minStock;
    private int idCategoria;
    
    // Constructor Vacío
    public MProducto() {
        this.idProducto = 0;
        this.descProducto = "";
        this.unidad = "";
        this.precioVenta = 0.0;
        this.stock = 0;
        this.minStock = 0;
        this.idCategoria = 0;
    }
    
    // Constructor Lleno
    public MProducto(int idProducto, String descProducto, String unidad, double precioVenta, int stock, int minStock, int idCategoria) {
        this.idProducto = idProducto;
        this.descProducto = descProducto;
        this.unidad = unidad;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.minStock = minStock;
        this.idCategoria = idCategoria;
    }
    
    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getDescProducto() { return descProducto; }
    public void setDescProducto(String descProducto) { this.descProducto = descProducto; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public double getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public int getMinStock() { return minStock; }
    public void setMinStock(int minStock) { this.minStock = minStock; }

    public int getIdCategoria() { return idCategoria; }
    public void setIdCategoria(int idCategoria) { this.idCategoria = idCategoria; }
        
}
