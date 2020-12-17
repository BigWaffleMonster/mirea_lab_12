package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String city = in.nextLine();
        StringBuffer newLine = new StringBuffer();
        StringBuffer line = new StringBuffer(city);
        ArrayList<String> arr = new ArrayList<String>();

        int index1 = 0;
        int index2 = line.indexOf(" ");
        int index3 = line.lastIndexOf(" ");

        boolean flag = false;
        int k = 0;

        String t = line.substring(index1, index2);
        arr.add(k, t);

        while (index2 != index3){
            index1 = index2;
            index2 = line.indexOf(" ", index2+1);
            k++;
            t = line.substring(index1+1, index2);
            arr.add(k, t);
        }
        index1 = index2;
        index2 = city.length();
        t = line.substring(index1+1, index2);
        arr.add(k++, t);

        ArrayList<Boolean> arr2 = new ArrayList<Boolean>();
        for (int i = 0; i <= k; i++)
            arr2.add(i, true);

        String cont = arr.get(0);
        int indexOfLastLater = cont.length();
        char lastLater = cont.charAt(indexOfLastLater-1);

        arr.set(0, "");
        arr2.set(0, false);
        StringBuffer finalLine = new StringBuffer(cont);

        for (int i = 1; i < k+1; i++){
            for(int j = 1; j < k+1; j++) {
                String nameOfCity = arr.get(j);
                char firstLater = nameOfCity.charAt(0);
                if ((lastLater == firstLater) && (arr2.get(j) == true)) {
                    finalLine.append(" ");
                    finalLine.append(nameOfCity);
                    arr2.set(j, false);
                    indexOfLastLater = nameOfCity.length();
                    lastLater = nameOfCity.charAt(indexOfLastLater-1);
                }
            }
        }
        System.out.println(finalLine.toString());
    }
}