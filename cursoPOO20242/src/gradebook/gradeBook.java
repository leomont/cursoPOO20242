package gradebook;

public class gradeBook {

    private String courseName = "";
    private String teacherCourse = "";

    public gradeBook() {
    }

    public gradeBook(String courseName, String teacherCourse) {
        this.courseName = courseName;
        this.teacherCourse = teacherCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherCourse() {
        return teacherCourse;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherCourse(String teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    public void displayMessage()
    {
        System.out.println("curso ingresado: " + getCourseName() + ", Este curso es presentado por: " + getTeacherCourse());
    }


}
