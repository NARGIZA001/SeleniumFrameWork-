package com.techtorial.UTILS;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String getProperties(String key)throws IOException{


        File credsFile =new File("src/test/Resources/credentials.properties");

        FileReader filereader=new FileReader(credsFile);

        Properties properties =new Properties();

        properties.load(filereader);

        String value=properties.getProperty("key");

        return value;
    }

}
