public class OOPS{
   public static void  main(String args[]){
    Pen p1 = new Pen();  //created a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.Color);

    p1.setTip(3);
    System.out.println(p1.Tip);

    // p1.setColor("yellow");
    p1.Color = "Yellow"; 
     System.out.println(p1.Color);

   }
}

class Pen {
    String Color;
    int Tip;

    void setColor(String newColor){
        Color = newColor;
    }

    void setTip(int newTip){
        Tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void CalcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;
    }
}