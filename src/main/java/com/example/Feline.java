package com.example;
import java.util.List;

public class Feline {

    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    public List<String> getFood(String animalKind) throws Exception {
        if (animalKind.equals("Хищник")) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}