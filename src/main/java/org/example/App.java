package org.example;

import com.google.gson.Gson;


public class App 
{
    public static void main( String[] args )
    {
        Person person = (new Person("Yaroslav", "Starenkyi"));
        String toJson = new Gson().toJson(person);
        System.out.println(toJson);

    }
}
