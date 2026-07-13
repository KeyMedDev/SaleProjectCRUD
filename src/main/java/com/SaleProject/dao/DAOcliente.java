package com.SaleProject.dao;

import com.SaleProject.config.connectiondb;
import com.SaleProject.model.MCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOcliente {

    public ArrayList<MCliente> listarClientes() {
        ArrayList<MCliente> lista = new ArrayList<>();
        String sql = "SELECT idCliente, dni, apPat, apMat, nombre FROM tcliente";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                MCliente c = new MCliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setDni(rs.getString("dni"));
                c.setApPat(rs.getString("apPat"));
                c.setApMat(rs.getString("apMat"));
                c.setNombre(rs.getString("nombre"));

                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en DAOcliente: " + e.getMessage());
            }
        }
        return lista;
    }
}