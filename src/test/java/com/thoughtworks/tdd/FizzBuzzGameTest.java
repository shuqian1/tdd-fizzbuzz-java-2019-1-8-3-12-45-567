package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by QinShuqian on 2019/4/3.
 */
public class FizzBuzzGameTest {

    FizzBuzzGame fizzBuzzGame;

    @BeforeEach
    public void setup(){
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    public void should_return_Fizz_when_multiple_of_three(){
        assertEquals("Fizz",fizzBuzzGame.fizzBuzz(6));
    }

    @Test
    public void should_return_Buzz_when_multiple_of_five(){
        assertEquals("Buzz",fizzBuzzGame.fizzBuzz(5));
    }

    @Test
    public void should_return_Whizz_when_multiple_of_seven(){
        assertEquals("Whizz",fizzBuzzGame.fizzBuzz(7));
    }

    @Test
    public void should_return_FizzBuzz_when_multiple_of_three_and_five(){
        assertEquals("FizzBuzz",fizzBuzzGame.fizzBuzz(15));
    }

    @Test
    public void should_return_FizzWhizz_when_multiple_of_three_and_seven(){
        assertEquals("FizzWhizz",fizzBuzzGame.fizzBuzz(21));
    }

    @Test
    public void should_return_BuzzWhizz_when_multiple_of_five_and_seven(){
        assertEquals("BuzzWhizz",fizzBuzzGame.fizzBuzz(35));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_multiple_of_three_and_five_and_seven(){
        assertEquals("FizzBuzzWhizz",fizzBuzzGame.fizzBuzz(105));
    }

    @Test
    public void should_return_input_number_when_not_special_number(){
        assertEquals("2",fizzBuzzGame.fizzBuzz(2));
    }

}
