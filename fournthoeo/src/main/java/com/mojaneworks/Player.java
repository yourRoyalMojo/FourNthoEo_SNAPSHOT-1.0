package com.mojaneworks;

public class Player {
    

    private int playerNumber;
    private final int pieceCount = 4;
    private PlayerPiece[] playerPieces = new PlayerPiece[pieceCount];
    private boolean isFinished = false;
    private String playerHome;

    public Player(){

        for (int i = 0; i < this.pieceCount; i++){

            
            this.playerPieces[i] = new PlayerPiece(i + 1);
        }

        
    }

    public void setPlayerNumber(int playerNumber){


        this.playerNumber = playerNumber;
    }

    public void setAsFinished(){

        this.isFinished = true;
    }

    public void setPlayerHome(String playerHome){

        this.playerHome = playerHome;
    }

    public void setDefaultPiecePositions(){

        for (int i = 0; i < this.playerPieces.length; i++) {
            
            playerPieces[i].setPosition(this.playerHome, i + 1);
        }
    }

    public int getPlayerNumber() {
        
        return this.playerNumber;
    }

    public PlayerPiece[] getPlayerPieces(){

        return this.playerPieces;
    }

    public boolean getIsFinished(){

        return this.isFinished;
    }

    public String getPlayerHome(){

        return this.playerHome;
    }
    
}
