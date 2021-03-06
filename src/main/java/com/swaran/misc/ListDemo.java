package com.swaran.misc;

/**
 * Created by Home on 16/01/2015.
 */
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.ParameterNameAware;
import com.swaran.model.ValuePair;

public class ListDemo extends ActionSupport implements ModelDriven<List<ValuePair>>, Preparable,ParameterNameAware {


    private List<ValuePair> values;


    public List<ValuePair> getModel() {

        return values;

    }

    public String execute() {

        for (ValuePair value : values) {
            System.out.println(value.getValue1() + ":" + value.getValue2() +":" + value.getValue3());
        }

        return SUCCESS;
    }


    public void prepare() {
        values = new ArrayList<ValuePair>();
        values.add(new ValuePair("chalk", "cheese","C"));
        values.add(new ValuePair("orange", "apple","D"));
    }

    public boolean acceptableParameterName(String parameterName) {
        return true;
    }
}

