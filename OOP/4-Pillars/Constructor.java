
public class Constructor {
     public static void main(String[] args) {
        Student s1 = new Student();   //initialization
        Student s2 = new Student("radhe");
        Student s3 = new Student(005);

        // Student s4 = new Student("abhi", 290); gives err.    NOT CALLED 

       
     }
}

class Student {
    String name;
    int roll;
   
    //Constructor

    //NON - paramterized
    Student(){
      System.out.println("Constructor is called....");
    }
    
    //parameterized.
    Student(String name){
      this.name = name;
    }

    Student(int roll){
      this.roll = roll;
    }

}
