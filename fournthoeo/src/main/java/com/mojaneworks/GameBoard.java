package com.mojaneworks;

public class GameBoard {
    
    private int numberOfPlayers;
    private int laneLength = 6;
    private int laneCount = 3;
    private int zoneCount = 4;
    private String zoneString = "RYGB";
    private int slotCount = 4;
    private int playerPieceCount = 4;
    private Zone[] boardZones;
    private Player[] players;

        

    public GameBoard(int numberOfPlayers){

        Block[] homeblocks = new Block[laneLength];
        Block[] endblocks = new Block[laneLength];
        Block[] finishblocks = new Block[laneLength];
        Lane[] boardLanes = new Lane[laneCount];
        HomeSlot[] homeSlots = new HomeSlot[slotCount];
        PlayerPiece[] playerPieces = new PlayerPiece[playerPieceCount];
        this.boardZones = new Zone[zoneCount];
        
        
        for (int i = 0; i < this.zoneCount; i++){

            String[] zoneMarker = zoneString.split("");
            
            this.boardZones[i] = new Zone(boardLanes, homeblocks, endblocks, finishblocks, laneLength, homeSlots, slotCount);
            this.boardZones[i].setZoneMarker(zoneMarker[i]);   
        }
        
        this.numberOfPlayers = numberOfPlayers;
        addPlayersToBoard(playerPieces);
    }
    
    public void addPlayersToBoard(PlayerPiece[] playerPieces){

        this.players = new Player[this.numberOfPlayers];

        for (int i = 0; i < this.numberOfPlayers; i++){

            // int homeSlotNumber = this.boardZones[i].getHome().getHomeSlots()[i].getSlotNumber();
            this.players[i] = new Player();
            this.players[i].setPlayerHome(this.boardZones[i].getHome().getHomeMarker());
            this.players[i].setDefaultPiecePositions();
            this.players[i].setPlayerNumber(i + 1);
            this.boardZones[i].setPlayer(this.players[i]);
        }
    }

    public int getPlayerCount(){

        return this.numberOfPlayers;
    }

    public Zone[] getZones(){

        return this.boardZones;
    }

    public Player[] getPlayers(){

        return this.players;
    }
}
