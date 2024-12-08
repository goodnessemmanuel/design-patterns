package com.designpattern.creational.factory.demo;

import java.util.HashMap;
import java.util.Map;

import static com.designpattern.creational.factory.demo.WebsiteType.BLOG;
import static com.designpattern.creational.factory.demo.WebsiteType.SHOP;

/**
 * WebsiteFactory - this is the interface that will
 * be exposed to the client for the creation of various
 * website types depending on their needs and the parameters
 * passed.
 * NB: the client knows next to nothing about how the various
 * website types will be created and returned to them.
 * this factory manages the instantiation and lifecycle
 * of all possible website types
 */
public class WebsiteFactory {
    private static final Map<WebsiteType, Website> mapOfWebsites = Map.of(
            SHOP, new Shop(),
            BLOG, new Blog()
    );

    public static Website getWebsite(WebsiteType type){
        Website website = null;
        try {
            website = mapOfWebsites.get(type);
        } catch (Exception ex){
            System.out.println("Not supported website type");
        }
        return website;
    }
}
