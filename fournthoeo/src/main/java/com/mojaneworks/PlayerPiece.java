package com.mojaneworks;

public class PlayerPiece {

    private boolean isActive = false;
    private int pieceNumber;
    private Position piecePosition;
    private boolean isFinished = false;

    public PlayerPiece(int pieceNumber){

        this.pieceNumber = pieceNumber;
    }

    public void setActivity(){

        this.isActive = true;
    }

    public void setAsFinished(){

        this.isFinished = true;
    }

    public void setPosition(String zoneMarker, int blockNumber){

        this.piecePosition = new Position(zoneMarker, blockNumber); 
    }

    public boolean getActivity(){

        return this.isActive;
    }

    public int getPieceNumber(){

        return this.pieceNumber;
    }

    public boolean getIsFinished(){

        return this.isFinished;
    }

    public String getPiecePosition(){

        return this.piecePosition.getPosition();
    }
}
