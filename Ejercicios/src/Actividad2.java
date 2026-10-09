import java.util.Scanner;

public class Actividad2 {
    
  public static void main(String[] args) {
    
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

    //Ejercicio 1
    //Pide por teclado un String preguntando por tu nombre, después muestra un mensaje de bienvenida por consola.

     public static void ejercicio1(){ 
        System.out.println("Introduce tu nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);

    }

    //Ejercicio 2
    //Pedir dos números y realizar operaciones básicas de suma, resta y multiplicación, enseñando el resultado. 

    public static void ejercicio2(){

        System.out.println("Dime dos números");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double division = num1/num2;

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La multiplicación es: " + (num1 * num2));
        System.out.println("La división es: " + (division));

    }

    //Ejercicio 3
    //Pedir un número calcular su raíz cuadrada

    public static void ejercicio3(){
        System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        double raíz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada es "+ (raíz));

    }

    //Ejercicio 4
    //Pedir dos números (base y exponente) y calcular la potencia. 
    
    public static void ejercicio4(){
      System.out.println("Introduzca dos números");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numero2 = sc.nextInt();
        double potencia = Math.pow(numero, numero2);
        System.out.println("La potencia es "+ (potencia));

     }

     //Ejercicio 5
     //Pedir el radio de un circulo y calcular su área. (A=pi*r^2) 
     // (Podemos usar Math.PI para el valor de pi o poner directamente el valor) 

     public static void ejercicio5(){
        System.out.println("Introduzca el radio del circulo");
        Scanner sc = new Scanner(System.in);
        int radio = sc.nextInt();
        double pi = (3.14) ;
        double potencia = Math.pow(radio, 2);

        System.out.println("El área es "+ (pi*potencia));

     }


    //Ejercicio 6
    //Pedir el radio de una circunferencia y calcular su longitud.(L=2+pi*r) 

     public static void ejercicio6(){
        System.out.println("Introduzca el radio de la circunferencia");
        Scanner sc = new Scanner(System.in);
        int radio = sc.nextInt();
        double pi = (3.14) ;
        double multiplicacion = pi*radio;
        System.out.println("El longuitud es "+ (2 + multiplicacion));

     }


    //Ejercicio 7
    //Pedir un password y comprobar si es igual que un String definido en el programa.
    //Enseñar el resultado por pantalla. 

    public static void ejercicio7(){
      String pass = "123456";

      Scanner sc = new Scanner(System.in);
      System.out.println("Introduzca la contraseña");
      String password = sc.nextLine();

      if (password.equals(pass)) {
        System.out.println("Contraseña correcta");

      }
      else{
        System.out.println("Contraseña incorrecta");
      }
 
    }

    /*  
    Ejercicio 8
    Pedir una frase y enseñar por pantalla, la longitud, la primera y última letra.
    Pista: La función substring nos permite extraer una subcadena de una cadena
    */
      
    public static void ejercicio8(){
      System.out.println("Introduzca una frase");
      Scanner sc = new Scanner(System.in);
      String fraseEjercicio8 = sc.nextLine();
      char letran1 = fraseEjercicio8.charAt(0);
      char letran2 = fraseEjercicio8.charAt(fraseEjercicio8.length() -1);
      int longitud = fraseEjercicio8.length(); 
      System.out.println("Tu frase tiene una longitud de " + longitud + " caracteres, su primera letra es " + letran1 + " y su última es " + letran2);

    }

    /* 
    Ejercicio 9
    Pedir por consola o pantalla una frase que contenga la palabra "amigo", como por
    ejemplo: “Hola amigo ¿cómo estás?”. El programa deberá enseñar el substring
    "amigo" extraído de la cadena introducida por consola.
    Pista: La función indexOf del objeto cadena nos devuelve la posición en la que se
    encuentra una cadena dentro de otro
    */

    public static void ejercicio9(){
      System.out.println("Introduzca una frase que contenga la palabra amigo");
      Scanner llave = new Scanner(System.in);
      String fraseEjercicio9 = llave.nextLine();
      int lugarPalabra = fraseEjercicio9.indexOf("amigo");
      
      if(lugarPalabra>=0){
        System.out.println("Palabra encontrada");
        System.out.println("Tu palabra empieza en el caracter " + lugarPalabra);
        String amigo = fraseEjercicio9.substring(lugarPalabra, lugarPalabra + "amigo" .length());
        System.out.println(amigo);
      }
      else{
        System.out.println("La palabra no existe");

      }
    
    }


}
