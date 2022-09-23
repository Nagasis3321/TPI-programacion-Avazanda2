/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isaac;
 import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Isaac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ALEJo , ISAAC;
       
                
         
                Scanner ED;
                ED = new Scanner(System.in);
               /*Primer Ejercicio
                System.out.print("Ingrese el Primer Numero:");
                 int Num1 = ED.nextInt();
                 
                 System.out.print("Ingrese el Segundo Numero:");
                 int Num2 = ED.nextInt();
                 int Sum;
                 Sum = Num2 + Num1;
                 System.out.print("Los numeros ingresados son:"+Num1+"  "+Num2 +"   "+ "La suma es:"+Sum);
              */
    
              /*Segundo Ejercicio
              int Valor;
              double ValorCuadrado;
              Valor = ED.nextInt();
              ValorCuadrado= Math.pow(Valor,2);
              System.out.print(ValorCuadrado);
              */
              
              
              
              
              /*Tercer Ejercicio
              int opcion , valor;
              double resultado;
              System.out.print("Ingrese el valor en Metros que desea convertir:");
              valor= ED.nextInt();
              System.out.println("1) Convertir en PIES");
              System.out.println("2) Convertir en PULGADAS");
              opcion= ED.nextInt();
              switch(opcion)
              {
                  case 1:
                      resultado = valor* 39.37;
                      resultado = resultado / 12;
                      System.out.println("El valor ingresado es:"+valor);
                      System.out.println("En PIES es igual a:"+resultado);
                      
                    break;
                  case 2:
                      resultado = valor* 12;
                      System.out.println("El valor ingresado es:"+valor);
                      System.out.println("En PULGADAS es igual a:"+resultado);
                      break;
                      
                  default:
                      System.out.print("Numero ingreso incorrecto");
                      
                   }
                   */
              
              
              
              /* Cuarto Ejercicio
              
              double valor1, valor2, resultado;
              System.out.print("Ingrese el valor del primer cateto:");
              valor1= ED.nextInt();
              System.out.print("Ingrese el valor del primer cateto:");
              valor2= ED.nextInt();
              valor1= Math.pow(valor1,2);
              valor2= Math.pow(valor2,2);
              resultado = valor1+ valor2;
              resultado = Math.sqrt(resultado);
              System.out.println("Resultado:" +resultado);
              */
              
              /*Quinto Ejercicio
              double valor, factorial;
              System.out.print("Ingrese el valor:");
              valor= ED.nextInt();
              factorial=1;
              for (double i=valor ;i>0;i--) {
              
                factorial=factorial*i;
              }
              System.out.println("El factorial de " +valor + " es: " + factorial);
            */
    
             /*Sexto Ejercicio
             int [] Vector ;
             Vector = new int[30];
             System.out.print("INGRESE 30 MUMEROS");
             for (int i=0 ;i<30;i++) {
                Vector[i]= ED.nextInt();             
                if(i==30){
                    System.out.print("I=30");
                 }
             }
             for (int i=0 ;i<30;i++) {
                if(Vector[i]==0){
                    System.out.print(Vector[i+1]);
                }
                   
             }
           */
             
             //Septimo Ejercicio
             
             
             
             
             
             
             /* Octavo Ejercicio
             
             int []Vector;
             Vector = new int [5];
             System.out.print("Ingrese 5 numeros:");
             for (int i=0 ;i<5;i++) {
                Vector[i]= ED.nextInt();             
             }
             int Mayor=0, posMayor=0, posMenor , Menor;
             for (int i=0 ;i<5;i++) {
                if(Vector[i]>= Mayor){
                    Mayor=Vector[i];
                    posMayor=i;
                } 
                 if(Vector[i]< 0){
                    System.out.println("Valor:" +Vector[i]+"  " + "Posicion:"+i);
                    
                } 
             }
             System.out.println("Mayor:"+Mayor+"   "+"Posicion:"+posMayor);
             */
             
             /*Noveno Ejercicio
             int [][]Vector;
             Vector = new int [10][10];
             for(int i=0;i<10;i++){
                 for(int j=0;j<10;j++){
                     Vector[i][j]=0;
                 }
             }
             Vector[0][0]=1;
             Vector[1][1]=1;
             Vector[2][2]=1;
             Vector[3][3]=1;
             Vector[4][4]=1;
             Vector[5][5]=1;
             Vector[6][6]=1;
             Vector[7][7]=1;
             Vector[8][8]=1;
             Vector[9][9]=1;
             for(int i=0;i<10;i++){
                 for(int j=0;j<10;j++){
                     System.out.print(Vector[i][j]);
                 }
                 System.out.println(" ");
             }
             */
             
             //Decimo Ejercicio
             int [][]Vector;int []Sum;
             Vector = new int [2][4];
             Sum = new int [2];
             System.out.print("Ingresar Numeros:");
             for(int i=0;i<2;i++){
                 for(int j=0;j<4;j++){
                      Vector[i][j] = ED.nextInt(); 
                 }
             }
                 for(int i=0;i<2;i++){
                    for(int j=0;j<4;j++){
                      Sum[i] = Sum[i]+ Vector[i][j]; 
                 }
             }
               System.out.print("Sumas por fila"+ Sum[0] + "  "+ Sum[1]);  
             
             
            
             
   }
    
    
    }
    

