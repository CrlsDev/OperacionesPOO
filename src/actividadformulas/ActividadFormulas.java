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
    static void Despedida(){
        JOptionPane.showMessageDialog(null,"GRACIAS POR USAR EL PROGRAMA","SALIENDO",-1);
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

                    OPCION: """,
                    "MENU PRINCIPAL",
                    3
                ).charAt(0);
            }catch(NullPointerException e){
                op1='3';
            }catch(StringIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Digite algo en el campo","ADVERTENCIA",2);
                continue;
            }
            switch(op1){
                case '1' -> menuFormulas();
                case '2' -> menuFunciones();
                case '3' -> Despedida();
                default -> {
                    JOptionPane.showMessageDialog(null,"Elige una opcion valida"
                            ,"ADVERTENCIA",
                            2);
                }
            }            
            
        }while(op1!='3');
        
        

    }
    static void menuFormulas(){
        do{
            try{
                op2 = JOptionPane.showInputDialog(
                        null, 
                        """
                        1. Ejercicio 3 
                        2. Ejercicio 13
                        3. Ejercicio 18 
                        4. Ejercicio 23 
                        5. Ejercicio 38  
                        6. Regresar
                        7. Salir
                        
                        OPCION: """,
                        "MENU FORMULAS",1).charAt(0);
            }catch(NullPointerException e){
                op2='6';
            }catch(StringIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Digite algo en el campo","ADVERTENCIA",2);
                continue;
            }

            switch (op2) {
                case '1' -> Ejercicio3();
                case '2' -> Ejercicio13();
                case '3' -> Ejercicio18();
                case '4' -> Ejercicio23();
                case '5' -> Ejercicio38();
                case '6' -> {}
                case '7' -> {
                    Despedida();
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null,"DIGITE UNA OPCION DEL 1 AL 5", "ADVERTENCIA",2);

            }
        }while(op2!='6');
    }
    static void menuFunciones(){
    }
    static double IngresoNumero(String titulo){
        double n;
        do{
            try{
                n = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        "Digite un valor: ",
                        "INGRESO DE NUMERO: "+titulo,
                        3
                        )); 
                cont=true;
                return n;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, 
                        "Introduzca un numero",
                        "ADVERTENCIA",
                        2
                );
            }catch (NullPointerException e){
                cont=false;
                return 0;
            }
        }while(true);
    }
    //FORMULAS
    static void Ejercicio3(){
        double x=IngresoNumero("EJERCICIO 3");
        if (!cont) return;
        double r = sqrt(pow(x,5-1));
        
        JOptionPane.showMessageDialog(
                null,
                "("+x+"^(5-1))^(1/2) = "+r,
                "EJERCICIO 3",
                1
        );
                
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
        String titulo = "Ejercicio 23";
        double a = IngresoNumero(titulo);
        if (!cont) return;
        double b = IngresoNumero(titulo);
        if (!cont) return;
        double r = (pow(sqrt(a+b),2)+(sqrt(a+b)*sqrt(a-b)))/(pow(sqrt(a+b),2)-pow(sqrt(a-b),2));      
        JOptionPane.showMessageDialog(
                null,
                ""+r,
                "EJERCICIO 3",
                1
        );
          
    
    }
    static void Ejercicio38(){
    
    }
    // FUNCIONES
    static void ABS(){
        double n = IngresoNumero("ABS");
        if (!cont) return;
        double r = abs(n);
        JOptionPane.showMessageDialog(
                null,
                "El valor absoluto de "+n+" es: "+r,
                "FUNCION: ABS",
                1
        );
        
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
