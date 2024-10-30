package gradeBook;

public class GradeBook {
    // Propiedades iniciales para instancia
    private String courseName = "";
    private String instructorName = "";

    // Función Constructora
    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    // Gestiona Nombre de Curso
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    // Gestiona Nombre de Instructor
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    // Muestra el contenido de las propiedades de la instancia
    public void displayMessage()
    {
        System.out.printf("\nBienvenido, %nEl curso ingresado es: %s %nEste curso es presentado por: %s %n",getCourseName(), getInstructorName());
    }


}
