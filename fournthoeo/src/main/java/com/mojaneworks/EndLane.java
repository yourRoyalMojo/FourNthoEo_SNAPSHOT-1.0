package com.mojaneworks;

public class EndLane extends Lane {

    private final int LANELENGTH;
    private Block[] blocks;

    public EndLane(Block[] blocks, int laneLength){

        super(blocks);
        this.LANELENGTH = laneLength;
        for (int i = 0; i < this.LANELENGTH; i++){

            if (i == 3){

                blocks[i] = new Block(i + 7);
                blocks[i].setAsSafe();
            }
            else{

                blocks[i] = new Block(i + 7);
            }
        }

        this.blocks = blocks;
    }

    public Block[] getBlocks(){

        return this.blocks;
    }
    
}
