
public class Student {

    private String name;
    private double gpa;

    public Student(String studentName, double studentGpa) {
        name = studentName;
        gpa= studentGpa;
    }
    public void introduce() {
        if(gpa>3) {
            System.out.println("Hello my name is " + name + " and I am a relatively good student");
        }else {
            System.out.println("Hello my name is " + name + " and I am not a good student");
        }
    }
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gpa: " + gpa);
    }
}



