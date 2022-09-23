package Modelo;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Correspondencia extends Documento  {
    private String denominacion;
    private Persona destinatario;

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public Correspondencia(String denominacion, Persona destinatario, String fecha_creacion, Integer id, Area areacreador) {
        super(fecha_creacion, id, areacreador);
        this.denominacion = denominacion;
        this.destinatario = destinatario;
    }

    public Correspondencia(String denominacion, Persona destinatario, String fecha_creacion, Integer id) {
        super(fecha_creacion, id);
        this.denominacion = denominacion;
        this.destinatario = destinatario;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }



    public Correspondencia(String denominacion , String fecha_creacion, Integer id) {
        super(fecha_creacion, id);
        this.denominacion = denominacion;
        
    }
    
    
    
 
    
}
