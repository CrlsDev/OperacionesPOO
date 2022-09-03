/**
 *
 * @authors
 * Carlos Manuel Cardenas Toledo
 * Johan Sebastian García Triana
 * Carlos David Romero Restrepo
 */
package actividadformulas;

import static java.lang.Math.*;
import javax.swing.JOptionPane;

public class ActividadFormulas {
    static boolean cont=false;
    public static void main(String[] args) {
        // ª
    }
    static void menuPrincipal(){
    }
    static void menuFunciones(){
    }
    static void menuFormulas(){
    }
    static double IngresoNumero(){
        double n;
        do{
            try{
                n = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Digite un valor: ",
                        "INGRESO DE NUMERO",
                        3
                        )); 
                cont=true;
                return n;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, 
                        "Introduzca un numero",
                        "INGRESO DE NUMERO",
                        0
                );
            }catch (NullPointerException e){
                cont=false;
                return 0;
            }
        }while(true);
    }
    //FORMULAS
    static void Ejercicio3(){
    
    }
    static void Ejercicio13(){
    
    }
    static void Ejercicio18(){
    
    }
    static void Ejercicio23(){
    
    }
    static void Ejercicio38(){
    
    }
    // FUNCIONES
    static void ABS(){
    
    }
    static void ATAN(){
    
    }
    static void SIN(){
    
    }
    static void COS(){
    
    }
    static void TAN(){
    
    }
    static void POW(){
    
    }
    static void EXP(){
    
    }
    static void LOG(){
    
    }
    static void RANDOM(){
    
    }
    static void ROUND(){
    
    }
    static void FLOOR(){
    
    }
    static void CEIL(){
    
    }
    
}
