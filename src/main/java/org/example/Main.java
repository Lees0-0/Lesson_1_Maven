package org.example;

import com.google.gson.Gson;

public class Main extends User {
    public static void main(String[] args) {

        FirstName firstName = new FirstName("Dima");
        SecondName secondName = new SecondName("Zabolotnii");

        Gson gson = new Gson();
        System.out.println("JSON ==> " + gson.toJson(firstName));
        System.out.println("JSON ==> " + gson.toJson(secondName));
    }
}