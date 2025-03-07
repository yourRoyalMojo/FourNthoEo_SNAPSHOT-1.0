package com.mojaneworks;

public class Move {
    
    private PlayerPiece[] playerPieces; 
    private int rollResult;
    private String currentZone;

    public Move(Player currentPlayer, String currentZone){
        
        this.playerPieces = currentPlayer.getPlayerPieces();
        this.currentZone = currentZone;
        Dice diceRoll = new Dice(currentPlayer);
        this.rollResult = diceRoll.getDiceRoll();
    }

    public void movePiece(int pieceNumber){

        for (PlayerPiece piece : this.playerPieces){

            if (piece.getPieceNumber() == pieceNumber){

                String[] splitPosition = piece.getPiecePosition().split("");
                int newBlockNumber = Integer.parseInt(splitPosition[1]);
                piece.setPosition(this.currentZone, newBlockNumber + this.rollResult);
            }
        }
    }
    
}
