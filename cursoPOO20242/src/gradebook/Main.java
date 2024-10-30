package gradebook;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreCurso= "";

        // Creación de la variable de instancia String la cual representael nombre del instructor del curso

        String nombreInstructor= "";

        System.out.println("Ingrese curso: ");
        nombreCurso = sc.nextLine();


        //Solicito al usuario el nombre del instructor y lo almaceno en la variable creada anteriormente
        System.out.println("Ingrese el nombre del instructor del curso: ");
        nombreInstructor = sc.nextLine();

        gradeBook curso = new gradeBook(nombreCurso, nombreInstructor);

        curso.displayMessage();

    }
}