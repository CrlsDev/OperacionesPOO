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
                    JOptionPane.showMessageDialog(null,"DIGITE UNA OPCION DEL 1 AL 3", "ADVERTENCIA",2);
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
                default -> JOptionPane.showMessageDialog(null,"DIGITE UNA OPCION DEL 1 AL 7", "ADVERTENCIA",2);

            }
        }while(op2!='6');
    }
    static void menuFunciones(){
        int op3=0;
        do{
            try{
                String i = JOptionPane.showInputDialog(
                        null, 
                        """
                        1. ABS
                        2. ATAN
                        3. SIN
                        4. COS
                        5. TAN
                        6. POW
                        7. EXP
                        8. LOG
                        9. RANDOM
                        10. ROUND
                        11. FLOOR
                        12. CEIL
                        13. Regresar
                        14. Salir
                        
                        OPCION: """,
                        "MENU FUNCIONES",1);
                if (i==null) throw new NullPointerException();
                
                op3 = Integer.parseInt(i);
            }catch(NullPointerException e){
                op3=13;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Digite un numero valido del 1 al 14",
                        "ADVERTENCIA",
                        2
                );
                continue;
            
            }

            switch (op3) {
                case 1 -> ABS();
                case 2 -> ATAN();
                case 3 -> SIN();
                case 4 -> COS();
                case 5 -> TAN();
                case 6 -> POW();
                case 7 -> EXP();
                case 8 -> LOG();
                case 9 -> RANDOM();
                case 10 -> ROUND();
                case 11 -> FLOOR();
                case 12 -> CEIL();
                case 13 -> {}
                case 14 -> {
                    Despedida();
                    System.exit(0);
                }
                default -> JOptionPane.showMessageDialog(null,"DIGITE UNA OPCION DEL 1 AL 14", "ADVERTENCIA",2);

            }
        }while(op3!=13);
    }
    static double IngresoNumero(String titulo){
        return IngresoNumero(titulo,"");
    }
    static double IngresoNumero(String titulo,String v){
        double n;
        String info="Digite un valor: ";
        if (!"".equals(v)){
            info="Digite el valor \""+v+"\"";
        }
        do{
            
            try{
                n = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        info,
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
        String titulo = "Ejercicio 13";
        JOptionPane.showMessageDialog(
                null,
                "((8*a^3*b)^(1/3))/((4*a^2)^(1/4))",
                titulo,
                1
        );
        double a;
        do{
            a = IngresoNumero(titulo,"a");
            if (!cont) return;
        }while(a<=0);
        
        double b;
        do{ 
            b= IngresoNumero(titulo,"b");
            if (!cont) return;            
        }while(b <=0);
        double y=pow(a,3); double t=pow(a,2);
        double s = (pow(8*y*b,1/3))/pow(4*t,1/4);      
        JOptionPane.showMessageDialog(
                null,
                "((8*"+y+"*"+b+")^(1/3))/((4*"+t+")^(1/4))"+s,
                titulo,
                1
        );
    
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
        JOptionPane.showMessageDialog(
                null,
                "(((a+b)^(1/2))^2+(a+b)^(1/2)*(a-b)^(1/2))",
                titulo,
                1
        );
        double a;
        do{
            a = IngresoNumero(titulo,"a");
            if (!cont) return;
        }while(a<=0);
        
        double b;
        do{ 
            b= IngresoNumero(titulo,"b");
            if (!cont) return;            
        }while((a+b)<0 || (a-b)<0 || (a+b)==(a-b));
        
        double r = (pow(sqrt(a+b),2)+(sqrt(a+b)*sqrt(a-b)))/(pow(sqrt(a+b),2)-pow(sqrt(a-b),2));      
        JOptionPane.showMessageDialog(
                null,
                "((("+a+"+"+b+")^(1/2))^2+("+a+"+"+b+")^(1/2)*("+a+"-"+b+")^(1/2))/"
              + "(("+a+"+"+b+")^(1/2))^2-("+a+"-"+b+")^(1/2))^2)"+r,
                titulo,
                1
        );
          
    
    }
    static void Ejercicio38(){
        String titulo = "EJERCICIO 38";
        JOptionPane.showMessageDialog(
                null,
                "(a*(c)^((n-m)/n))/"
                +"(b*(c)^(m/n)*(c)^((n*m)/n)",
                titulo,
                1
        );
        double a = IngresoNumero(titulo,"a");
        if (!cont) return;
        double b;
        do{ 
            b = IngresoNumero(titulo,"c");
            if (!cont) return;
        }while(b==0);
        
        
        double c;
        do{ 
            c = IngresoNumero(titulo,"c");
            if (!cont) return;
        }while(c==0);
        
        
        double n = IngresoNumero(titulo,"n");
        if (!cont) return;
        double m = IngresoNumero(titulo,"m");
        if (!cont) return;
        
        double r = (a*pow(c,(n-m)/n))/(b*pow(c,m/n)*pow(c,(n*m)/n));
        
        JOptionPane.showMessageDialog(
                null,
                "("+a+"*("+c+")^(("+n+"-"+m+")/"+n+"))/"
                +"("+b+"*("+c+")^("+m+"/"+n+")*("+c+")^("+"("+n+"*"+m+")/"+n+")"
                +" = "+r,
                titulo,
                1
        );
        
         
    }
    // FUNCIONES
    static void ABS(){
        String titulo = "ABS";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = abs(n);
        JOptionPane.showMessageDialog(
                null,
                "El valor absoluto de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
        
        
    }
    static void ATAN(){
        String titulo = "ATAN";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = atan(n);
        JOptionPane.showMessageDialog(
                null,
                "La arcotangente de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void SIN(){
        String titulo = "SIN";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = sin(n);
        JOptionPane.showMessageDialog(
                null,
                "El seno de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void COS(){
        String titulo = "COS";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = cos(n);
        JOptionPane.showMessageDialog(
                null,
                "El coseno de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void TAN(){
        String titulo = "TAN";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = tan(n);
        JOptionPane.showMessageDialog(
                null,
                "La tangente de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void POW(){
        
    }   
    static void EXP(){
        String titulo = "EXP";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = exp(n);
        JOptionPane.showMessageDialog(
                null,
                "La exponencial de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void LOG(){
        
        String titulo = "LOG";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = log(n);
        JOptionPane.showMessageDialog(
                null,
                "El logaritmo (10) de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void RANDOM(){
    
    }
    static void ROUND(){
        String titulo = "ROUND";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = round(n);
        JOptionPane.showMessageDialog(
                null,
                "El redondeo de "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void FLOOR(){
        String titulo = "FLOOR";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = floor(n);
        JOptionPane.showMessageDialog(
                null,
                "El entero menor mas cercano a "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    static void CEIL(){
        String titulo = "CEIL";
        double n = IngresoNumero(titulo);
        if (!cont) return;
        double r = floor(n);
        JOptionPane.showMessageDialog(
                null,
                "El entero mayor mas cercano a "+n+" es: "+r,
                "FUNCION: "+titulo,
                1
        );
    }
    
}
