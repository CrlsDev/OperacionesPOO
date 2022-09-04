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
        
        char op2 = JOptionPane.showInputDialog(null, """
                                                      
                                                      1.EJERCICIO 3 
                                                      2.EJERCICIO 13
                                                      3.EJERCICIO 18 
                                                      4.EJERCICIO 23 
                                                      5.EJERCICIO 38  
                                                     
                                                      OPCION:""",
                "MENU FORMULAS",1).charAt(0);

            switch (op2) {
                case '1' -> Ejercicio3();
                case '2' -> Ejercicio13();
                case '3' -> Ejercicio18();
                case '4' -> Ejercicio23();
                case '5' -> Ejercicio38();
                default -> JOptionPane.showMessageDialog(null,"DIGITE UNA OPCION DEL 1 AL 5", "ADVERTENCIA",1);

            }
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
        double r3=sqrt(3),r5=sqrt(5);
        double r = (r5+r3)/((r5-r3)*(r5+r3));
        JOptionPane.showMessageDialog(
                null,
                "((5)^(1/2)+(3)^(1/2))/"
                + "(((5)^(1/2)-(3)^(1/2))*((5)^(1/2)+(3)^(1/2))) = " + r,
                "EJERCICIO 18",
                1
        );
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
