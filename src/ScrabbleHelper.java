import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {

    //1.1
    private ArrayList<String> wordList = new ArrayList<>();
    //1.2
    public ScrabbleHelper() throws FileNotFoundException {
        Scanner input = new Scanner(new File("files/enable.txt"));
        while (input.hasNext()){
            wordList.add(input.next());
        }
    }
    //1.3
    public ArrayList<String> getWordList() {
        return wordList;
    }
    //2
    public boolean foundWord(String word){
        int min = 0;
        int max = wordList.size() - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (wordList.get(mid).compareTo(word) == 0) {
                return true;
            } else if (wordList.get(mid).compareTo(word) > 0) {
                max = mid - 1;
            } else
                min = mid + 1;
        }
        return false;

    }
}

