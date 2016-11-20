package com.swaran.recommender;

import org.apache.mahout.cf.taste.impl.model.jdbc.PostgreSQLBooleanPrefJDBCDataModel;
import org.apache.mahout.cf.taste.model.DataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by swara on 20/11/2016.
 */
public class DBBasedRecommender {

    static DataSource postGresDataSource = new DriverManagerDataSource() {
    };

    public static void main(String args[]) {

        DataModel model = new PostgreSQLBooleanPrefJDBCDataModel(postGresDataSource, "", "", "", null);
    }
}
