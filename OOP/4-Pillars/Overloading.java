
public class Overloading {
    public static void main(String[] args) {
        Calculator cals = new Calculator();

        System.out.println(cals.sum(2,5));
        System.out.println(cals.sum((float)2.9, (float)2.5));
        System.out.println(cals.sum(2,5,9));
    }
}

//___________________________________________________________________________________________________________________________

   // Method overLoading: multiple function with the same name but different parameters.

//___________________________________________________________________________________________________________________________   

class Calculator {
    int sum(int a , int b){
        return a + b;
    }

    float sum(float a, float b ){
        return a + b;
    }

    int sum( int a , int b, int c){
        return  a + b + c;
    }
}