import gradeBook.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita nombre de curso
        String nombreCurso= "";
        System.out.print("Ingrese curso: ");
        nombreCurso = sc.nextLine();
        
        // Solicita nombre de instructor
        String nombreInstructor = "";
        System.out.print("\nIngrese el instructor del Curso: ");
        nombreInstructor = sc.nextLine();

        // Genera instancia con la información obtenida
        GradeBook curso = new GradeBook(nombreCurso, nombreInstructor);

        // Muestra la información del curso creado
        curso.displayMessage();
    }
}