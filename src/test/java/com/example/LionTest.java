package com.example;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LionTest {

    @Test
    public void getKittensReturnsValueFromFeline() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);

        int result = lion.getKittens();

        assertEquals(3, result);
    }

    @Test
    public void getFoodReturnsFoodFromFeline() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));

        Lion lion = new Lion("Самка", feline);

        List<String> food = lion.getFood();

        assertEquals(List.of("Мясо"), food);
    }

    @Test
    public void getGenderReturnsSex() throws Exception {
        Feline feline = mock(Feline.class);

        Lion lion = new Lion("Самец", feline);

        String sex = lion.getGender();

        assertEquals("Самец", sex);
    }

    @Test(expected = Exception.class)
    public void constructorWithWrongSexThrowsException() throws Exception {
        Feline feline = mock(Feline.class);

        new Lion("Неизвестно", feline);
    }
}