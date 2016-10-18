package com.swaran.service;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * Created by Home on 3/24/2016.
 */
public class DateTimeCareer {

    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        long moment = dateTime.now().getMillis();
        System.out.println(moment);

        DateTime dt = new DateTime(moment, DateTimeZone.forID("Europe/London"));
        System.out.println(dt);

        DateTime yearAgo = dt.minusYears(1);

        System.out.println(yearAgo);

        System.out.println(dt.isAfter(yearAgo));
    }
}
