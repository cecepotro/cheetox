/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.cheeto.entidades;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.itson.cheeto.persistencia.Conexion;

/**
 *
 * @author jesus
 */
public class Computadora {

    private int id;
    private String marca;
    private String modelo;
    private String color;
    private String ram;
    private String procesador;
    private String almacenamiento;
    private String os;

    public List<Computadora> obtener() {
        List<Computadora> computadoras = new ArrayList<>();
        try {
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT id, marca, modelo,color, ram, procesador, almacenamiento, os FROM computadora");

            while (resultSet.next()) {
                Computadora c = new Computadora();
                c.setId(resultSet.getInt(1));
                c.setMarca(resultSet.getString(2));
                c.setModelo(resultSet.getString(3));
                c.setColor(resultSet.getString(4));
                c.setRam(resultSet.getString(5));
                c.setProcesador(resultSet.getString(6));
                c.setAlmacenamiento(resultSet.getString(7));
                c.setOs(resultSet.getString(8));

                computadoras.add(c);
            }
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return computadoras;
    }

    public boolean guardar(String marca, String modelo, String color, String ram, String procesador, String almacenamiento, String os) {
        boolean resultado = false;
        try {

        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the almacenamiento
     */
    public String getAlmacenamiento() {
        return almacenamiento;
    }

    /**
     * @param almacenamiento the almacenamiento to set
     */
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

}
