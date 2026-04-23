
public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        Bear b = new Bear();
        b.eatMeat();
        b.eatPlant();
    }
}

interface Herbivore {
  void eatPlant();
}

interface Carnivore {
   void eatMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatPlant() {
        System.out.println("Bear eats plants");
    };

    public void eatMeat() {
        System.out.println("Bear eats meat");
    };
}

//_______________________________________________________________________________________________________
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left right, diagonal(in all 4 direction)");
    }
}
class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, Left right");
    }
}
class King implements ChessPlayer {
    public void moves(){
        System.out.println("Up , down , left , right , Diagonal- (by 1 step)");
    }
}
