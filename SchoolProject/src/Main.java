public class Main {
    public static void main(String[] args) {
School windy = new School("Ham");
        System.out.println(windy);
        windy.addTeachersToListSpecific(0,"Larry","Joseph","Gym");
        windy.getTeachers();
        System.out.println(windy.teachers);

        System.out.println(windy.teachers);
        windy.addTeachersToListSpecific(1,"Larry","Joseph","Gym");
        windy.addTeachersToListSpecific(2,"Larry","Joseph","Gym");
        windy.addTeachersToListSpecific(3,"Larry","Joseph","Gym");
        windy.addTeachersToListSpecific(4,"Larry","Joseph","Gym");
        windy.addTeachersToListSpecific(5,"Larry","Joseph","Gym");
        windy.viewTeachers();
        School school=new School("Windermere");
        for (int i=0;i<3;i++){
        school.addTeachersToList("Harry", "Loyd", "Science");}
            for (int i=0;i<10;i++){
                    school.addStudentsToList("Jones", "Heckkle", 86);}
            school.viewTeachers();
            school.viewStudents();
            school.removeStudentsFromListSpecific(6);
            school.removeStudentsFromListSpecific(3);
            school.removeTeachersFromListSpecific(1);
            school.viewTeachers();
            school.viewStudents();

    }

}
