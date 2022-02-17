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
        for (String s : wordList) {
            if (s.indexOf(pattern) >= 0) {
                matches.add(s);
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
            String temp = unsorted.get(j);
            unsorted.set(j, unsorted.get(minIndex));
            unsorted.set(minIndex, temp);

        }
    }
    public ArrayList<String> cheatScrabble(String tiles) {

        ArrayList<String> theWords = new ArrayList<String>();

        for (String s: wordList) {
            boolean canMakeWord = true;
            ArrayList<Character> letters = new ArrayList<Character>();
            for (int j = 0; j < tiles.length(); j++) {
                letters.add(tiles.charAt(j));
            }
            for (int k=0; k<s.length(); k++){
                if (letters.contains(s.charAt(k))){
                    letters.remove(letters.indexOf(s.charAt(k)));
                }
                else{
                    canMakeWord = false;
                    break;
                }
            }
            if(canMakeWord){
                theWords.add(s);
            }
        }
        return theWords;
    }
    //4
    public int getScores(String word){
        int[] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        int wordScore = 0;
        for(int i= 0; i<word.length(); i++){
            int value = scores[word.charAt(i) - 'a'];
            wordScore += value;
        }
        return wordScore;
    }
    public void sortByScores(ArrayList<String> list){
         for( int j=1; j<list.size();j++){
             int temp = getScores(list.get(j));
             int possibleIndex = j;
             while ( possibleIndex>0 && temp > getScores(list.get(possibleIndex - 1))){
                 list.set(possibleIndex, list.get(possibleIndex-1));
                 possibleIndex--;
             }
             list.set(possibleIndex,list.get(j));
         }
    }
}


