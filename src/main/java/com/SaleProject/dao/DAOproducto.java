package com.SaleProject.dao;

import com.SaleProject.config.connectiondb;
import com.SaleProject.model.MProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOproducto {

    public ArrayList<MProducto> listarProductos() {
        ArrayList<MProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM tproducto";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                MProducto p = new MProducto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescProducto(rs.getString("descProd"));
                p.setUnidad(rs.getString("unidad"));
                p.setPrecioVenta(rs.getDouble("precVenta"));
                p.setStock(rs.getInt("stock"));
                p.setMinStock(rs.getInt("stockMin"));
                p.setIdCategoria(rs.getInt("idCategoria"));

                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en listar productos: " + e.getMessage());
            }
        }
        return lista;
    }
}