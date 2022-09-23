package Modelo;


import Modelo.TipoMovimiento;
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
public class Movimiento {
    private Date fecha;
    private Integer id;
    private TipoMovimiento Mov;
    private Documento doc;
    private Area ar;
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Movimiento(Date fecha, Integer id) {
        this.fecha = fecha;
        this.id = id;
    }

    public TipoMovimiento getMov() {
        return Mov;
    }

    public void setMov(TipoMovimiento Mov) {
        this.Mov = Mov;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Movimiento other = (Movimiento) obj;
        return Objects.equals(this.id, other.id);
    }

    public Movimiento(Date fecha, Integer id, TipoMovimiento Mov) {
        this.fecha = fecha;
        this.id = id;
        this.Mov = Mov;
    }

    public Movimiento(Date fecha, Integer id, TipoMovimiento Mov, Documento doc, Area ar) {
        this.fecha = fecha;
        this.id = id;
        this.Mov = Mov;
        this.doc = doc;
        this.ar = ar;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }

    public Area getAr() {
        return ar;
    }

    public void setAr(Area ar) {
        this.ar = ar;
    }
    
    
}
