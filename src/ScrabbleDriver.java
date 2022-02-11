import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class ScrabbleDriver {
    //1.4
    public static void main (String[] args) throws FileNotFoundException {
        ScrabbleHelper matthias = new ScrabbleHelper();
        System.out.println(matthias.getWordList().get(66349));
    //3
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word to test: ");
        while(true){
            String input= scan.next();
            if (input.equals("")){
            break;}
            if (matthias.foundWord(input)){
                System.out.println("\"");
            }
            System.out.println("Enter a word to test: ");

        }

    }


}
