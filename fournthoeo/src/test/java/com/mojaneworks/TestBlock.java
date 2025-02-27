package com.mojaneworks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestBlock {

    private final int initInteger = 1;
    private final Block newBlock = new Block(initInteger);
    private final Player firstPlayer = new Player();
    private final Player secondPlayer = new Player();

    @Test
    public void testBlockCreation() {

        assertEquals(newBlock.getBlockNumber(), this.initInteger);
        assertFalse(newBlock.getSafeStatus());
        assertFalse(newBlock.getOccupation());
        assertEquals( 0, newBlock.getOccupyingPieces().size());
    }

    @Test
    public void testBlockOccupation() {


        newBlock.setAsOccupied(this.firstPlayer.getPlayerPieces()[0]);
        assertTrue(newBlock.getOccupyingPieces().contains(this.firstPlayer.getPlayerPieces()[0]));
        assertEquals(newBlock.getOccupyingPieces().size(), newBlock.getOccupyingPiecesCount());

        newBlock.checkOccupiedBySamePlayer(secondPlayer);
        assertFalse(newBlock.getSamePlayerOccupation());

        newBlock.checkOccupiedBySamePlayer(firstPlayer);
        assertTrue(newBlock.getSamePlayerOccupation());

        newBlock.setAsUnoccupied(this.firstPlayer.getPlayerPieces()[0]);
        assertFalse(newBlock.getOccupyingPieces().contains(this.firstPlayer.getPlayerPieces()[0]));
        assertEquals(newBlock.getOccupyingPieces().size(), newBlock.getOccupyingPiecesCount());

    }

}
