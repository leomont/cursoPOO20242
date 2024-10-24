package gradebook;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombreCurso= "";
        System.out.println("Ingrese curso: ");

        nombreCurso = sc.nextLine();

        String intructorName = sc.nextLine();
        System.out.println("ingrese nombre profesor: ");

        intructorName = sc.nextLine();
        sc.close();

        gradeBook curso = new gradeBook(nombreCurso, intructorName);

        curso.displayMessage();

    }
}