import java.util.ArrayList;

public class School {
    /*
    One String for the name.  The integers for district and postal code increase by themselves as more schools are created.
    Also has the two arrays that connect to the other two Classes.
     */
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    private String schoolName;
    private int district;
    static int districtNum=1;
    private int postalCode;
    static int postalCodeNumber=1;
    /*
Yet again, the basic, generic constructor.
     */
    School(){
        schoolName=" Windermere Secondary School   ";
        district=districtNum;
        districtNum++;
        postalCode=postalCodeNumber;
        postalCodeNumber++;
    }
    /*
More specific version of constructor for specifics.
     */
    School(String schoolName){
        this.schoolName=schoolName;
        this.district=districtNum;
        districtNum++;
        this.postalCode=postalCodeNumber;
        postalCodeNumber++;

    }
    /*
Allows displaying of something useful rather than computer mumbo jumbo.
     */
    public String toString(){
        return " School: "+this.schoolName+"; District: "+this.district+"; Postal Code: "+this.postalCode+";   ";
    }

    public static int getDistrictNum() {
        return districtNum;
    }

    public static int getPostalCodeNumber() {
        return postalCodeNumber;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    /*
This adds a specific teacher to a specific point in the arraylist.
     */
    public void addTeachersToListSpecific(int indexPosition, String firstName, String lastName, String subject){
this.teachers.add(indexPosition, new Teacher(firstName, lastName, subject));
    }
    /*
Adds specific student to specific point in arraylist.
     */
    public void addStudentsToListSpecific(int indexPosition, String firstName, String lastName, int overallGrade){
        this.students.add(indexPosition, new Student(firstName, lastName, overallGrade));
    }
    /*
For removing items from teaher array list.
     */
    public void removeTeachersFromListSpecific(int indexPosition){
        this.teachers.remove(indexPosition);
    }
    /*
Lets you remove item from student array list.
     */
    public void removeStudentsFromListSpecific(int indexPosition){
        this.students.remove(indexPosition);
    }
    /*
Lets you view the teacher arraylist for a school.
     */
    public void viewTeachers(){

        System.out.println(teachers);
    }
    /*
Lets you view the student arraylist for a school.
     */
    public void viewStudents(){

        System.out.println(students);
    }
    /*
Not putting an index position lets you use this to add multiple items to the teacher list at once.
     */
    public void addTeachersToList( String firstName, String lastName, String subject){
        this.teachers.add( new Teacher(firstName, lastName, subject));
    }
    /*
No index position, so I can put multiple students into the arraylist quickly.
     */
    public void addStudentsToList( String firstName, String lastName, int overallGrade){
        this.students.add( new Student(firstName, lastName, overallGrade));
    }
    /*
These two are useable and were supposed to be something else. As is functions like the other removers.
     */
    public void removeTeachersFromList(int indexPosition){
        this.teachers.remove(indexPosition);
    }
    public void removeStudentsFromList(int indexPosition){
        this.students.remove(indexPosition);
    }
}
