package com.SaleProject.dao;

import com.SaleProject.config.connectiondb;
import com.SaleProject.model.MCategoria;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DAOcategoria {

    public List<MCategoria> ListarCategoria() {
        Connection cn = connectiondb.getConexion();
        String sql = "select * from tcategoria";
        Statement st = null; 
        ResultSet rs = null;
        List<MCategoria> list = new ArrayList<>();

        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                int idCategoria = rs.getInt("idCategoria");
                String descCategoria = rs.getString("descCategoria");
                
                MCategoria oCategoria = new MCategoria(idCategoria, descCategoria);
                list.add(oCategoria);
            }
            return list;
        }
        catch (Exception e) {
            System.out.println("Error en DAOcategoria.ListarCategoria: " + e.toString());
            return null;
        }
        finally {
            // Cierre seguro de recursos de base de datos
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (Exception ex) {
                System.out.println("Error al cerrar recursos en DAOcategoria: " + ex.getMessage());
            }
        }
    }
}