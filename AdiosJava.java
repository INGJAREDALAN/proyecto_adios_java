import java.util.Scanner; 

public class AdiosJava{

public static Scanner scanner = new Scanner(System.in);

public static int Resultadoresta(){
            
    int numero_resta1, numero_resta2, resta;

    System.out.println("\noperacion aritmetica -Resta-");

    System.out.println("Escriba el primer numero de la resta: ");
    numero_resta1 = scanner.nextInt();
    System.out.println("Escriba el segundo numero de la resta: ");
    numero_resta2 = scanner.nextInt();

    resta = numero_resta1 - numero_resta2;
    return resta;


        } 

    }


    public static void main (String[] args){

        System.out.println("Adios Java");
        System.out.println("Comenzaremos a usar Python");
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);

        
    }
