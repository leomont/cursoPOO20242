public class gradeBook {

    private String courseName = "";

    public gradeBook() {
    }

    public gradeBook(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage(String nombreCurso)
    {
        System.out.println("curso ingresado: " + nombreCurso);
    }


}