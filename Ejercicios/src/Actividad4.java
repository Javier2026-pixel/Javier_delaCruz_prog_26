import java.util.Random;
import java.util.Scanner;

public class Actividad4 {
    
    
  public static void main(String[] args) throws Exception {
        
        Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();
        
    }
    /*1. Realiza una función llamada suma que sume dos números enteros
    y te devuelva el resultado, posteriormente llámala desde el main y
    muestra su resultado. */

    public static int suma(int num1, int num2){
        return num1 + num2;
    }
    public static void Ejercicio1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = sc.nextInt();
        int resultado = suma(num1,num2);
        System.out.println("El resultado es" + resultado);
    }

    /*2. Realiza un método llamado holaMundo que al ser llamada
    muestre por consola el mensaje “Hola Mundo!”.*/

    public static void holaMundo(){
        System.out.println("Hola Mundo!");
    }
    public static void Ejercicio2(){
        holaMundo();
    }

    /*3. Realiza un método llamado eco con un parámetro de entrada n,
    que al ser llamada muestre por consola el mensaje “ECO” un
    número n de veces.*/

    public static void eco(int ecoVeces){
        ecoVeces = 4;
        for(int i = 1; i <= ecoVeces; i ++ ){
            System.out.println("ECO");
        }
    }
    public static void Ejercicio3(){
        eco(0);
    }

    /*4. Escribe un método llamado mostrarIntermedios que tenga dos
    parámetros de entrada a y b (números enteros) y muestre todos
    los números pares entre ambos números (a y b inclusive). */


    public static void mostrarIntermedios(int a, int b){
        for(int i = 1; i<= b; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void Ejercicio4(){
        int a = 1;
        int b = 10;
        System.out.println(a);
        mostrarIntermedios(a, b);
    }

    /*5. Realiza una función areaCirculo que reciba un parámetro r y te
    devuelva el área de un círculo de radio r.
    Nota: En un circulo: area = pi * r * 2
    Nota: en Java podemos usar el número pi con la constante de la
    clase Math PI ( se accede con Math.PI )*/

    public static void areaCirculo(int r){
        double pi = (3.14);
        double area = pi * r * 2;
        System.out.println("El área es " + area);
        
    }
    public static void Ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un radio ");
        int r = sc.nextInt();
        areaCirculo(r);
    }

    /*6. Realiza una función que reciba dos números enteros y devuelva el
    mayor de los dos, si son iguales devuelve cualquiera de los dos.*/

    public static void mayor(int num1, int num2){
        if(num1>num2){
            System.out.println("El número mayor es " + num1);
        }
        if(num2>num1){
            System.out.println("El número mayor es " + num2);
        }
        if(num1==num2){
            System.out.println("Los números son iguales " + (num2 | num1));
        }
    }
    public static void Ejercicio6(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = sc.nextInt();
        mayor(num1, num2);
    }
    
    
   

}



