package com.techtorial.FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {

            File credsFile =new File("src/test/Resources/credentials.properties");

            FileReader filereader=new FileReader(credsFile);


            Properties properties =new Properties(); // properties extends hashtable

        properties.load(filereader);

        String login=properties.getProperty("login");

        System.out.println("my login from properties file is : "+ login);

        String url=properties.getProperty("url");

        System.out.println("my login from properties file is : "+ url);

        String password=properties.getProperty("password");

        System.out.println("my login from properties file is : "+ password);

        System.out.println(properties.stringPropertyNames());

    }

    public  static String getProperties(String key)throws IOException{

        File credsFile =new File("src/test/Resources/credentials.properties");

        FileReader filereader=new FileReader(credsFile);

        Properties properties =new Properties();

        properties.load(filereader);

        String login=properties.getProperty("login");

        return login;
    }
}
