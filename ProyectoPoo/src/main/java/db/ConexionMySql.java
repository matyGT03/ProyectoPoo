/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matia
 */
public final class ConexionMySql extends ConexionGenerica {
    
    // -------------DATOS INGRESADOS EN BASE DE DATOS, ESTAN AL FINAL DE: db.BaseDeDatos.sql     AL FINAL DE ESTA TAMBIEN SE ENCUENTRA USUARIO-----------------------
    
    public ConexionMySql() throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.sql.SQLException, java.lang.Exception
    {
          //Invoca al constructor CON parametros, con los siguientes valores por defecto       
          //(String jdbc    , String driverClass     , String host, String port, String database, String opciones  , String username, String password)
        this("jdbc:mysql://", "com.mysql.jdbc.Driver", "localhost", "3306"     , "estrategia"        , "?charSet=LATIN1", "root"         , "12345678");
        
    } 
    

    public ConexionMySql(String jdbc, String driverClass, String host, String port, String database, String opciones, String username, String password) throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.sql.SQLException, java.lang.Exception
    {
        super(jdbc, driverClass, host, port, database, opciones, username, password);
        super.conexion = DriverManager.getConnection(super.url, username, password);
        super.databaseMetadata = conexion.getMetaData();
    }

    @Override
    public void testearSQL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   }
