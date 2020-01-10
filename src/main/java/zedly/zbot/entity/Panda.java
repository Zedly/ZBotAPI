/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.entity;

/**
 *
 * @author Dennis
 */
public interface Panda extends Animal {
    
    int getBreedTimer();
    
    int getSneezeTimer();
    
    int getEatingTimer();
    
    int getMainGeneId();
    
    int getHiddenGeneId();
    
    boolean isSneezing();
    
    boolean isEating();
    
    
}
