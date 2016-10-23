package com.codermonkeyjs.rest;
import static spark.Spark.*;

/**
 * Created by Pheonix on 10/22/2016.
 */
public class Main {
    public static void main (String[] args){
        get("/hello",(req, res) -> "Hello World");
    }
}
