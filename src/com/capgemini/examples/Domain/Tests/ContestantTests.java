package com.capgemini.examples.Domain.Tests;

import com.capgemini.examples.Domain.CareerContestant;
import com.capgemini.examples.Domain.DistrictContestant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ContestantTests {
    @Test
    public void CareerStartingHealthTest(){
        CareerContestant contestant = new CareerContestant();

        assertSame(100, contestant.getHealth());
    }

    @Test
    public void DistrictStartingHealthTest(){
        DistrictContestant contestant = new DistrictContestant();

        assertSame(120, contestant.getHealth());
    }

}
