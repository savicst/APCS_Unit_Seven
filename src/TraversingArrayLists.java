import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {

    // Please write the two methods for listOfStates in the space below. Uncomment the tests
    // when you are ready to run them.
    public static ArrayList<String> getStates() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of a state or \"Stop\" to quit:");
        String nextString = scan.nextLine();
        ArrayList<String> dongxiao = new ArrayList<String>();
        while(nextString.compareTo("Stop") != 0){
            dongxiao.add(nextString);
            nextString = scan.nextLine();
        }
        return dongxiao;
    }
    public static String createList(ArrayList<String> states){
        String output = new String();
        output += states.get(0);
        for(int i=1; i < states.size(); i++){
            output += " -> " + states.get(i);
        }
        return output;
    }

    public static ArrayList<Integer> largestAndSmallest(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        // Your code should go below here, and above the return statement.
        int largest = list.get(0);
        int smallest = list.get(0);
        int largestIndex = 0;
        int smallestIndex = 0;
        for(int i = 1; i < list.size(); i++) {
            if (list.get(i) > largest) {
                largest = list.get(i);
                largestIndex = i;
            }
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        if (smallestIndex > largestIndex){
            list.remove(smallestIndex);
            list.remove(largestIndex);
        }
        else{
            list.remove(largestIndex);
            list.remove(smallestIndex);
        }
        list.add(0, smallest);
        list.add(largest);
        return list;
    }







}
