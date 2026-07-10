package com.SaleProject.dao;

import com.SaleProject.config.connectiondb;
import com.SaleProject.model.MCajero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOcajero {

    public ArrayList<MCajero> listarCajeros() {
        ArrayList<MCajero> lista = new ArrayList<>();
        String sql = "SELECT * FROM tcajero";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                MCajero c = new MCajero();
                c.setIdCajero(rs.getInt("idcajero"));
                c.setNomCajero(rs.getString("nomcajero"));
                c.setApPat(rs.getString("appat"));
                c.setApMat(rs.getString("apmat"));
                c.setUsuario(rs.getString("usuario"));
                c.setClave(rs.getString("clave"));
                c.setIdLocal(rs.getInt("idlocal"));

                lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error al listar cajeros: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en listar: " + e.getMessage());
            }
        }
        return lista;
    }

    public boolean modificarCajero(MCajero cajero) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE tcajero SET nomCajero=?, apPat=?, apMat=?, usuario=?, clave=?, idLocal=? WHERE idCajero=?";

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);

            ps.setString(1, cajero.getNomCajero());
            ps.setString(2, cajero.getApPat());
            ps.setString(3, cajero.getApMat());
            ps.setString(4, cajero.getUsuario());
            ps.setString(5, cajero.getClave());
            ps.setInt(6, cajero.getIdLocal());
            ps.setInt(7, cajero.getIdCajero());

            int filas = ps.executeUpdate();
            return filas > 0;
        } catch (Exception e) {
            System.out.println("Error al modificar cajero: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en modificar: " + e.getMessage());
            }
        }
    }

    public boolean insertarCajero(MCajero cajero) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO tcajero (idCajero, nomCajero, apPat, apMat, usuario, clave, idLocal) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);

            ps.setInt(1, cajero.getIdCajero());
            ps.setString(2, cajero.getNomCajero());
            ps.setString(3, cajero.getApPat());
            ps.setString(4, cajero.getApMat());
            ps.setString(5, cajero.getUsuario());
            ps.setString(6, cajero.getClave());
            ps.setInt(7, cajero.getIdLocal());

            int filas = ps.executeUpdate();
            return filas > 0;
        } catch (Exception e) {
            System.out.println("Error al insertar cajero: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en insertar: " + e.getMessage());
            }
        }
    }

    public boolean eliminarCajero(int idCajero) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM tcajero WHERE idCajero = ?";

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, idCajero);

            int filas = ps.executeUpdate();
            return filas > 0;
        } catch (Exception e) {
            System.out.println("Error al eliminar cajero: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en eliminar: " + e.getMessage());
            }
        }
    }
}