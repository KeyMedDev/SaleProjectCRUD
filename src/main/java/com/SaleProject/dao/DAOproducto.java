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
    
    // Nuevo método buscarProductos adaptado idénticamente a tus tipos y flujo
    public ArrayList<MProducto> buscarProductos(String texto) {
        ArrayList<MProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM tproducto WHERE descProd LIKE ?";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, "%" + texto + "%");
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
            System.out.println("Error al buscar productos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en buscar productos: " + e.getMessage());
            }
        }
        return lista;
    }
    
    public boolean insertarProducto(MProducto p) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO tproducto (idProducto, descProd, unidad, precVenta, stock, stockMin, idCategoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);

            // Mapeo ordenado de parámetros para la consulta SQL
            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getDescProducto());
            ps.setString(3, p.getUnidad());
            ps.setDouble(4, p.getPrecioVenta());
            ps.setInt(5, p.getStock());
            ps.setInt(6, p.getMinStock());
            ps.setInt(7, p.getIdCategoria());

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se insertó con éxito

        } catch (Exception e) {
            System.out.println("Error en DAOproducto.insertarProducto: " + e.getMessage());
            return false;
        } finally {
            // Cierre seguro de recursos al estilo de tu proyecto
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en insertarProducto: " + e.getMessage());
            }
        }
    }
    
    public boolean modificarProducto(MProducto p) {
        Connection cn = null;
        PreparedStatement ps = null;
        // Sentencia SQL apuntando a las columnas reales de tu BD (tproducto)
        String sql = "UPDATE tproducto SET descProd = ?, unidad = ?, precVenta = ?, stock = ?, stockMin = ?, idCategoria = ? WHERE idProducto = ?";

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);

            // Mapeo de parámetros desde tu modelo MProducto
            ps.setString(1, p.getDescProducto());
            ps.setString(2, p.getUnidad());
            ps.setDouble(3, p.getPrecioVenta());
            ps.setInt(4, p.getStock());
            ps.setInt(5, p.getMinStock());
            ps.setInt(6, p.getIdCategoria());
            ps.setInt(7, p.getIdProducto()); // WHERE idProducto

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se actualizó correctamente

        } catch (Exception e) {
            System.out.println("Error en DAOproducto.modificarProducto: " + e.getMessage());
            return false;
        } finally {
            // Cierre seguro de conexiones al estilo de tu proyecto
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en modificarProducto: " + e.getMessage());
            }
        }
    }
    
    public boolean eliminarProducto(int id) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM tproducto WHERE idProducto = ?";

        try {
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);

            ps.setInt(1, id);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0; // Retorna true si se eliminó con éxito

        } catch (Exception e) {
            System.out.println("Error en DAOproducto.eliminarProducto: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en eliminarProducto: " + e.getMessage());
            }
        }
    }
}