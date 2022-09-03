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
    static char op1,op2;
    public static void main(String[] args) {
        menuPrincipal();
    }
    static void menuPrincipal(){
        do{
            try{
                
                op1=JOptionPane.showInputDialog(
                    null,
                    """
                    1. Formulas
                    2. Funciones
                    3. Salir
                    """,
                    "MENU PRINCIPAL",
                    3
                ).charAt(0);
            }catch(NullPointerException e){
                op1='3';
            }catch(StringIndexOutOfBoundsException e){
                continue;
            }
            switch(op1){
                case '1' -> menuFormulas();
                case '2' -> menuFunciones();
                default -> {
                    JOptionPane.showMessageDialog(null,"Elige una opcion valida"
                            ,"OPCION INVALIDA",
                            0);
                }
            }            
            
        }while(op1!='3');
        
        
    }
    static void menuFormulas(){
    }
    static void menuFunciones(){
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
