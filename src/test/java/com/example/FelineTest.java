package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatReturnsFood() throws Exception {
        Feline feline = new Feline();

        List<String> food = feline.eatMeat();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
    @Test(expected = Exception.class)
    public void getFoodWithUnknownTypeThrowsException() throws Exception {
        Feline feline = new Feline();

        feline.getFood("Неизвестный");
    }
    @Test
    public void getKittensReturnsDefaultValue() {
        Feline feline = new Feline();

        int result = feline.getKittens();

        assertEquals(1, result);
    }
    @Test
    public void getKittensWithParamReturnsParam() {
        Feline feline = new Feline();

        int result = feline.getKittens(5);

        assertEquals(5, result);
    }
}