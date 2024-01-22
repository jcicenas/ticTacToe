import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class App {
    HashMap<Integer, Character> gameMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        displayMethod();
        App m1 = new App();
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


    public static int getRandomIntNotInMap(HashMap<Integer, Character> map){
        Boolean s = true;
        do{
            int randomNum = 1 + (int)(Math.random() * ((9 - 1) + 1));
            if(map.get(randomNum) == 'X' || map.get(randomNum) == 'O'){
                s = false;
            }else{
                return randomNum;
            }
        }while(s);
        return -1;

    }
    public static void rbtFlow(int randomNum, HashMap<Integer, Character> map){
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(ccounter1);
    }
}
