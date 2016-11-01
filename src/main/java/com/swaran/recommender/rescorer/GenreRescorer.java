package com.swaran.recommender.rescorer;

import org.apache.mahout.cf.taste.recommender.IDRescorer;

import java.awt.print.Book;

/**
 * Created by Home on 11/1/2016.
 */
public class GenreRescorer implements IDRescorer {

    public double rescore(long id, double originalScore) {
        return 0;
    }

    public boolean isFiltered(long id) {
        return false;
    }
}