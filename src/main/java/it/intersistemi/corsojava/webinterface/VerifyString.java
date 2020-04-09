package it.intersistemi.corsojava.webinterface;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VerifyString{

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        verifyString(stringList);
    }

    public static void verifyString(List<String> stringList){
        stringList.add("aaaaaa");
        stringList.add("bbbbb");
        stringList.add("ccccc");
        stringList.add("ddddd");
        stringList.add("eeeeee");
        stringList.add("ffffff");
        stringList.forEach(a -> System.out.println(a + " : " + StringUtils.isAlpha(a)));
    }
}
