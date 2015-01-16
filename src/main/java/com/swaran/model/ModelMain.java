package com.swaran.model;

import java.util.*;

/**
 * Created by Home on 12/01/2015.
 */
public class ModelMain {

    public static void main(String[] args){

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("One");
        stringArrayList.add("Two");
        ArrayList<String> stringArrayListO = new ArrayList<String>();
        stringArrayListO.add("One");
        stringArrayListO.add("Two");
        TestMap testMapF = new TestMap("First",stringArrayList);
        TestMap testMapS = new TestMap("Second",stringArrayListO);

        ArrayList<TestMap> testMapArrayList = new ArrayList<TestMap>();
        testMapArrayList.add(testMapF);
        testMapArrayList.add(testMapS);

        TestMap testMapF1 = new TestMap("First",stringArrayList);
        for(TestMap testMap:testMapArrayList) {
            if (testMap.equals(testMapF1)) {
                TestMap testMapM = testMapArrayList.get(testMapArrayList.indexOf(testMapF1));
                String domainName = testMapM.getDomainName();
                ArrayList<String> fileNameL = testMapM.getFileNames();
                fileNameL.add("Third");
                testMapArrayList.set(testMapArrayList.indexOf(testMapF1), new TestMap(domainName, fileNameL));
                System.out.println(testMapArrayList.indexOf(testMapF1));
            }
        }

       for(TestMap testMap:testMapArrayList){

           System.out.println(testMap.getDomainName()+testMap.getFileNames().size());
       }



    }
}
