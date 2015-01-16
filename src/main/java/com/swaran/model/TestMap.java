package com.swaran.model;

import java.util.ArrayList;

/**
 * Created by Home on 13/01/2015.
 */
public class TestMap {

    private String domainName;
    private ArrayList<String> fileNames;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ArrayList<String> getFileNames() {
        return fileNames;
    }

    public void setFileNames(ArrayList<String> fileNames) {
        this.fileNames = fileNames;
    }

    public TestMap(String domainName, ArrayList<String> fileNames) {
        this.domainName = domainName;
        this.fileNames = fileNames;
    }

    public TestMap() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestMap)) return false;

        TestMap testMap = (TestMap) o;

        if (!domainName.equals(testMap.domainName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return domainName.hashCode();
    }
}
