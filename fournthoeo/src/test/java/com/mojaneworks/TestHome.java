package com.mojaneworks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHome {

    private final int numberOfHomeSlots = 4;
    private HomeSlot[] homeSlots = new HomeSlot[numberOfHomeSlots];
    private Player newPlayer = new Player();
    private Home newHome = new Home(homeSlots, numberOfHomeSlots);

    @Test
    public void testHomeCreation() {

        newHome.setHomeMarker("R");
        assertEquals("ZR", newHome.getHomeMarker());
        assertEquals(newHome.getSlotCount(), this.numberOfHomeSlots);
    }

    @Test
    public void testHomeSlots() {

        for (int i = 0; i < newHome.getSlotCount(); i++){

            assertEquals(i, newHome.getHomeSlots()[i].getSlotNumber());

            newHome.getHomeSlots()[i].mapPieceToHomeSlot(newPlayer.getPlayerPieces()[i]);
            assertTrue(newHome.getHomeSlots()[i].getOccupation());
            assertTrue(newHome.getHomeSlots()[i].getHomeSlotPiece().contains(newPlayer.getPlayerPieces()[i]));
            assertEquals(1, newHome.getHomeSlots()[i].getHomeSlotPiece().size());

            newHome.getHomeSlots()[i].setOccupation();
            assertFalse(newHome.getHomeSlots()[i].getHomeSlotPiece().contains(newPlayer.getPlayerPieces()[i]));
            assertEquals(0, newHome.getHomeSlots()[i].getHomeSlotPiece().size());
        }
    }
}
