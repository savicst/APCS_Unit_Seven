import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithms {


    public static ArrayList<Integer> fileDuplicates(String file1, String file2) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file1));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        Scanner inPut = new Scanner(new File(file2));
        ArrayList<Integer> lisT = new ArrayList<>();
        while (inPut.hasNext()) {
            lisT.add(inPut.nextInt());
        }
        ArrayList<Integer> allen = new ArrayList<>();
        for (Integer integer : list) {
            if (lisT.contains(integer)) {
               if (!allen.contains(integer)){
                   allen.add(integer);
               }
            }
        }
        return allen;
    }


    public static ArrayList<String> removeDuplicates(String filename)throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextLine());
        }
        ArrayList<String> newList = new ArrayList<>();
        for (String string : list) {
            if (!newList.contains(string)) {
                newList.add(string);
            }
        }
        return newList;
    }


    public static ArrayList<Integer> orderedList()throws FileNotFoundException {
        Scanner input = new Scanner(new File("files/set1.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            int currentNum = input.nextInt();
            while (list.size()==0){
                list.add(currentNum);
            }
            if(!list.contains(currentNum)) {
                for(int i=0 ; i < list.size(); i++){
                    if (currentNum>list.get(i) && currentNum<list.get(i+1)){
                        list.add(i+1,currentNum);
                    }
                }

            }
        }
        return list;
    }



}
