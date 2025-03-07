package com.mojaneworks;

public class FinishLane extends Lane {

    private final int LANELENGTH;
    private Block[] blocks;

    public FinishLane(Block[] blocks, int laneLength){

        super(blocks);
        this.LANELENGTH = laneLength;
        for (int i = 0; i < this.LANELENGTH; i++){

            blocks[i] = new Block(i + 13);
        }

        this.blocks = blocks;

    }

    public Block[] getBlocks(){

        return this.blocks;
    }
     
}
