package lab1p1_gerardohasbum;
import java.util.Scanner;


public class Lab1P1_GerardoHasbum {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner jhin = new Scanner(System.in);
        int numero =0;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        
        System.out.println("Elija el ejercicio: ");
        numero = jhin.nextInt();
        
        
        if (numero == 1){
            int num1 =15;
            int num2 =30;
            int resultado;
            resultado = num1*num2;
            System.out.print("Resultado: ");
            System.out.println(resultado);
            
        }else if(numero == 2){
            System.out.print("Ingrese un numero: ");
            int numeroUsuario1 = jhin.nextInt();
            System.out.print("Ingrese un numero: ");
            int numeroUsuario2 = jhin.nextInt();
             System.out.print("Ingrese un numero: ");
            int numeroUsuario3 = jhin.nextInt();
            
            double promedio = (numeroUsuario1+numeroUsuario2+numeroUsuario3)/3;
            
            System.out.println("Promedio: "+ promedio);
        }else{
            System.out.println("Salio del programa.");
        }
    }
    
}
