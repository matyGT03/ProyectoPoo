/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author ignac
 */
public class ModeloOb {
    private int id;
    private int tipo_objetivo_id;
    private int tema_id;
    private int departamento_id_responsable;
    private String nombre;
    private String Alias;
    private String descripcion;
    private int orden;
    private String codigo;
    private Date fecha_registro;
    private String departamento;
    private String tema;
    private String tipo_objetivo;

    public ModeloOb() {
    }

    public ModeloOb(int id, int tipo_objetivo_id, int tema_id, int departamento_id_responsable, String nombre, String Alias, String descripcion, int orden, String codigo, Date fecha_registro, String departamento, String tema, String tipo_objetivo) {
        this.id = id;
        this.tipo_objetivo_id = tipo_objetivo_id;
        this.tema_id = tema_id;
        this.departamento_id_responsable = departamento_id_responsable;
        this.nombre = nombre;
        this.Alias = Alias;
        this.descripcion = descripcion;
        this.orden = orden;
        this.codigo = codigo;
        this.fecha_registro = fecha_registro;
        this.departamento = departamento;
        this.tema = tema;
        this.tipo_objetivo = tipo_objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo_objetivo_id() {
        return tipo_objetivo_id;
    }

    public void setTipo_objetivo_id(int tipo_objetivo_id) {
        this.tipo_objetivo_id = tipo_objetivo_id;
    }

    public int getTema_id() {
        return tema_id;
    }

    public void setTema_id(int tema_id) {
        this.tema_id = tema_id;
    }

    public int getDepartamento_id_responsable() {
        return departamento_id_responsable;
    }

    public void setDepartamento_id_responsable(int departamento_id_responsable) {
        this.departamento_id_responsable = departamento_id_responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTipo_objetivo() {
        return tipo_objetivo;
    }

    public void setTipo_objetivo(String tipo_objetivo) {
        this.tipo_objetivo = tipo_objetivo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + this.tipo_objetivo_id;
        hash = 17 * hash + this.tema_id;
        hash = 17 * hash + this.departamento_id_responsable;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.Alias);
        hash = 17 * hash + Objects.hashCode(this.descripcion);
        hash = 17 * hash + this.orden;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        hash = 17 * hash + Objects.hashCode(this.fecha_registro);
        hash = 17 * hash + Objects.hashCode(this.departamento);
        hash = 17 * hash + Objects.hashCode(this.tema);
        hash = 17 * hash + Objects.hashCode(this.tipo_objetivo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModeloOb other = (ModeloOb) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.tipo_objetivo_id != other.tipo_objetivo_id) {
            return false;
        }
        if (this.tema_id != other.tema_id) {
            return false;
        }
        if (this.departamento_id_responsable != other.departamento_id_responsable) {
            return false;
        }
        if (this.orden != other.orden) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Alias, other.Alias)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.departamento, other.departamento)) {
            return false;
        }
        if (!Objects.equals(this.tema, other.tema)) {
            return false;
        }
        if (!Objects.equals(this.tipo_objetivo, other.tipo_objetivo)) {
            return false;
        }
        return Objects.equals(this.fecha_registro, other.fecha_registro);
    }

    @Override
    public String toString() {
        return "ModeloOb{" + "id=" + id + ", tipo_objetivo_id=" + tipo_objetivo_id + ", tema_id=" + tema_id + ", departamento_id_responsable=" + departamento_id_responsable + ", nombre=" + nombre + ", Alias=" + Alias + ", descripcion=" + descripcion + ", orden=" + orden + ", codigo=" + codigo + ", fecha_registro=" + fecha_registro + ", departamento=" + departamento + ", tema=" + tema + ", tipo_objetivo=" + tipo_objetivo + '}';
    }

    

   
}
