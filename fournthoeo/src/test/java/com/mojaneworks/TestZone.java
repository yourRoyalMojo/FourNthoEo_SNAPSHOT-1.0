package com.mojaneworks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestZone {

    private final int laneLength = 6;
    private final int laneCount = 3;
    private final int slotCount = 4;
    private final Lane[] boardLanes = new Lane[laneCount];
    private final Block[] homeBlocks = new Block[laneLength];
    private final Block[] endBlocks = new Block[laneLength];
    private final Block[] finishBlocks = new Block[laneLength];
    private final HomeSlot[] homeSlots = new HomeSlot[slotCount];

    public void testZoneCreation() {

        Zone newZone = new Zone(boardLanes, homeBlocks, endBlocks, finishBlocks,laneLength, homeSlots, slotCount);
    }

}
