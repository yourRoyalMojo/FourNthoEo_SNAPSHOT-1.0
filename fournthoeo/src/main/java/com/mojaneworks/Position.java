package com.mojaneworks;

public class Position {

    private String marker;
    private int blockNumber;


    public Position(String marker, int blockNumber){

        this.marker = marker;
        this.blockNumber = blockNumber;
    }

    public String getPosition(){

        return this.marker + this.blockNumber;
    }

    
}
