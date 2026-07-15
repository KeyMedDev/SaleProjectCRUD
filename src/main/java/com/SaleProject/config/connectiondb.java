package com.SaleProject.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectiondb {
    // Parametros para la conexion del servidor MySQL
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdtiendapochita?useSSL=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConexion() {
        Connection cn = null; // Inicializamos el objeto conexion en nulo
        try {

            // Cargar el driver en memoria
            Class.forName(DRIVER);

            // Establecer enlace
            cn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {

            // Captura el error si la librería del controlador no esta importada en el archivo pom.xml
            System.out.println("Error: No se encontró el Driver de MySQL: " + e.getMessage());
        } catch (SQLException e) {

            // Captura fallas de red, credenciales incorrectas, servidor apagado o errores en la cadena URL
            System.out.println("Error de conexión a la Base de Datos: " + e.getMessage());
        }
        return cn;
    }
}