import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class ScrabbleDriver {
    //1-1.4
    public static void main (String[] args) throws FileNotFoundException {
        ScrabbleHelper matthias = new ScrabbleHelper();
//        System.out.println(matthias.getWordList().get(66349));
//    //1-3
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a word to test: ");
//        while(true){
//            String input= scan.nextLine();
//            if (input.equals("")){
//            break;}
//            if (matthias.foundWord(input)){
//                System.out.println("\"" + input + "\"" + " is a word");
//            }
//            else{
//                System.out.println("\"" + input + "\"" + " is not a word");
//            }
//            System.out.println("Enter a word to test: ");
//        }
//        System.out.println("Good-Bye!");
//        //2-3
//        ArrayList<String> matched = matthias.findMatches("for");
//        System.out.println(matched);
//        //2-5
//        matthias.sortWords(matched);
//        System.out.println(matched);
        //3-7
        ArrayList<String> sortedCheat = matthias.cheatScrabble("zequyl");
        System.out.println(sortedCheat);
        //4-2
        //System.out.println(matthias.getScores("bird"));
        //System.out.println(matthias.getScores("quiz"));
        //4-4
        matthias.sortByScores(sortedCheat);
        System.out.println(sortedCheat);
    }


}
