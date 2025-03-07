package com.mojaneworks;

public class Zone {


    private Lane[] boardLanes;
    private Home zoneHome;
    private String zoneMarker;
    private Player zonePlayer;
    

    public Zone(Lane[] boardLanes, Block[] homeBlocks, Block[] endBlocks, Block[] finishBlocks, int laneLength, HomeSlot[] homeSlots, int numberOfSlots){

        this.zoneHome = new Home(homeSlots, numberOfSlots);
        boardLanes[0] = new HomeLane(homeBlocks, laneLength);
        boardLanes[1] = new EndLane(endBlocks, laneLength);
        boardLanes[2] = new FinishLane(finishBlocks, laneLength);
        this.boardLanes = boardLanes;

    }

    public void setPlayer(Player player){

        this.zonePlayer = player;
    }

    public void setZoneMarker(String zoneMarker){

        this.zoneMarker = zoneMarker;
        this.zoneHome.setHomeMarker(zoneMarker);
    }
    
    public Player getPlayer(){

        return this.zonePlayer;
    }

    public String getZoneMarker(){

        return this.zoneMarker;
    }

    public Lane[] getLanes(){
        
        return this.boardLanes;
    }

    public Home getHome(){

        return this.zoneHome;
    }
    
    
}
