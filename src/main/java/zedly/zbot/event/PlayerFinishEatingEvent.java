/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event;

import zedly.zbot.entity.Player;

/**
 *
 * @author Dennis
 */
public class PlayerFinishEatingEvent extends Event {
    
    private final int entityId;
    private final Player player;
    
    public PlayerFinishEatingEvent(Player player, int entityId) {
        this.player = player;
        this.entityId = entityId;
    }

    /**
     * @return the entityId
     */
    public int getEntityId() {
        return entityId;
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }
    
}
