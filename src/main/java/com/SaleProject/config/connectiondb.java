package com.SaleProject.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectiondb {
    // Parámetros para la conexion del servidor MySQL
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //private static final String URL = "jdbc:mysql://40.114.38.182:3306/bdtiendapochita?useSSL=true&serverTimezone=UTC";
    private static final String URL = "jdbc:mysql://127.0.0.1:8889/bdtiendapochita?useSSL=true&serverTimezone=UTC";
    private static final String USER = "root";
    //    private static final String PASSWORD = "enkoreactivate";
    private static final String PASSWORD = "root";

    public static Connection getConexion() {
        Connection cn = null;
        try {
            // Cargar el driver en memoria
            Class.forName(DRIVER);
            // Establecer enlace
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el Driver de MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión a la Base de Datos: " + e.getMessage());
        }
        return cn;
    }
}