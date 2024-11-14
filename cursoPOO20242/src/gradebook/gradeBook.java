package gradebook;

public class gradeBook {

    private String courseName = "";
    private String intructorName = "";


    public gradeBook() {
    }

    public gradeBook(String courseName, String intructorName) {
        this.courseName = courseName;
        this.intructorName = intructorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName(){
        return (String) intructorName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructorName(String intructorName){
        this.intructorName = intructorName;
    }

    public void displayMessage()
    {
        System.out.println("curso ingresado: " + getCourseName());
        System.out.println("instruido por : " + getInstructorName());
    }


}
