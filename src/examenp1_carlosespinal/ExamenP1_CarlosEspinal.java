
package examenp1_carlosespinal;
import java.util.Scanner;
import java.util.Random;
public class ExamenP1_CarlosEspinal {
    static Scanner read = new Scanner(System.in);
    static Random ran = new Random();
    
    public static String primos(int numero) {
        
 
        String divisores = "";
        
        for (Integer i = 1; i <=numero;i++) {
            if (numero % i == 0) {
                divisores += i.toString();
                divisores += ", ";
            }
        }
        return divisores;
    }
    
    public static void vecinos (String cadena) {
        
            
        
        int randnum = ran.nextInt(2);
        String cadlower = cadena.toLowerCase();
        
        switch (randnum) {
            case 0:
            String nueva = "";
                for (int i = 0; i < cadlower.length(); i++){
                    for (int j = 97; j < 122; j++) {
                       char numero = cadlower.charAt(i);
                       int asciinum = (int) numero;
                       if (j == asciinum) {
                           int asciinumnuevo = asciinum-1 ; 
                           char numnuevo = (char) asciinumnuevo;
                           nueva += numnuevo; 
                       }
                    }// fin for ASCII
                }//fin for
                System.out.println("Valor aleatorio = "+randnum);
                System.out.print(nueva);
               
                break;
            case 1:
            String nueva1 = "";
                for (int i = 0; i < cadlower.length(); i++){
                    for (int j = 97; j < 122; j++) {
                       char numero = cadlower.charAt(i);
                       int asciinum = (int) numero;
                       if (j == asciinum) {
                           int asciinumnuevo = asciinum+1 ; 
                           char numnuevo = (char) asciinumnuevo;
                           nueva1 += numnuevo; 
                       }
                    }// fin for ASCII
                }//fin for
                System.out.println("Valor aleatorio = "+randnum);
                System.out.println(nueva1);
                break;
        }

        
    }
    
    public static void contorno(int size) {
        if (size % 2 != 0){
            
        
            int jinicial = ((size + 1)/2)-1;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    //condiciones para el contorno

                        if ((j == jinicial && i == 0) || (i + j == jinicial && j != 0) || (j - i == jinicial && j != size -1)|| (i == jinicial -1 && j != 0 && j != size-1)) {
                            System.out.print("+");
                        }
                        else if ((j-i == jinicial-1 && jinicial - 2 == i) || (j+i == jinicial + 1 && jinicial -2==i)|| (j == jinicial && jinicial-2==i) || (i + j == jinicial + 1 && i==1) ) {
                            System.out.print(" ");
                        }
                        else if (i <= jinicial) {    
                            System.out.print("*");
                        }


            }//fin for de j
            System.out.println();
            
        }//fin for de i
        }
        if (size %2 == 0) {
            System.out.println("Escriba un numero impar");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("  MENU  ");
            System.out.println();
            System.out.println("Opcion 1: Divisiores Primos");
            System.out.println("Opcion 2: Contorno de piramide");
            System.out.println("Opcion 3: Letras Vecinas");
            System.out.println();
            System.out.print("Ingrese la opcion con la que dese trabajar: ");
            opcion = read.nextInt();
        
            switch (opcion) {
                case 1:
                    System.out.println("Se ha seleccionado la primera opcion");
                    System.out.println();
                    System.out.println("Inserte el numero que desea evaluar");
                    int n = read.nextInt();
                    
                    if (n > 0) {
                        primos (n);
                        String respuesta = primos(n);
                        System.out.println(respuesta+"son los divisores de "+n);
                    }
                    else {
                        System.out.println("Escriba un numero arriba de 0");
                    }
                    break;
                case 2:
                    System.out.println("Se ha seleccionado la segunda opcion.");
                    System.out.println();
                    System.out.println("Ingrese el tamaño de la figura (Numero impar): ");
                    int limite = read.nextInt();
                    
                    contorno(limite);
                    
                    break;
                case 3:
                    System.out.println("Se ha seleccionado la tercera opcion");
                    System.out.println();
                    System.out.println("Inserte una cadena de letras: ");
                    String cadletras = read.next();
                    
                    vecinos(cadletras);
                    
                break;
            }            
        } while(opcion != 4);

        
        
        
        
    }
    
}
