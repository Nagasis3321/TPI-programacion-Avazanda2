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
public class Expediente extends Documento {
    private Integer numero;
    private String letra;
    private Integer anio;
    private String anexo;

    public Expediente(Integer numero, String letra, Integer anio, String anexo, String fecha_creacion, Integer id, Area areacreador) {
        super(fecha_creacion, id, areacreador);
        this.numero = numero;
        this.letra = letra;
        this.anio = anio;
        this.anexo = anexo;
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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    
    
}
