/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.model;

import java.util.ArrayList;

/**
 *
 * @author arthur
 */
public class Snake {
    private ArrayList<Position> positions = new ArrayList<>();
    
    public Snake(Position initialPosition){
        this.positions.add(initialPosition);
    }
}
