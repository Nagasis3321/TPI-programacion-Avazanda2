/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases2;
import Modelo.TipoMovimiento;
import Modelo.Movimiento;
import Modelo.Nota;
import Modelo.Persona;
import Modelo.Documento;
import Modelo.Area;
import Modelo.Expediente;
import Modelo.Correspondencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Sistema {
    private  ArrayList<Movimiento> mov;
    private  ArrayList<Documento> doc; 
    private  ArrayList<Area> ar;
    private  ArrayList<Persona> per;
    public Sistema(ArrayList<Movimiento> mov, ArrayList<Documento> doc, ArrayList<Area> ar) {
        this.mov = mov;
        this.doc = doc;
        this.ar = ar;
    }

    public Sistema() {
    }

    public ArrayList<Movimiento> getMov() {
        return mov;
    }

    public void setMov(ArrayList<Movimiento> mov) {
        this.mov = mov;
    }

    public ArrayList<Documento> getDoc() {
        return doc;
    }

    public void setDoc(ArrayList<Documento> doc) {
        this.doc = doc;
    }

    public ArrayList<Area> getAr() {
        return ar;
    }

    public void setAr(ArrayList<Area> ar) {
        this.ar = ar;
    }
    public void VerAreas(){
        for(Area a: ar ){
              System.out.println(a.getId()+"  "+a.getDenominacion());
        }
    
            
     }
    public Area RetornarArea(Integer id){
        for(Area a: ar ){
            if(a.getId()==id){
              return a;
            }  
        }
        return null;
     }
    public void instanciarNota(Integer numero, String letra, String asunto, String fecha_creacion, Integer id,Area a){
        Nota N= new Nota(numero,letra,asunto,fecha_creacion,id,a);
        doc.add(N);
    }
    
    public void instanciarExpediente(Integer numero, String letra, Integer anio, String anexo, String fecha_creacion, Integer id, Area a){
        Expediente N= new Expediente(numero,letra,anio,anexo,fecha_creacion,id,a);
        doc.add(N);
    }
    public void instanciarCorrespondencia(String denominacion, Persona destinatario, String fecha_creacion, Integer id, Area a){
        Correspondencia N= new Correspondencia(denominacion,destinatario,fecha_creacion,id,a);
        doc.add(N);
    }
    public void instanciarArea(Integer id, String denominacion){
        Area A= new Area(id,denominacion);
        ar.add(A);
    }
    public void instanciarMovimiento(Date fecha, Integer id, TipoMovimiento Mov,Documento doc, Area a){
        Movimiento A= new Movimiento(fecha,id, Mov,doc,a);
        mov.add(A);
    }
    
    public Persona instanciarPersona(Integer dni, String apellido, String nombre){
        Persona P = new Persona(dni,apellido,nombre);
        per.add(P);
        return P;
    }
    
   public Area DocArea(Integer id){
       Documento d;
       Date F1 = null;
       Area a = null;
       TipoMovimiento tm;
       for(Movimiento m:mov){
           d=m.getDoc();
           if(Objects.equals(d.getId(), id)){
               tm=m.getMov();
               if("Ingreso".equals(tm.getDenominacion())){
                   if(a==null){
                       a=m.getAr();
                       F1=m.getFecha();
                   }else{
                       if(F1.before(m.getFecha())){
                           a=m.getAr();
                       }
                   }
               }
           }
       }
        return (a);
    }
       
   }