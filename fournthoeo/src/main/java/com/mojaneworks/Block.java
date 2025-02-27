package com.mojaneworks;

import java.util.ArrayList;
import java.util.Collection;

public class Block {

    private boolean isSafe = false;
    private boolean isOccupied = false;
    private boolean isOccupiedBySamePlayer = false;
    private int blockNumber;
    private int occupyingPiecesCount;
    ArrayList<PlayerPiece> occupyingPieces = new ArrayList<>();

    public Block(int blockNumber){

        this.blockNumber = blockNumber;
    }

    public void setAsSafe(){
        
        this.isSafe = true;
    }

    public void setAsOccupied(PlayerPiece occupyingPiece){
  
        if (occupyingPieces.isEmpty() || !occupyingPieces.contains(occupyingPiece)){

            occupyingPieces.add(occupyingPiece);
            this.occupyingPiecesCount = occupyingPieces.size();
            this.isOccupied = true;
        }
    }

    public int removeOccupyingPieces(PlayerPiece occupyingPiece) {

        occupyingPieces.remove(occupyingPiece);
        this.occupyingPiecesCount = occupyingPieces.size();
        return occupyingPieces.size();
    }

    public void setAsUnoccupied(PlayerPiece playerPiece) {

        if (removeOccupyingPieces(playerPiece) == 0) {

            this.isOccupied = false;
        }
    }

    public void checkOccupiedBySamePlayer(Player currentPlayer){
        for (PlayerPiece currentPiece : currentPlayer.getPlayerPieces()){
            if (this.occupyingPieces.contains(currentPiece)){

                this.isOccupiedBySamePlayer = true;
            }
        }

    }

    public boolean getSafeStatus(){
        
        return this.isSafe;
    }
 
    public boolean getOccupation(){

        return this.isOccupied;
    }
    
    public boolean getSamePlayerOccupation(){

        return this.isOccupiedBySamePlayer;
    }

    public int getBlockNumber(){

        return this.blockNumber;
    }

    public ArrayList<PlayerPiece> getOccupyingPieces() {

        return this.occupyingPieces;
    }

    public int getOccupyingPiecesCount() {

        return this.occupyingPiecesCount;
    }
}
