/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5grupo12.modelo.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author andre
 */
public class Conexion {
    Connection conectar = null;

    public Connection conectar(){
        
        try {
            Class.forName("org.sqlite.JDBC");
        conectar=DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion.db");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }    
        
        return conectar;
        }
}
    
    
    

