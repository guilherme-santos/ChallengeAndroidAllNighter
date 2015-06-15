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
public class Main {

    protected static final int NUM_OF_FLOOR = 10;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building building = new Building(Main.NUM_OF_FLOOR);
        Elevator elevator = building.getElevator();
        
        elevator.goTo(1);
        elevator.goTo(Main.NUM_OF_FLOOR);
        elevator.goTo(0);
        
        return;
    }
    
}
