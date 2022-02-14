import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {

    //1-1.1
    private ArrayList<String> wordList = new ArrayList<>();
    //1-1.2
    public ScrabbleHelper() throws FileNotFoundException {
        Scanner input = new Scanner(new File("files/enable.txt"));
        while (input.hasNext()){
            wordList.add(input.next());
        }
    }
    //1-1.3
    public ArrayList<String> getWordList() {
        return wordList;
    }
    //1-2
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
    //2-1 and 2-2
    public ArrayList<String> findMatches(String pattern){
        ArrayList<String> matches = new ArrayList<String>();
         for (int i=0;i<wordList.size(); i++){
             if (wordList.get(i).indexOf(pattern) >=0){
                 matches.add(wordList.get(i));
             }
         }
         return matches;
    }
    //2-4
    public void sortWords(ArrayList<String> unsorted){
        for( int j=0; j<unsorted.size()-1;j++){
            int minIndex = j;
            for (int k = j+1; k<unsorted.size();k++){
                if(unsorted.get(k).length()< unsorted.get(minIndex).length()){
                    minIndex = k;
                }
            }
            int temp =
        }
    }
}

