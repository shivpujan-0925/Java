public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        //shark.eat();     // o/p - "eats" 

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
        

        // Fish f1 = new Fish();
        // f1.eat();
       
        Tuna f1 = new Tuna();
        f1.size();
        f1.swim();
    
    }
}


//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }


}

//____multi level inheritance_________________

// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }

//__________single level inheritance___________________________
//derived class 
// class Fish extends Animal{   // extends --> extract properties from Animal class.
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }


//___________Hierarchial inheritance __________________________

// class Birds extends Animal{
//     void fly(){
//         System.out.println("Fly");
//     }
// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swim");
//     }
// }

// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walk");
//     }
// }

//__________Hybrid Inheritance______________________

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Shark extends Fish{
    void size(){
        System.out.println("Biggest fish in the world");
    }
}

class Tuna extends Fish{
    void size(){
        System.out.println("Less in the size as compared to shark");
    }
}
 //----

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Peacock extends Bird{
    void color(){
        System.out.println("Peacock is colorfull birds");
    }
}

//-------

class Mammal extends Animal{
    void walk(){
        System.out.println("Mammals can walk");
    }
}

class Dog extends Mammal{
    void breed(){
        System.out.println("german shefered");
    }
}

class Cat extends Mammal{
    void drink(){
        System.out.println("cat  drinks milk");
    }
}

class Human extends Mammal{
    void highIQ(){
        System.out.println("Human can think higher than other species");
    }
}
