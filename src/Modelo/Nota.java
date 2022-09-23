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
public class Nota extends Documento {
    private Integer numero;
    private String letra;
    private String asunto;

    public Nota(Integer numero, String letra, String asunto, String fecha_creacion, Integer id, Area areacreador) {
        super(fecha_creacion, id, areacreador);
        this.numero = numero;
        this.letra = letra;
        this.asunto = asunto;
    }

    public Nota(Integer numero, String letra, String asunto, String fecha_creacion, Integer id) {
        super(fecha_creacion, id);
        this.numero = numero;
        this.letra = letra;
        this.asunto = asunto;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
    
}
