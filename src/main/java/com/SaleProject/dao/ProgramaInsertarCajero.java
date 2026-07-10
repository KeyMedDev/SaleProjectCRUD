package com.SaleProject.dao;

import com.SaleProject.model.MCajero;
import java.util.Scanner;

public class ProgramaInsertarCajero {

    // Se corrigieron los modificadores obligatorios 'public' y los argumentos del main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MCajero cajero = new MCajero();

        System.out.println("=====================================================");
        System.out.println("===       SISTEMA: REGISTRO DE NUEVO CAJERO       ===");
        System.out.println("=====================================================");

        System.out.print("ID Cajero (Número): ");
        cajero.setIdCajero(Integer.parseInt(sc.nextLine()));

        System.out.print("Nombre: ");
        cajero.setNomCajero(sc.nextLine());

        System.out.print("Apellido Paterno: ");
        cajero.setApPat(sc.nextLine());

        System.out.print("Apellido Materno: ");
        cajero.setApMat(sc.nextLine());

        System.out.print("Usuario de acceso: ");
        cajero.setUsuario(sc.nextLine());

        System.out.print("Clave de seguridad: ");
        cajero.setClave(sc.nextLine());

        System.out.print("ID Local asignado (Número): ");
        cajero.setIdLocal(Integer.parseInt(sc.nextLine()));

        System.out.println("-----------------------------------------------------");
        System.out.println("Enviando datos al servidor MySQL en Azure...");

        // Llamada al nuevo DAO e inserción en la BD remota
        DAOcajero oCajero = new DAOcajero();
        boolean ok = oCajero.insertarCajero(cajero);

        System.out.println("-----------------------------------------------------");
        if (ok) {
            System.out.println("RESULTADO: ¡Cajero registrado correctamente en la BD!");
        } else {
            System.out.println("RESULTADO: Error al registrar el cajero en el servidor.");
        }
        System.out.println("-----------------------------------------------------");

        sc.close();
    }
}