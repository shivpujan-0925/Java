public class Static {
    public static void main(String args[]){
      Student s1 = new Student();
      s1.schoolName = "NPS";
    //   System.out.println(s1.schoolName);

      Student s2 = new Student();
    //   System.out.println(s2.schoolName);

    Student s3 = new Student();
     s3.schoolName = "High school";
     
    }
}

class Student{
  String name;
  int Roll;

  static String schoolName;      

  void setName(String name){
    this.name = name;
  }

  String getName(){
    return this.name;
  }
}

