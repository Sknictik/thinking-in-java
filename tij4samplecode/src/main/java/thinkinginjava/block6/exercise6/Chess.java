package thinkinginjava.block6.exercise6;//: reusing/Chess.java
// Inheritance, constructors and arguments.
import static net.mindview.util.Print.*;

class Game {
  Game(int i) {
    print("Game constructor");
  }
}

class BoardGame extends Game {
  BoardGame(int i) {
    //Super constructor must be called!
    super(i);
    print("BoardGame constructor");
  }
}	

public class Chess extends BoardGame {
  public Chess() {
    //Super constructor must be called!
    super(11);
    print("Chess constructor");
  }
  public static void main(String[] args) {
    Chess x = new Chess();
  }
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~
