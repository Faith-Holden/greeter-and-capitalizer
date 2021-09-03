package java;

import textio.TextIO;

public class Greeter {
    public static void main(String[] args){
        System.out.println("What is your name?");
        String name = TextIO.getlnString();
        System.out.println("Hello "+ name.toUpperCase()+", nice to meet you!");
    }
}
