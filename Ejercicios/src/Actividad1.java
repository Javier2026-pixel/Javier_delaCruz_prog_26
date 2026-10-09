import java.util.Scanner;

public class Actividad1 {

  //Ejercicio 1: Escribe un programa que muestre tu nombre por pantalla.

  public static void ejercicio1() {
  System.out.println("Introduzca su nombre");
  Scanner sc = new Scanner(System.in);
  String nombre = sc.nextLine();
  System.out.println("Bienvenido " + nombre);
  }

  //Ejercicio 2: Modifica el programa anterior para que además se muestre tu edad y tu correo electrónico. 
  // Asegúrate de que los datos se muestran en líneas separadas.

  public static void ejercicio2() {
  Scanner sc = new Scanner(System.in);
  System.out.println("Intoduzca su edad");
  int edad = sc.nextInt();
  System.out.println("Su edad es " + edad);
  System.out.println("Introduzca su email");
  String email = sc.next();
  System.out.println("Su email es " + email);
  }

  //Ejercicio 3: Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su correspondiente traducción al castellano. 
  // Las palabras deben estar distribuidas en dos columnas y alineadas a la izquierda. Pista: Se puede insertar un tabulador mediante \t.  

  public static void ejercicio3() {
  System.out.println("Chair     " + "Silla");
  System.out.println("Table     " + "Mesa");
  System.out.println("Computer  " + "Ordenador");
  System.out.println("Book      " + "Libro");
  System.out.println("Pen       " + "Bolígrafo");
  System.out.println("Pencil    " + "Lápiz");
  System.out.println("Notebook  " + "Cuaderno");
  System.out.println("Backpack  " + "Mochila");
  System.out.println("Teacher   " + "Profesor");
  System.out.println("Student   " + "Estudiante");
  }

  //Ejercicio 4: Escribe un programa que muestre tu horario de clase. Puedes usar espacios o tabuladores para alinear el texto.  

  public static void ejercicio4() {
  System.out.println("               Lunes  " + "                Martes  " + "      Miércoles  " + "             Jueves  " + "               Viernes");
  System.out.println("16:00 - 16:55  " + "Ipe " + "                   Programación  " + "Entornos de desarrollo  "+ "Sistemas informáticos  " + "Lenguaje de marcas");
  System.out.println("16:55 - 17:50  " + "Sistemas informáticos " + " Programación  " + "Entornos de desarrollo  "+ "Sistemas informáticos  " + "Lenguaje de marcas");
  System.out.println("17:50 - 18:45  " + "Sistemas informáticos " + " Base de datos " + "Base de datos  "+ "         Programación  " + "         Programación");
  System.out.println("DESCANSO---------------------------------------------------------------------------------------------------------------");
  System.out.println("19:00 - 19:55  " + "Entornos de desarrollo " + "Base de datos " + "Base de datos  "+ "         Programación  " + "         Programación");
  System.out.println("19:55 - 20:50  " + "Lenguaje de marcas " + "    Inglés " + "       Sistemas informáticos  "+ " Inglés  " + "               Base de datos");
  System.out.println("20:50 - 21:45  " + "Lenguaje de marcas " + "    Ipe    " + "       Programación  "+ "          Ipe  " + "                  Base de datos");
  }

  //Ejercicio 5: Escribe un programa que pinte por pantalla una pirámide rellena a base de asteriscos. 
  // La base de la pirámide debe estar formada por 9 asteriscos.  

  public static void ejercicio5() {
  System.out.println("    *");
  System.out.println("   ***");
  System.out.println("  *****");
  System.out.println(" *******");
  System.out.println("*********");
  }

  //Ejercicio 6: Igual que el programa anterior, pero esta vez la pirámide estará hueca 
  // (se debe ver únicamente el contorno hecho con asteriscos).

  public static void ejercicio6() {
  System.out.println("    *");
  System.out.println("   * *");
  System.out.println("  *   *");
  System.out.println(" *     *");
  System.out.println("*********");
  }

  //Ejercicio 7: Igual que el programa anterior, pero esta vez la pirámide debe aparecer invertida, 
  // con el vértice hacia abajo.
  public static void ejercicio7() {
  System.out.println("*********");
  System.out.println(" *******");
  System.out.println("  *****");
  System.out.println("   ***");
  System.out.println("    *");
  }

 public static void main(String[] args) throws Exception {
        
  //ejercicio1();
  //ejercicio2();
  //ejercicio3();
  //ejercicio4();
  //ejercicio5();
  //ejercicio6();
  //ejercicio7();
  }


 }

