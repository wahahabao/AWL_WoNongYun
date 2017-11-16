package com.example.luanqibazao;

/**
 * Created by AWL on 2017/11/10.
 */

public class main {
    public static void main(String agrs[]){
        Animal a = new Animal();
        Bird b = new Bird();
        Animal ab = new Bird();

        a.eat();
        b.eat();
        b.eat("apple");
        ab.eat();

    }
}
