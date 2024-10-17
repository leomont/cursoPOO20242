package gradebook;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreCurso= "";
        String nombreInstructor= "";

        System.out.println("Ingrese curso: ");
        nombreCurso = sc.nextLine();

        System.out.println("Ingrese el nombre del instructor que presenta la clase: ");
        nombreInstructor = sc.nextLine();

        gradeBook curso = new gradeBook(nombreCurso, nombreInstructor);

        curso.displayMessage();

    }
}