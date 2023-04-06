package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    List<String> expectedLionAlexFriends = List.of("Марти", "Глория", "Мелман");
    LionAlex lionAlex;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void getKittensTest(){
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void getPlaceOfLivingTest(){
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getFriendsTest(){
        assertEquals(expectedLionAlexFriends, lionAlex.getFriends());
    }
}
