package it.intersistemi.corsojava.webinterface;

import it.intersistemi.corsojava.consoleinput.ConsoleInputInt;
import it.intersistemi.corsojava.consoleinput.ConsoleInputString;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VerifyString{

    public static void main(String[] args) throws IOException {
        List<String> stringList = new ArrayList<String>();
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int numElements = ConsoleInputInt.readInt(console, "How many items do you want your list to have? ");
        for(int index = 0; index < numElements; index++){
            String item = ConsoleInputString.readString(console, "Insert element: ");
            stringList.add(item);
        }
        System.out.println("*********************** Classic Print ************************* ");
        for(String element : stringList){
            if(StringUtils.isAlpha(element)){
                System.out.println("Your string: " + element + " not contains numeric value ");
            }else{
                System.out.println("Your string: " + element + " contain numeric value ");
            }
        }
        System.out.println("\n ******************** Lambda Print *********************** ");
        stringList.forEach(a -> System.out.println(a + " : " + StringUtils.isAlpha(a)));
    }
}
