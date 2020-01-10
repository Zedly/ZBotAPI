/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.entity;

import java.util.UUID;

/**
 *
 * @author Dennis
 */
public interface Fox extends Animal {

    int getTypeId();

    boolean isSitting();

    boolean isCrouching();

    boolean isSleeping();

    UUID getFirstUUID();
    
    UUID getSecondUUID();
    
}
