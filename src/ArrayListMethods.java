import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {


    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(0);
        numList.add(-5);
        numList.add(7);
        numList.add(12);
        numList.add(-1);
        numList.add(2,10);
        numList.set(1,9);
        numList.remove(4);
        return numList;

    }



    public static ArrayList<Double> firstAndLast() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Next number: ");
        ArrayList<Double> matt = new ArrayList<Double>();
        double nextNum= scan.nextDouble();
        while(nextNum != 0) {
            matt.add(nextNum);
            nextNum = scan.nextDouble();
        }
        ArrayList<Double> matthew = new ArrayList<Double>();
        matthew.add((double) matt.size());
        matthew.add(matt.get(0));
        matthew.add(matt.get(matt.size()-1));
        return matthew;
    }



    public static boolean double23(ArrayList<Integer> nums) {
        int countTwo = 0;
        int countThree = 0;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==2){
                countTwo++;
            }
            if(nums.get(i)==3){
                countThree++;
            }
        }
        if(countTwo>=2){
            return true;
        }
        else return (countThree>=2);
    }


    public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
        return ((a.get(0)==b.get(0)) || (a.get(a.size()-1)==b.get(b.size()-1)));
    }


}
