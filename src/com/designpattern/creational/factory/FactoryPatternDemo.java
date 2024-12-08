package com.designpattern.creational.factory;

import com.designpattern.creational.factory.demo.Website;
import com.designpattern.creational.factory.demo.WebsiteFactory;
import com.designpattern.creational.factory.demo.WebsiteType;

import java.util.Calendar;
import java.util.TimeZone;

public class FactoryPatternDemo {


    public static void main(String[] args) {
//        everydayExample();

        //custom demo
        Website web1 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(web1);

        Website web2 = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(web2);
    }

    /**
     * the Calender factory is an
     * example of static factory pattern.
     * Depending on the type of parameter passed to its getInstance method,
     * it will return various type of concrete calendar implementation
     * e.g GregorianCalendar,
     */
    public static void everydayExample() {

        Calendar calendar = Calendar.getInstance(); // from usage view point, notice that you don't know exactly what type of calendar is been returned by the getInstance
        System.out.println(calendar); //Just to help you know what type of calendar
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+6"));
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
