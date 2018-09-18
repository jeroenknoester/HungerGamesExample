package com.capgemini.examples.Controllers.ControllerTests;

import com.capgemini.examples.Controllers.ArenaController;
import com.capgemini.examples.Controllers.GameController;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArenaControllerTest {

    private static ArenaController arena;

    @BeforeClass
    public static void Init(){
        GameController game = new GameController();
        arena = game.CreateGame();
    }

    @Test
    public void TestStartingDay(){
        Assert.assertSame(1,arena.getDay());
    }

    @Test
    public void TestAmountOfStartingContestants(){
        Assert.assertSame(24,arena.getAliveContestants().size());
    }
}
