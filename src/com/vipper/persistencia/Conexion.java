package com.vipper.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	protected Connection miConexion;

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        //Cargar el driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        String stringConexion = "jdbc:mysql://localhost:3306/avogados?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
        miConexion = DriverManager.getConnection(stringConexion, "root", "Curso2019$");
        System.out.println("Exito al abrir la conexion");
    }

    public void cerrarConexion() throws SQLException {
        miConexion.close();
    }
}
