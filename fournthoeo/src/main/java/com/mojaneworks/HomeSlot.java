package com.mojaneworks;

import java.util.ArrayList;

public class HomeSlot {

    private boolean isOccupied;
    private int slotNumber;
    private ArrayList<PlayerPiece> occupyingPiece = new ArrayList<>();

    public HomeSlot(int slotNumber){

        this.slotNumber = slotNumber;
    }
    public void setOccupation(){

        this.occupyingPiece.remove(occupyingPiece.getFirst());
        this.isOccupied = false;
    }

    public boolean getOccupation(){

        return this.isOccupied;
    }

    public int getSlotNumber(){

        return this.slotNumber;
    }


    public void mapPieceToHomeSlot(PlayerPiece pieceToMap) {

        this.occupyingPiece.add(pieceToMap);
        this.isOccupied = true;
    }

    public ArrayList<PlayerPiece> getHomeSlotPiece() {

        return this.occupyingPiece;
    }
}
