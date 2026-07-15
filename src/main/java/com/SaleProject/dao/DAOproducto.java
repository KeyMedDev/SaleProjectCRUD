package com.SaleProject.dao;

import com.SaleProject.config.connectiondb;
import com.SaleProject.model.MProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOproducto {
    // Recupera la lista completa de productos desde la base de datos
    public ArrayList<MProducto> listarProductos() {
        ArrayList<MProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM tproducto";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try { // Bloque de control de excepciones. abre conexion, prepara y ejecuta la consulta SQL
            cn = connectiondb.getConexion();        // Obtiene conexión activa
            ps = cn.prepareStatement(sql);          // Prepara la consulta SQL
            rs = ps.executeQuery();                 // Ejecuta lectura en la BD
            // Mapea cada registro obtenido a un objeto MProducto
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
            // Libera de forma segura los recursos de conexión
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

    // Busca productos con coincidencia parcial por descripción
    public ArrayList<MProducto> buscarProductos(String texto) {
        ArrayList<MProducto> lista = new ArrayList<>();
        String sql = "SELECT * FROM tproducto WHERE descProd LIKE ?";
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try { // Prepara consulta aplicando el filtro LIKE
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            //Inyecta el comodin '%' antes y después del texto para buscar cualquier coincidencia parcial
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            // Mapea los resultados encontrados a la lista
            while (rs.next()) {
                MProducto p = new MProducto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setDescProducto(rs.getString("descProd"));
                p.setUnidad(rs.getString("unidad"));
                p.setPrecioVenta(rs.getDouble("precVenta"));
                p.setStock(rs.getInt("stock"));
                p.setMinStock(rs.getInt("stockMin"));
                p.setIdCategoria(rs.getInt("idCategoria"));
                lista.add(p); // Agrega el producto configurado a la lista temporal
            }
        } catch (Exception e) {
            System.out.println("Error al buscar productos: " + e.getMessage());
        } finally {
            // Libera de forma segura los recursos de conexión
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

    // Inserta un nuevo producto en la tabla tproducto
    public boolean insertarProducto(MProducto p) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO tproducto (idProducto, descProd, unidad, precVenta, stock, stockMin, idCategoria) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {   // Abre la conexion con la BD y prepara la consulta estructurada
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            // Vincula los atributos del objeto MProducto a los parámetros SQL
            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getDescProducto());
            ps.setString(3, p.getUnidad());
            ps.setDouble(4, p.getPrecioVenta());
            ps.setInt(5, p.getStock());
            ps.setInt(6, p.getMinStock());
            ps.setInt(7, p.getIdCategoria());
            // Ejecuta la insercion y retorna verdadero si se afectaron filas con exito
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            // Captura e informa fallos durante el proceso de insercion
            System.out.println("Error en DAOproducto.insertarProducto: " + e.getMessage());
            return false;
        } finally {
            // Libera de forma segura los recursos de conexión
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en insertarProducto: " + e.getMessage());
            }
        }
    }

    // Actualiza los datos de un producto identificado por su ID
    public boolean modificarProducto(MProducto p) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE tproducto SET descProd = ?, unidad = ?, precVenta = ?, stock = ?, stockMin = ?, idCategoria = ? WHERE idProducto = ?";

        try {   // Abre la conexion activa con la base de datos
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            // Vincula los nuevos valores al prepared statement
            ps.setString(1, p.getDescProducto());
            ps.setString(2, p.getUnidad());
            ps.setDouble(3, p.getPrecioVenta());
            ps.setInt(4, p.getStock());
            ps.setInt(5, p.getMinStock());
            ps.setInt(6, p.getIdCategoria());
            ps.setInt(7, p.getIdProducto()); // ID para la cláusula WHERE

            // Ejecuta la actualizacion y retorna true si se modifico el registro
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            // Captura e informa fallos durante el proceso de actualizacion
            System.out.println("Error en DAOproducto.modificarProducto: " + e.getMessage());
            return false;
        } finally {
            // Libera de forma segura los recursos de conexión
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en modificarProducto: " + e.getMessage());
            }
        }
    }

    // Elimina físicamente un producto utilizando su ID
    public boolean eliminarProducto(int id) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM tproducto WHERE idProducto = ?";

        try {   // Establece la conexion activa con el motor de base de datos
            cn = connectiondb.getConexion();
            ps = cn.prepareStatement(sql);
            // Asigna el ID recibido como parámetro restrictivo
            ps.setInt(1, id);
            // Ejecuta la eliminacion fisica y retorna true si se borro el registro
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (Exception e) {
            // Captura e informa posibles fallos de integridad o de conexion
            System.out.println("Error en DAOproducto.eliminarProducto: " + e.getMessage());
            return false;
        } finally {
            // Libera de forma segura los recursos de conexión
            try {
                if (ps != null) ps.close();
                if (cn != null) cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar recursos en eliminarProducto: " + e.getMessage());
            }
        }
    }
}