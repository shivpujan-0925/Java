
public class Abstract {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
      
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);

        Mustang myHorse = new Mustang();
        //Animal => Horse => Mustang  (order of calling constructor)
        
    }
}

abstract class Animal {

    //constructor
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        color = "brown"; 
    }
    void eat(){
        System.out.println("Animal eats");  
    }

    abstract void walk();          //in abstract [not giving implementation , only gives idea of function or objects]
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
   void walk(){
    System.out.println("walks on 4 legs");
   }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
  
    void changeColor(){
        color = "White";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
