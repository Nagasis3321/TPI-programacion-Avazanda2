package Modelo;


import java.util.Date;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public abstract class Documento {
    private String fecha_creacion;
    private Integer id;
    private Area area_creador;
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Documento other = (Documento) obj;
        return Objects.equals(this.id, other.id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Area getAreacreador() {
        return area_creador;
    }

    public void setAreacreador(Area areacreador) {
        this.area_creador = area_creador;
    }

    public Documento(String fecha_creacion, Integer id, Area areacreador) {
        this.fecha_creacion = fecha_creacion;
        this.id = id;
        this.area_creador = area_creador;
    }


    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public Documento(String fecha_creacion, Integer id) {
        this.fecha_creacion = fecha_creacion;
        this.id = id;
    }
        
}
 