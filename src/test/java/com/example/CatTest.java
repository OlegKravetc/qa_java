package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat();

        String sound = cat.getSound();

        assertEquals("Мяу", sound);
    }

    @Test
    public void getFoodReturnsFood() throws Exception {
        Cat cat = new Cat();

        List<String> food = cat.getFood();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}
