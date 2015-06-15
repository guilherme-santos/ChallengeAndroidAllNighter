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
public class Garage extends Floor {

    protected static final int ADDITIONAL_HEIGHT = 6;
    
    public Garage(Integer height) {
        super(height + Garage.ADDITIONAL_HEIGHT);
    }

}
