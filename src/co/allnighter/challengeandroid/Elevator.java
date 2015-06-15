/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.allnighter.challengeandroid;

/**
 *
 * @author guilherme
 */
public class Elevator {
 
    protected Building building;
    protected Integer actualFloor;
    
    public Elevator(Building building) {
        this.building = building;
        this.actualFloor = 0;
    }
    
    public void goTo(Integer floor) {
        if (floor == this.actualFloor) {
            return;
        }
        
        System.out.println("Gointo to " + floor + "...");
        if (floor > this.actualFloor) {
            this.up(floor);
        } else {
            this.down(floor);
        }
    }
    
    protected void up(Integer floor) {
        
    }
    
    protected void down(Integer floor) {
        
    }
    
}
