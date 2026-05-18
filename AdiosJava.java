import java.util.Scanner; 

public class AdiosJava{

    public static int multiplicar(int n1, n2){
        return n1 * n2;
    }

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

        Persona persona1;
        persona1 = new Persona("Jared Alan", "Perez", "Pichardo");

        persona1.setedad(19);
        persona1.setDomicilio("Avenida San Javier 64");
        persona1.settelefono("247 133 7626");


        System.out.println("\n" + persona1.toString());
        scanner.close();
    }
