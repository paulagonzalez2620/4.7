package alumnos;

import Alumno.Alumno;
import java.util.Scanner;

/**
 * @author Jiada Chen
 */
public class Alumnos {
    /**
     * Define la estructura, un array de 5 alumnos pero no crea los objetos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alum = new Alumno[5];
        introducirDatoAlumno(alum);
        mostrarInformacion(alum);
    }

    /**
     * Se pide la informacion del alumno como nombre y su nota
     * @param alum Array donde se almacena los alumnos
     * @throws java.util.InputMismatchException No ser un número
     */
    public static void introducirDatoAlumno(Alumno[] alum) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        for (int i = 0; i < 5; i++) {

            alum[i] = new Alumno();

            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            (alum[i]).setNombre(entrada.next());
            System.out.print("Nota media: ");
            (alum[i]).setNotaMedia((entrada.nextDouble()));
        }
    }

    /**
     * Se muestra la informacion del alumno y la nota media global
     * @param alum Array donde se almacena los alumnos
     */
    public static void mostrarInformacion(Alumno[] alum) {
        System.out.println("Los datos introducidos son los siguientes:");
        double sumaDeMedias = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alum[i].getNombre());
            System.out.println("Nota media: " + alum[i].getNotaMedia());
            System.out.println("----------------------------");

            sumaDeMedias += alum[i].getNotaMedia();
        }

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }
}
