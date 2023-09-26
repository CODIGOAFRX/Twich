/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twich;

/**
 *
 * @author AlumnoT
 */
public class Twich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Añadimos un texto introductorio a modo de presentación de nuestro canal
       
        System.out.println("Hola, bienvenido al canal de cocina con tu yaya, el mejor canal de cocina en streaming");
        
        // definimos variables (con int ya que serán numeros sin decimales ya que no puedes partir un sub)
        int subs = 1200;
        int ganancias ;
        ganancias = subs * 3 ; //definimos la operacion de ganancias
                
        if (ganancias >= 0 && ganancias <= 1200 ){  //primer if de condición + imprimir mensaje en pantalla
            System.out.println("bro u broke tus ganancias son " + ganancias + "$ mensuales" ) ;
        }
        
        else if (ganancias >= 1201 && ganancias <= 2000 ) {  //primer else if de condición + imprimir mensaje en pantalla
        System.out.println("bro u into clase media española, tus ganancias son " + ganancias + "$ mensuales" ) ;
        } 
        else if (ganancias >= 2001 && ganancias <= 5000 ) {   //segundo else if de condición + imprimir mensaje en pantalla
        System.out.println("Ya eres cryptobro, tus ganancias son  " + ganancias + "$ mensuales" ) ;
        } 
        else if (ganancias > 5000 ) {   //tercer else if de condición + imprimir mensaje en pantalla
        System.out.println("Andorra te espera, tus ganancias son " + ganancias + "$ mensuales" ) ;
        } 
        else {  //ultimo else de condición para declarar un error a la hora de introducir datos
            System.out.println("error al introducir datos");
        }
    }
    
}
