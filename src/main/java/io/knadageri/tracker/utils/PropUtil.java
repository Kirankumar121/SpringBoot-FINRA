package io.knadageri.tracker.utils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by knadageri on 7/17/17.
 */

public final class PropUtil {

    public static Properties getProps(String filename){
     Properties properties = new Properties();
        try {

            properties.load(ClassLoader.getSystemResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;

    }
}
