import java.util.Scanner;

public class Actividad3_1{
    
    public static void main(String[] args) {
        
        //ejecicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
    }


    /*Ejercicio 1: Construye un programa que pida dos números al usuario e indique cuál es mayor o si son
    iguales.*/

    public static void ejecicio1(){

        System.out.println("Dime dos números");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num1>num2){
            System.out.println("El " + num1 + " es mayor que el " + num2);

        }
        else if(num2>num1){ 
            System.out.println("El " + num2 + " es mayor que el " + num1);

        }
        else{
            System.out.printf("Los números %d y %d son iguales" , num1, num2);
        }

    }

    //Ejercicio 2: Construye un programa que pida un número al usuario y nos indique si es par o impar.

    public static void ejercicio2(){
        System.out.println("Dime un número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        if(num1 % 2 == 0){
            System.out.println("Tu  número es par");
        }
        else{
            System.out.println("Tú numero es impar");
        }
           
    }

    /*Ejercicio 3: Construye un programa que pida dos números al usuario y muestre el resultado de su
    división. Si el segundo número es 0, debe mostrar un mensaje de error.*/

    public static void ejercicio3(){
        System.out.println("Dime dos números");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        if( num2  == 0 ){
            System.out.println("Error");
        }
        else{
            double resultado = num1 / num2;
            System.out.println("El resultado es " + resultado);
        }

    }

    /*Ejercicio 4: Construye un programa que pida dos números al usuario. Debe calcular el resultado de
    elevar el primero (base) al segundo (exponente) teniendo en cuenta lo siguiente:
    Si el exponente es cero el resultado es 1
    En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la función que
    calcula la potencia) */

    public static void ejercicio4(){
        System.out.println("Dime una base");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        System.out.println("Ahora dime un exponente");
        double exponente = sc.nextDouble();

        if(exponente == 0){
            System.out.println("El resultado es 1");
        }
        else{
            double resultado = Math.pow(base,exponente);
            System.out.println("El resultado es " + resultado);
        }
    }

    /*Ejercicio 5: Construye un programa que exprese si un triángulo es isósceles, equilátero o escaleno y
    si es rectángulo. Para ello debe recibir por teclado 3 valores correspondiente a la medida de sus
    lados.*/

    public static void ejercicio5(){
        System.out.println("Dime 3 números, que equivalen a los lados del triángulo");
        Scanner sc = new Scanner(System.in);
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();


        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es Equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("El triángulo es Isósceles.");
        } else {
            System.out.println("El triángulo es Escaleno.");
        }
        
        // Para averiguar si es rectángulo 
    
        if ((Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2) ) ||
            (Math.pow(lado1, 2) + Math.pow(lado3, 2)  == Math.pow(lado2, 2)) ||
            (Math.pow(lado2, 2) + Math.pow(lado3, 2)  == Math.pow(lado1, 2))) {
            System.out.println("Según el Teorema de Pitágoras es un triángulo Rectángulo.");
        } else {
            System.out.println("Según el Teorema de Pitágoras no es un triángulo Rectángulo.");
        }

    }

    /*Ejercicio 6: Un instituto está organizando un viaje y te piden que construyas un programa que
    calcule el coste total del viaje y lo que le supone a cada alumno en función de lo siguiente:
    Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
    De 30 a 49 alumnos, deberán pagar 48€ por alumno.
    De 20 a 29 alumnos, deberán pagar 56€ por alumno.
    Menos de 20 alumnos, deberán abonar un total de 2000 euros en total.*/

    public static void ejercicio6(){
        System.out.println("Cuantos alumnos van al viaje");
        Scanner sc = new Scanner(System.in);
        int alumnos = sc.nextInt();

        
        if (alumnos <= 0) {
            System.out.println("Error: El número de alumnos debe ser mayor que cero.");
        }
        else {
         int costeAlumno;
         int costeTotal;
        
            if(alumnos >= 50 ){
            costeAlumno = 40;
            costeTotal = costeAlumno * alumnos;
            }
            else if(alumnos >= 30){
            costeAlumno = 48;
            costeTotal = costeAlumno * alumnos;
            }
            else if(alumnos >= 20){
            costeAlumno = 56;
            costeTotal = costeAlumno * alumnos;
            }
            else{
            costeTotal = 2000;
            costeAlumno = costeTotal / alumnos;
            }

            System.out.println("Cada alumno debe pagar " + costeAlumno + " y en total es " + costeTotal);
        }

    }

    public static void ejercicio7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de alumnos que van al viaje");
        int alumnos = sc.nextInt();
        int costeTotal= 0;

        switch (alumnos/10) {
            case 0: 
                costeTotal= 2000;
                break;
            case 1:
                costeTotal= 2000;
                break;
            case 2:
                costeTotal = 56*alumnos;
                break;
            case 3:
                costeTotal= 56*alumnos;
            case 4:
                costeTotal= 48*alumnos;
                break;
            default:
                costeTotal=40*alumnos;
                break;

        }
        
        System.out.println("El precio de la excursión es " + costeTotal);
    
    }





}
