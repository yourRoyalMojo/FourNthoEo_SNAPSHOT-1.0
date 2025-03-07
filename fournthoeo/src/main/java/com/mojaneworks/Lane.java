package com.mojaneworks;

public abstract class Lane{
        
    protected Block[] blocks;

    public Lane(Block[] blocks){

        this.blocks = blocks;
    }

    public Block[] getBlocks(){

        return this.blocks;
    }

}
