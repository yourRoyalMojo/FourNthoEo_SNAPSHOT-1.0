package com.mojaneworks;

public class Home{

    private final int NUMBEROFSLOTS;
    private HomeSlot[] homeSlots;
    private String homeMarker;

    public Home(HomeSlot[] homeSlots, int numberOfSlots){

        this.NUMBEROFSLOTS = numberOfSlots;
        for (int i = 0; i < numberOfSlots; i++){

            homeSlots[i] = new HomeSlot(i);
        }
        
        this.homeSlots = homeSlots;
    }

    public void setHomeMarker(String homeMarker){

        this.homeMarker = "Z" + homeMarker;
    }

    public HomeSlot[] getHomeSlots(){

        return this.homeSlots;
    }

    public int getSlotCount(){

        return this.NUMBEROFSLOTS;
    }

    public String getHomeMarker(){

        return this.homeMarker;
    }
}