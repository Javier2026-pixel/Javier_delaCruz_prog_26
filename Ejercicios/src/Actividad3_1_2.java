import java.util.Scanner;

public class Actividad3_1_2 {
    
    public static void main(String[] args) {
        
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
    }



    //Ejercicio 1: Escribe un programa que pida un número y diga si es o no múltiplo de 3.

    public static void ejercicio1(){

        System.out.println("Dime un número");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if(numero % 3 == 0){
            System.out.println("El número " + numero + " es múltiplo de 3");
        }
        else{
            System.out.println("El número " + numero + " no es múltiplo de 3");
        }

    }

    /*Ejercicio 2: Escribe un programa que lee por teclado tres números enteros y calcula y muestra el
    mayor de los tres.*/

    public static void ejercicio2(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num1 = sc.nextInt();
        System.out.println("Dime un segundo número");
        int num2 = sc.nextInt();
        System.out.println("Dime un tercer número");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("El mayor de los tres números es "+ num1);
        }

        if (num2 > num1 && num2 > num3){
             System.out.println("El mayor de los tres números es "+ num2);
        }

        if (num3 > num1 && num3 > num1){
             System.out.println("El mayor de los tres números es "+ num3);
        }

        else {
            System.out.println("Los tres números son iguales");
        }
    }


    /*Ejercicio 3: Escribe un programa que lea por teclado tres números enteros H, M, S correspondientes
    a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
    Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será
    mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará
    comprendido entre 0 y 59 ambos incluidos. */

    public static void ejercicio3(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un hora");
        int hora = sc.nextInt();

        if(hora >= 0 && hora < 24){
            System.out.println("La hora "+ hora + " es válida");

            System.out.println("Ahora dime los minutos");
            int minutos = sc.nextInt();

            if(minutos >= 0 && minutos <= 59){
                System.out.println("Los minutos " + minutos + " son válidos");
                
              
                System.out.println("Ahora dime los segundos");
                int segundos = sc.nextInt();

                if(segundos >= 0 && segundos <= 59){
                System.out.println("Los minutos " + segundos + " son válidos");
                System.out.println("La hora establecida es " + hora + ":"+ minutos +":"+ segundos);
                }
                else{
                System.out.println("No es válida");
                }
            }
            else{
            System.out.println("No es válida");
            }       

        }
        else{
            System.out.println("No es válida");
        }
    }


    /*Ejercicio 4: Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en pantalla
    el nombre en letras de ese número. Se debe controlar que se introduzca un número válido. */

    public static void ejercicio4(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entre 0 y 10");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
            break;
            case 3:
                System.out.println("Tres");
            break;
            case 4:
                System.out.println("Cuatro");
            break;
            case 5:
                System.out.println("Cinco");
            break;
            case 6:
                System.out.println("Seis");
            break;
            case 7:
                System.out.println("Siete");
            break;
            case 8:
                System.out.println("Ocho");
            break;
            case 9:
                System.out.println("Nueve");
            break;
            case 10:
                System.out.println("Diez");
            break;    
            default:
                System.out.println("No es válido");
            break;
        }


    }


    /*Ejercicio 5: Escribe un programa que realice lo contrario que el anterior, es decir pide un número en
    letras y enseña un número.*/

    public static void ejercicio5(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entre cero y diez");
        String num = sc.nextLine();


        switch (num.toLowerCase()) {
            case "cero":
                System.out.println("0");
                break;
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
            break;
            case "tres":
                System.out.println("3");
            break;
            case "cuatro":
                System.out.println("4");
            break;
            case "cinco":
                System.out.println("5");
            break;
            case "seis":
                System.out.println("6");
            break;
            case "siete":
                System.out.println("7");
            break;
            case "ocho":
                System.out.println("8");
            break;
            case "nueve":
                System.out.println("9");
            break;
            case "diez":
                System.out.println("10");
            break;    
            default:
                System.out.println("No es válido");
            break;
        }

    }

    /*Ejercicio 6: Escribe un programa que lea una variable entera mes y compruebe si el valor
    corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
    mostrará además el nombre del mes */

    
    public static void ejercicio6(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un número entre 1 y 12");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("Enero");
            break;
            case 2:
                System.out.println("Febrero");
            break;
            case 3:
                System.out.println("Marzo");
            break;
            case 4:
                System.out.println("Abril");
            break;
            case 5:
                System.out.println("Mayo");
            break;
            case 6:
                System.out.println("Junio");
            break;
            case 7:
                System.out.println("Julio");
            break;
            case 8:
                System.out.println("Agosto");
            break;
            case 9:
                System.out.println("Septiembre");
            break;
            case 10:
                System.out.println("Octubre");
            break;
            case 11:
                System.out.println("Noviembre");
            break;     
            case 12:
                System.out.println("Diciembre");
            break;
            default:
                 System.out.println("Error");
            break;
        }

    }
    
    /*Ejercicio 7: Escribe un programa que pida la nota de las tres evaluaciones, y si están aprobadas
    realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si no, escribe que evaluación
    debe recuperar. */

    public static void ejercicio7(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime la nota de la primera evaluación");
        int num1= sc.nextInt();
        System.out.println("Dime la nota de la segunda evaluación");
        int num2= sc.nextInt();
        System.out.println("Dime la nota de la tercera evaluación");
        int num3= sc.nextInt();

        if(num1>=5 && num2>=5 && num3>= 5){
            System.out.println("La nota final es " + ((num1 + num2 + num3)/3));
        }
        if(num1<5){
            System.out.println("Debe recuperar la primera evaluación");
        }
        if(num2<5){
            System.out.println("Debe recuperar la segunda evaluación");
        }
        if(num3<5){
            System.out.println("Debe recuperar la tercera evaluación");
        }
        else{
            System.out.println("Debe recuperar todas las evaluaciones");
        }
    }

    /*Ejercicio 8: Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el número de
    horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir de ahí, las restantes
    horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total del sueldo */

    public static void ejercicio8(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Horas trabajadas este mes");
        int horas= sc.nextInt();
        int pagan= 0;

        if(horas<=150){
            pagan= 10;
        }
        else{
            pagan= 20;
        }
        System.out.println("El sueldo total es " + (horas * pagan));
    }

    /*Ejercicio 9: Escribe un programa que diga si un año es bisiesto. No deber permitir aceptar años
    negativos. Un año es bisiesto si cumple una de las siguientes reglas:
    1. Divisible entre 4, divisible entre 100 y divisible entre 400.
    2. Divisible entre 4, NO divisible entre 100. */

    public static void ejercicio9(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un año");
        int año= sc.nextInt();

        if(año<0){
            System.out.println("No es válido");
        }
        if((año % 4 == 0 && año % 100 == 0 && año % 400 == 0) || (año % 4 == 0 && año % 100 != 0)){
            System.out.println("El año " + año + " es bisiesto");
        }
        else{
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
}
