package com.example;

import java.util.List;

public class Lion {

    private Feline feline;
    private String sex;

    public Lion(String sex, Feline feline) throws Exception {
        if (sex.equals("Самец") || sex.equals("Самка")) {
            this.sex = sex;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    public String getGender() {
        return sex;
    }
}
