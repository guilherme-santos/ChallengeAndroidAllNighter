/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.allnighter.challengeandroid;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme
 */
public class Building {
    
    protected static final int DEFAULT_HEIGHT = 12;
    
    protected List<Floor> floors = new ArrayList<>();
    protected Elevator elevator = new Elevator(this);

    public Building(Integer floors) {
        this.floors.add(new Garage(Building.DEFAULT_HEIGHT));
        for(Integer i=0; i < floors; i++){
              this.floors.add(new Floor(Building.DEFAULT_HEIGHT));
        }
    }
    
    public Floor[] getFloors() {
        return this.floors.toArray(new Floor[0]);
    }

    public Elevator getElevator() {
        return elevator;
    }
    
}
