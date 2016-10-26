package com.swaran.recommender;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.common.FastIDSet;
import org.apache.mahout.cf.taste.impl.model.GenericDataModel;
import org.apache.mahout.cf.taste.impl.model.GenericPreference;
import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.impl.recommender.SamplingCandidateItemsStrategy;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.Preference;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.recommender.CandidateItemsStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Home on 10/26/2016.
 */


public class GenericDataExample {

    public static void main(String[] coffee) {


        FastByIDMap<PreferenceArray> userData = new
                FastByIDMap<PreferenceArray>();
        List<Preference> prefsUser1 = new ArrayList<Preference>();
        prefsUser1.add(new GenericPreference(1, 1, 10));
        prefsUser1.add(new GenericPreference(1, 4, 9));

        List<Preference> prefsUser2 = new ArrayList<Preference>();
        prefsUser2.add(new GenericPreference(2, 1, 10));

        List<Preference> prefsUser3 = new ArrayList<Preference>();
        prefsUser3.add(new GenericPreference(3, 1, 10));
        prefsUser3.add(new GenericPreference(3, 2, 8));
        prefsUser3.add(new GenericPreference(3, 3, 5));

        userData.put(1, new GenericUserPreferenceArray(prefsUser1));
        userData.put(2, new GenericUserPreferenceArray(prefsUser2));
        userData.put(3, new GenericUserPreferenceArray(prefsUser3));

        DataModel localDataModel = new GenericDataModel(userData);
        CandidateItemsStrategy strategy = new
                SamplingCandidateItemsStrategy(1, 1);
        FastIDSet candidateItems = null;
        try {
            candidateItems = strategy.getCandidateItems(2, new
                    GenericUserPreferenceArray(prefsUser2), localDataModel);
        } catch (TasteException e) {
            e.printStackTrace();
        }

        for (Long candidateRecommendation : candidateItems) {
            System.out.println("Candidate item: " +
                    candidateRecommendation);
        }
    }

}
