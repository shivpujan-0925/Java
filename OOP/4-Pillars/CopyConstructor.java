
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "radhe";
        s1.roll = 64;
        s1.password = "hello";
        s1.marks[0] = 85;
        s1.marks[1] = 90;
        s1.marks[2] = 94;

        Student s2 = new Student(s1);    //copying
        s1.marks[2] = 100;   //Don't reflect bcoz of deep copy constructor used.
        s2.password = "abcd";

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // Shallow copy constructor
    // Student(Student s1){
    //       marks = new int[3];
    //       this.name = s1.name;
    //       this.roll = s1.roll;
    //       this.marks = s1.marks;
          
    // }

    //Deep copy constructor
    Student( Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll =  s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called....");
    }
}