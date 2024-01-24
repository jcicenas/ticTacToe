import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class App {
    HashMap<Integer, Character> gameMap = new HashMap<>();
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        displayMethod();
        App m1 = new App();
        rbtFlow(0, null);
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
        boolean sentinel = false;
        HashMap<Integer, Boolean> map = new HashMap<>();
        boolean s1 = gameChecker(1, 3, 1, map);
        boolean s2 = gameChecker(4, 6, 1, map);
        boolean s3 = gameChecker(7, 9, 1, map);

        boolean s4 = gameChecker(1, 7, 3, map);
        boolean s5 = gameChecker(2, 8, 3, map);
        boolean s6 = gameChecker(3, 9, 3, map);
        
        boolean s7 = gameChecker(3, 7, 2, map);
        boolean s8 = gameChecker(1, 9, 4, map);
        for (int i = 0; i < 8; i++) {
            
        }
        
    }

    public static boolean gameChecker(int min, int max, int interval, HashMap<Integer, Character> map){
        int counter = 0;
        for (int i = min; i <= max; i = i + interval) {
            if (map.get(i) == 'O') {
                counter++;
            }
        }
        if (counter == 2) {
            for (int i = min; i <= max; i = i + interval) {
                if (map.get(i) == '-') {
                    return map.replace(i,'-', 'X');
                }
            }
        }
        return false;

    }
}
