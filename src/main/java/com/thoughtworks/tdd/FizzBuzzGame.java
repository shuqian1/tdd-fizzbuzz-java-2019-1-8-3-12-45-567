package com.thoughtworks.tdd;

import java.util.ArrayList;

/**
 * Created by QinShuqian on 2019/4/3.
 */
public class FizzBuzzGame {

    public boolean checkFizz(int num){
        if(num % 3 == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean checkBuzz(int num){
        if(num % 5 == 0){
            return true;
        }else {
            return false;
        }
    }

    public boolean checkWhizz(int num){
        if(num % 7 == 0){
            return true;
        }else {
            return false;
        }
    }

    public String fizzBuzz(int num){
        String s = "";
        if(checkFizz(num) || checkBuzz(num) || checkWhizz(num)){
            if(checkFizz(num)){
                s += "Fizz";
            }
            if(checkBuzz(num)){
                s += "Buzz";
            }
            if(checkWhizz(num)){
                s += "Whizz";
            }
            return s;
        }else {
            return String.valueOf(num);
        }
    }

    public static void main(String[] args){
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        for( int i = 0; i < 120; i++) {
            String result = fizzBuzzGame.fizzBuzz(i+1);
            System.out.println(result);
        }
    }

}
