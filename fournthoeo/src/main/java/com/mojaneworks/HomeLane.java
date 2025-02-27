
package com.mojaneworks;

public class HomeLane extends Lane{

    private final int LANELENGTH;
    private Block[] blocks;

    public HomeLane(Block[] blocks, int laneLength){
        
        
        super(blocks);
        this.LANELENGTH = laneLength;
        for(int i = 0; i < this.LANELENGTH; i++){
            if(i == 1){

                blocks[i] = new Block(i + 1);
                blocks[i].setAsSafe();
                
               
            }
            else{
            
                blocks[i] = new Block(i + 1);
            }

            this.blocks = blocks;
        }
        

    }

    public Block[] getBlocks(){

        return this.blocks;
    }

}
