package com.swaran.recommender;

import org.apache.mahout.cf.taste.impl.model.BooleanUserPreferenceArray;
import org.apache.mahout.cf.taste.impl.model.GenericBooleanPrefDataModel;
import org.apache.mahout.cf.taste.impl.model.PlusAnonymousUserDataModel;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericBooleanPrefUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.LogLikelihoodSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.File;
import java.util.List;

/**
 * Created by swara on 08/01/2017.
 */
public class GuestUserRecommendation {

    public static void main(String[] args) throws Exception {
        DataModel model =
                new FileDataModel(new File("C:\\Users\\swara\\IdeaProjects\\StFormPost\\src\\main\\resources\\noRating.csv"));
        PlusAnonymousUserDataModel plusAnonymousModel = new PlusAnonymousUserDataModel(model);

        UserSimilarity similarity = new LogLikelihoodSimilarity(plusAnonymousModel);
        UserNeighborhood neighborhood =
                new ThresholdUserNeighborhood(
                        0.1, similarity, model);
        //new ThresholdUserNeighborhood(Float.parseFloat(args[1]), similarity, model);


        System.out.println("");


        Recommender recommender = new GenericBooleanPrefUserBasedRecommender(plusAnonymousModel,
                neighborhood, similarity);


        PreferenceArray anonymousPrefs =
                new BooleanUserPreferenceArray(3);
        anonymousPrefs.setUserID(0,
                PlusAnonymousUserDataModel.TEMP_USER_ID);
        anonymousPrefs.setItemID(0, 16L);
        anonymousPrefs.setItemID(1, 17L);
        anonymousPrefs.setItemID(2, 18L);
        synchronized (anonymousPrefs) {
            plusAnonymousModel.setTempPrefs(anonymousPrefs);
            List<RecommendedItem> recommendations1 = recommender.recommend(PlusAnonymousUserDataModel.TEMP_USER_ID, 20);
            plusAnonymousModel.clearTempPrefs();

            System.out.println("Recm for anonymous:");

            for (RecommendedItem recommendation : recommendations1) {
                System.out.println(recommendation);
            }
            System.out.println("");
        }


        List<RecommendedItem> recommendations = recommender.recommend(
                3, 20);

        System.out.println("Recomedation for user_id="
                + 3 + ":");

        for (RecommendedItem recommendation : recommendations) {
            System.out.println(recommendation);
        }
        System.out.println("");
    }
}
