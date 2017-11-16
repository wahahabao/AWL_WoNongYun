package com.example.luanqibazao;

/**
 * Created by AWL on 2017/11/10.
 */

public class Bird extends Animal{
    public void eat(){
        System.out.println("Bird is eat!");
    }
    public void eat(String food){
        System.out.println("Bird is eating:"+food);
    }
}
