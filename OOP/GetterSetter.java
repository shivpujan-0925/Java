public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

//__________________________________________________________________________

class Pen{
    private String Color;
    private int Tip;

    //Get Color
     String getColor(){
        return this.Color;
     }

     //get Tip
     int getTip(){
        return this.Tip;
     }


    //set color
    void setColor(String newColor){
        this.Color = newColor;
    }

    //set Tip
    void setTip(int newTip){
        this.Tip = newTip;
    }
}
