public class Student {
    /*Student class contains two Strings
    Student class also has two integers. One for grade and the other for ID number.
    They all have to have something set for them, except for the ID which increases with each extra student.
     */
    /*

     */
private String studentFirstName;
private String studentLastName;
private int overallGrade;
private int studentID;
        static int studentIDNum;
    /*
Vanilla constructor for mass production and generics.
     */
        Student(){
            studentFirstName="Jade";
            studentLastName="Doe";
            overallGrade=100;
            studentID=studentIDNum;
            studentIDNum++;

        }
    /*
This constructor is more specific and requires input to fill it out.
     */
        Student(String studentFirstName, String studentLastName, int overallGrade){
            this.studentFirstName=studentFirstName;
            this.studentLastName=studentLastName;
            this.overallGrade=overallGrade;
            studentID=studentIDNum;
            studentIDNum++;

        }
    /*
This lets some semi-useful information be displayed instead of a random string of computer identification symbols.
     */
    public String toString(){
        return " Name: "+this.studentFirstName+"  "+this.studentLastName+"; Grade: "+this.overallGrade+";   ";
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getOverallGrade() {
        return overallGrade;
    }

    public void setOverallGrade(int overallGrade) {
        this.overallGrade = overallGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public static int getStudentIDNum() {
        return studentIDNum;
    }
}
