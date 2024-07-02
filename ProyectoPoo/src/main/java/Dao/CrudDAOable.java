/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.ArrayList;

/**
 *
 * @author ignac
 */
import java.util.ArrayList;   
/**
 *
 * @author ignac
     * @param <T>
 */
public interface CrudDAOable<T> {
    public void create(T t)throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.Exception;
    public boolean read(T t)throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.Exception;
    public ArrayList<T> read() throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.Exception;
    public ArrayList<T> readWhere(String whereSQL) throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.Exception;
    public void update(T t)throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.Exception;
    public void delete(T t)throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.Exception;
}

