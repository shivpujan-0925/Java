
public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

//________________________________________________________________________________________________________

  //Method Overriding: Parents and child classes both contain the same function with a different definition.

//_________________________________________________________________________________________________________  

class Animal {
    void eat(){
        System.out.println("eat anthing");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("eat grass");
    }
}