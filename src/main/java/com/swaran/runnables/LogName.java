package com.swaran.runnables;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Home on 22/01/2015.
 */
public class LogName {


    public static void main(String[] args){

        System.out.println(fileNameValidator("sbs.out.1"));

    }

    public static boolean fileNameValidator(String fileName){
        String[] nameArray ={"sbs.log.","sbs.out."};
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(nameArray));
        return StringUtils.startsWithAny(fileName,nameArray);
    }
}
