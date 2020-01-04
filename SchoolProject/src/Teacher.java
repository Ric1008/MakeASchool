public class Teacher {
    /*
    Teacher class has three Strings. Names and subject.  All of which need to be set.
     */
private String teacherFirstName;
private String teacherLastName;
private String subject;
    /*
Teacher vanilla constructor, once again for mass production and blank generic stuff.
     */
Teacher(){
    teacherFirstName="Jade";
    teacherLastName="Doe";
    subject="None";
}
    /*
Once again a more specific  constructor, but for the teacher class.
     */
Teacher(String firstName, String lastName, String subject){
    this.teacherFirstName=firstName;
    this.teacherLastName=lastName;
    this.subject=subject;

}
    /*
Once again displays something intelligible and useful to humans rather than computer identifiers.
     */
    public String toString(){
        return " Name: "+this.teacherFirstName+"  "+this.teacherLastName+"; Subject: "+this.subject+";   ";
    }

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
