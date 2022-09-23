/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isaac;
import Modelo.*;
import Clases2.Sistema;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
/* Dos areas, dos expedientes, dos notas ,dos correspondencia*/
public class claseN4 {
    public static void main(String[] args) {
    Sistema s2= new Sistema();
    s2.instanciarArea(1,"Programacion");/* Area1 */
    s2.instanciarArea(2,"Recursos Humanos");/* Area2 */
    Area a=s2.RetornarArea(1);
    Persona p= s2.instanciarPersona(43266572, "Terleski", "Isaac");
    s2.instanciarCorrespondencia("C1", p, "17/04/2022", 1, a);/*Correspondencia 1 */
    a=s2.RetornarArea(2); 
    p= s2.instanciarPersona(37255333,"Feraihbend","Cesar");
    s2.instanciarCorrespondencia("C2", p, "18/04/2022", 2, a);/*Correspondencia 2 */
    s2.instanciarNota(1, "L", "Llegada","17/04/2022", 3, a); /*Nota 1 */
    a=s2.RetornarArea(1);
    s2.instanciarNota(2, "L", "Llegada","18/04/2022", 4, a); /*Nota 2*/
    
    s2.instanciarExpediente(1, "A", 2022, "B", "17/04/2022", 5, a);/*Expediente 1*/
     a=s2.RetornarArea(2);
    s2.instanciarExpediente(2, "A", 2022, "B", "18/04/2022", 6, a);/*Expediente 2*/
    System.out.print("Ingrese una fecha:");
    Scanner ED;
    ED = new Scanner(System.in);
    String Fecha= ED.nextLine();
    
}   
    
     
 
    
    
}
