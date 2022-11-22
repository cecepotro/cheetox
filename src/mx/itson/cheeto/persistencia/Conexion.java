/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cheeto.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Jesús Pérez
 */
public class Conexion {
    
    /**
     * Obtiene una conexión hacia la base de datos utilizando los parámetros proporcionados.
     * @return La conexión a la base de datos.
     */
    public static Connection obtener(){
        Connection conexion =null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/cheetodb?user=root&password=admin");
        } catch (Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return conexion;
    }
}
