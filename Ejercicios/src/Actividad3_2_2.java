import java.util.Scanner;

public class Actividad3_2_2{

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
    }


    /*Ejercicio 1: Diseñar un programa que pida un número por teclado y escriba tantas líneas como diga el número y en cada línea escriba desde el número 1 hasta el número introducido. 
    Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla: 
    12345 
    12345 
    12345 
    12345 
    12345 */

    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            for(int j= 1; j<= num; j++){
                System.out.print(j);
            }
            System.out.println("");
 
        }

    }

    /*Ejercicio 2: Diseñar un programa que haga lo mismo que el anterior, 
    pero en este caso deberá escribir los números en orden decreciente, es decir, 
    si introducimos el número 5 deberá mostrar en pantalla: 
    54321 
    54321 
    54321 
    54321 
    54321 */

    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();
        for(int i = num; i >= 1; i--){
            for(int j = num; j>=1; j--){
                System.out.print(j);
            }
            System.out.println("");
          
        }

    }

    /*Ejercicio 3: Deberéis diseñar un programa similar al anterior, pero en lugar de escribir en lugar de imprimir en todas las líneas todos los números desde el 1 hasta el introducido por teclado, 
    en la primera línea se imprimirá sólo el número 1, en la segunda el 1 y el 2, y así hasta escribir el número de líneas indicadas por el usuario. 
    Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla: 
    1 
    12 
    123 
    1234 
    12345 */

    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num = sc.nextInt();
       
        for(int i = 1; i<= num; i++ ){
            for(int j = 1; j<= i; j++){
                System.out.print(j);
            }
            System.out.println("");
            
        }

    }

    /*Ejercicio 4: Diseña un programa que escriba todos los números del 100 al 0 de 7 en 7,
    es decir, mostrará 100, 93, 86…0. */

    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        int numero = 100;

        for(int i = numero; i >= 1; i-=7 ){
            System.out.println(i);
        }
    }

    /*Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres leer. 
    Nosotros deberemos leer la cantidad de números indicada y calcula el promedio de los valores indicados. */

    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres leer?");
        int cantidadNumeros = sc.nextInt();
        double suma = 0;
        for(int i = 1; i <= cantidadNumeros; i++){
            System.out.print("Dime el número " +i+ ": ");
            double numero = sc.nextInt();
            suma += numero;
        }
        double promedio = suma/ cantidadNumeros;
        System.out.println("El promedio es: " + promedio);
    }

    /*Ejercicio 6: Realiza un programa que lea un número por teclado y nos diga si el número es o no primo. 
    (Los números primos son aquellos que sólo son divisibles por ellos mismos y por la unidad). */

    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        boolean esPrimo = false;
        do{
            System.out.println("Dime un número primo");
            int num = sc.nextInt();
            if(num % 2 == 0){
                System.out.println("El número " + num + " no es primo");
                esPrimo = true;
            }
            else{
                System.out.println("El número " + num + " es primo");
                esPrimo = false;
            }
        } while(esPrimo == true);
    } 

    /*Ejercicio 7: Desarrollar un programa que lea números enteros hasta teclear 0, 
    y nos muestre el máximo, el mínimo y la media de todos ellos. 
    El 0 no se debe contar como número introducido, solo como valor de salida. */

    public static void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero != 0) {
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
                suma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se introdujeron números.");
        }

    }

    /*Ejercicio 8: Escribe un programa en Java que implemente una calculadora simple.
    La calculadora debe permitir a los usuarios realizar operaciones matemáticas básicas, como suma, resta, multiplicación y división. 
    El programa deberá mostrar un menú con las siguientes opciones: 
    1. Sumar 
    2. Restar 
    3. Multiplicar 
    4. Dividir 
    5. Es primo (indica si el número introducido es primo o no lo es) 
    6. Salir 
    Cuando el usuario selecciona una opción (del 1 al 5), el programa debe solicitar los números necesarios para realizar la operación y mostrar el resultado de dicha operación. 
    El programa debe repetir el proceso hasta que el usuario seleccione la opción "Salir". La opción “Salir” muestra un mensaje de despedida y finaliza la ejecución del programa */


    public static void sumar(int num1, int num2){
        int suma = num1 + num2;
        System.out.println("La suma es " + suma);
    }
    public static void restar(int num1, int num2){
        int resta = num1 - num2;
        System.out.println("La resta es " + resta);
    }
    public static void multiplicar(int num1, int num2){
        int multiplicación = num1 * num2;
        System.out.println("La multiplicación es " + multiplicación);
    }
     public static void dividir(int num1, int num2){
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("La división es " + division);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Calculadora simple");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Es primo");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            int num1, num2;
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextInt();
                    sumar(num1, num2);
                    break;
                   
                case 2:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextInt();
                    restar(num1, num2);
                    break;
                case 3:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextInt();
                    multiplicar(num1, num2);
                    break;
                case 4:
                    System.out.print("Introduce el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    num2 = sc.nextInt();
                    dividir(num1, num2);
                    break;
                case 5:
                    ejercicio6();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);
    }

    /*Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello:
    o 1º Pediremos el DNI por teclado al usuario.
    o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23 quedándonos con el resto de la división, que debe estar entre 0 y 22.
    o Comprobaremos en la siguiente tabla, en función del resto obtenido en el paso anterior, cuál es la letra que corresponde 
    Ejemplo: Si introduzco el número 70588387, el resto de la división con 23 es 7, por lo que le corresponde la letra “F”.*/

    public static void ejercicio9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu DNI (sin letra): ");
        int dni = sc.nextInt();
        int resto = dni % 23;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
                         'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 
                         'L', 'C', 'K', 'E'};
        char letra = letras[resto];
        System.out.println("La letra correspondiente al DNI " + dni + " es: " + letra);
    }

    /*Ejercicio 10: Solicita al usuario una cadena y comprueba el número de vocales que tiene. 
    Deberás usar el método charAT(i) de la clase String para extraer un carácter de la cadena, donde i es la posición del carácter de la cadena que queremos obtener. 
    Por ejemplo, si quisiéramos obtener el carácter número de 5 de una cadena lo haríamos así: cadena.charAT(i) */

    public static void ejercicio10(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        int contadorVocales = 0;
        for(int i = 0; i < cadena.length(); i++){
            char c = Character.toLowerCase(cadena.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contadorVocales++;
            }
        }
        System.out.println("La cadena tiene " + contadorVocales + " vocales.");
    }

    /*Ejercicio 11: Realiza el control de acceso a una caja fuerte. 
    La combinación será un número de cuatro cifras.
    El usuario tendrá 4 oportunidades para averiguar el número. 
    El programa nos pedirá la combinación para abrirla. 
    Si no acertamos, se nos mostrará el mensaje “Clave incorrecta le quedan X intentos”, 
    si agota los 4 intentos mostrará el mensaje “Lo siento has agotado las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja fuerte”. */

    public static void ejercicio11(){
        Scanner sc = new Scanner(System.in);
        int contraseña = 3780;
        int intento;
        System.out.println("Dime la contraseña de cuatro dígitos");
        for(int i = 4; i >=1;){
            System.out.print("Intento número "+i+ ":");
            intento = sc.nextInt(); 

            if(intento != contraseña){
                i--;
                System.out.println("Clave incorrecta le quedan "+i+ " intentos");
                if(i == 0){
                    System.out.println("Lo siento has agotado las 4 oportunidades");
                }
            }
            else{
                System.out.println("Has acertado");
                i = 0;
            }
        }   
    } 

    /*Ejercicio 12: Realiza un programa que compruebe si dos números son amigos. 
    Para ello hay que comprobar que la suma de todos los divisores del primer número (sin contar con él) es el segundo número, 
    y que la suma de todos los divisores propios del segundo número (sin contar con él) es el primer número. 
    Por ejemplo: - Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110. Su suma es 284. 
    - Los divisores propios de 284 son 1, 2, 4, 71 y 142. Su suma es 220. - Por tanto, 220 y 284 son amigos. */

    public static void ejercicio12(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int sumaDivisores1 = 0;
        for(int i = 1; i < num1; i++){
            if(num1 % i == 0){
                sumaDivisores1 += i;
            }
        }
        
        int sumaDivisores2 = 0;
        for(int i = 1; i < num2; i++){
            if(num2 % i == 0){
                sumaDivisores2 += i;
            }
        }

        if(sumaDivisores1 == num2 && sumaDivisores2 == num1){
            System.out.println("Los números son amigos.");
        } else {
            System.out.println("Los números no son amigos.");
        }
    }

    /*Ejercicio 13: Realiza un algoritmo que permita calcular un número determinado de elementos de la serie de Fibonacci, 
    teniendo en cuenta que cada uno es la suma de los dos elementos anteriores, 
    con la excepción de los dos primeros, que son 0 y 1. 
    Así, la serie estaría formada por los números: 0, 1, 1, 2, 3, 5, 8, 13, 21… */

    public static void ejercicio13(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos de la serie de Fibonacci que deseas calcular: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.print("Serie de Fibonacci: ");
        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }



}