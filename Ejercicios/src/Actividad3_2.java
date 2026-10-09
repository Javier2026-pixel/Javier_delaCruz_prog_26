import java.util.Random;
import java.util.Scanner;

public class Actividad3_2 {
    
    public static void main(String[] args) throws InterruptedException {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        ejercicio9();
    }

    /*Ejercicio 1: Realizar un programa que imprima en pantalla los números del 1 al 100. 
    (Debes hacerlo con las tres estructuras iterativas vistas: while, do while y for). */

    public static void ejercicio1(){
        System.out.println("Con while");
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i++;
        }

        System.out.println("Con do while");
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j<=100);

        System.out.println("Con for");
        for(int R=1; R<=100; R++){
            System.out.println(R);
        }
    }

    /*Ejercicio 2: Escribir un programa que solicite un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno. */

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número positivo");
        int num = sc.nextInt();

        if(num >= 1 ){
            for(int i= 1; i<= num; i++){
                System.out.println(i);
            }
        }
        else{
            System.out.println("El número no es válido");
        }
    }


    /*Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio.*/

    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int valor;
        double promedio;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el valor " + i + ": ");
            valor = sc.nextInt();
            suma += valor; 
        }

        promedio = (double) suma / 10;

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio es: " + promedio);

    }

    /*Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:
    Guarda en una variable tu nombre.
    Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca por teclado.
    El programa finaliza cuando el usuario adivina tu nombre. Sino el programa debe continuar pidiendo al usuario que lo intente otra vez. */

    public static void ejercicio4(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Adivina mi nombre");
        String nombreCorrecto = "javier";
        boolean acierta = false;

        while(!acierta){
            System.out.println("¿Cuál es mi nombre?");
            String nombre = sc.nextLine();
            nombre = nombre.toLowerCase();

            if(!nombreCorrecto.equals(nombre)){
                System.out.println("Intenta de nuevo");
            }
            else{
                acierta = true;
            }
        }
        System.out.println("Acertaste mi nombre");

    }

    /*Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y muestre al usuario el resultado de la tirada. 
    Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que el resultado es el mismo. La aplicación se debe repetir hasta que el usuario indique que no quiere tirar más (preguntando por ‘s’ o ‘n’, o “si” o “no”). */

    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String respuesta;

        do {
            int dado1 = random.nextInt(6) + 1 ; 
            int dado2 = random.nextInt(6) + 1 ; 

            System.out.println("Resultado de la tirada: Dado 1: " + dado1 + ", Dado 2: " + dado2);

            if (dado1 == dado2) {
                System.out.println("Los dos dados tienen el mismo número");
            }

            System.out.print("¿Quieres tirar los dados de nuevo? (s/n) o (si/no): ");
            respuesta = sc.nextLine().toLowerCase();

        } while (respuesta.equals("s") || respuesta.equals("si"));

        System.out.println("Gracias por jugar. Hasta luego");
    }

    /*Ejercicio 6: Realizar un juego para adivinar un número. 
    Para ello primero, el programa debe guardar un número en una variable y el usuario debe introducir números hasta acertarlos. 
    Para darle pistas al usuario se le indicará “mayor” o “menor” según sea mayor o menor con respecto al número guardado. 
    El proceso termina cuando el usuario acierta. */

    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; 
        int intento;
        boolean acertado = false;

        System.out.println("Adivina el número entre 1 y 100");

        while (!acertado) {
            System.out.print("Introduce tu intento: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                acertado = true;
                System.out.println("Has acertado el número.");
            }
        }
    }


    /*Ejercicio 7: Diseña una aplicación que simule un reloj digital que muestre la hora sin parar. Debe esperar un segundo real para darle más realismo. Pasos:
    o Pide al usuario que introduzca la hora y los minutos.
    o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
    o Cada vez que transcurra un segundo incrementa la hora comprobando si hay cambio de minuto y hora
    o Muéstralo por pantalla.
    (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa durante 1000 milisegundos = 1 segundo). */

    public static void ejercicio7() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = sc.nextInt();
        int segundos = 0;

        while (true) {
            System.out.println( hora +":"+ minutos +":" + segundos);
        
            Thread.sleep(1000);
                
                segundos = (segundos + 1);
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        hora++;
                        if (hora == 24) {
                            hora = 0;
                        }
                    }
                }
        }
    }


    /*Ejercicio 8: Escriba un programa que calcule el factorial de un número. 
    El factorial de un número es igual al producto de todos los números enteros positivos desde 1 hasta dicho número */

    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = sc.nextInt();
        int factorial = 1;

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos");
        } 
        else {
            for (int i = 1; i <= numero; i++) { 
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + numero + " es " + factorial);
        }
    }

    /*Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. 
    La altura de la escalera se lee por teclado. 
    Ejemplo: Si introducimos un 5 nos queda: 
    * 
    ** 
    *** 
    **** 
    ***** 
    Posteriormente hacer lo mismo, pero con la pirámide invertida. */

    public static void ejercicio9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la escalera: ");
        int altura = sc.nextInt();

        System.out.println("Escalera:");
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 

        System.out.println("Pirámide invertida:");
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}        

