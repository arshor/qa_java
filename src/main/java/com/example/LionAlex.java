package com.example;

import java.util.List;

public class LionAlex extends Lion {

    private List<String> lionAlexFriends = List.of("Марти", "Глория", "Мелман");

    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return lionAlexFriends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }
}
