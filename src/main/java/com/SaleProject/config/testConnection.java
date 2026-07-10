package com.SaleProject.config;
import java.sql.Connection;

public class testConnection {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");
        System.out.println("=== Probando Conexión a la Base de Datos ===");
        System.out.println("-----------------------------------------------------");
        Connection cn = connectiondb.getConexion();

        if (cn != null) {
            System.out.println("RESULTADO: ¡CONEXIÓN EXITOSA!");
            System.out.println("El sistema se conectó a la bdtiendapochita.");
            System.out.println("-----------------------------------------------------");
            try {
                cn.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión de prueba: " + e.getMessage());
            }
        } else {
            System.out.println("RESULTADO: CONEXIÓN SIN ÉXITO");
            System.out.println("No se pudo conectar con la base de datos remota.");
            System.out.println("-----------------------------------------------------");
        }
    }
}