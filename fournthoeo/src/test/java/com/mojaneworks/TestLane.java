package com.mojaneworks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLane {

    private final int laneLength = 6;
    Block[] blocks = new Block[laneLength];

    @Test
    public void testHomeLaneCreation() {

        HomeLane homeLane = new HomeLane(blocks, laneLength);
        assertEquals(6, homeLane.getBlocks().length);
        assertTrue(homeLane.getBlocks()[1].getSafeStatus());

    }

    @Test
    public void testEndLaneCreation() {

        EndLane endLane = new EndLane(blocks, laneLength);
        assertEquals(6, endLane.getBlocks().length);
        assertTrue(endLane.getBlocks()[3].getSafeStatus());
    }

    @Test
    public void testFinishLaneCreation() {

        FinishLane finishLane = new FinishLane(blocks, laneLength);
        assertEquals(6, finishLane.getBlocks().length);
    }
}
