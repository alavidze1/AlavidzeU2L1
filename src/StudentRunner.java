public class StudentRunner {
    public static void main(String[] args){
        Student student1 =new Student("Nick",3.9);
        student1.introduce();
        student1.printStudentInfo();
        Student student2 =new Student("Victor",2.7);
        student2.printStudentInfo();
        student2.introduce();

    }

}
