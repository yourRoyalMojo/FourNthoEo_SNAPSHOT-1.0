package com.mojaneworks;

public class Main {
    public static void main(String[] args) {
        
        int numberOfPlayers = 4;
        GameBoard newGameBoard = new GameBoard(numberOfPlayers);
        Player player = newGameBoard.getPlayers()[0];
        Zone newZone = newGameBoard.getZones()[0];
        String currentZone = newZone.getZoneMarker();
        Move newMove = new Move(player, currentZone);
        PlayerPiece newPiece = player.getPlayerPieces()[0];
        newPiece.setPosition(currentZone, newZone.getLanes()[0].getBlocks()[0].getBlockNumber());
        newMove.movePiece(newPiece.getPieceNumber());
        System.out.println("Four ntho eo!");
    }
}