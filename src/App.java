import java.util.HashMap;
import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class App {
    HashMap<Integer, Character> gameMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        displayMethod();
    }

    public static void displayMethod(){
        System.out.println("x" + " | " + "x" + " | " + "x");
        System.out.println("----------");
        System.out.println("x" + " | " + "x" + " | " + "x");
        System.out.println("----------");
        System.out.println("x" + " | " + "x" + " | " + "x");
    }
    public static void moveCollector(){
        App m1 = new App();
        int row = InputHelper.getRangedInt(m1.scan, "Enter move row [1 - 3]", 1, 3);
        int column = InputHelper.getRangedInt(m1.scan, "Enter move column [1 - 3]", 1, 3);
    }
}
