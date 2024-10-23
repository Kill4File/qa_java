package com.example;

import java.util.List;

public class AlexTheLion extends Lion {

    public AlexTheLion (Feline feline) throws Exception {
        super ("Самец", feline);
    }

    public List <String> getFriends() {
        return List.of("Марти", "Мелман", "Глория");
    }

    public String getHabitat() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}