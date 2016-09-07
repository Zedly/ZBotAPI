/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.event.entity;

import zedly.zbot.entity.Player;
import zedly.zbot.event.Event;

/**
 *
 * @author Dennis
 */
public class PlayerSprintEvent extends Event {

    private final Player player;
    private final boolean sprinting;

    public PlayerSprintEvent(Player player, boolean sprinting) {
        this.player = player;
        this.sprinting = sprinting;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isSprinting() {
        return sprinting;
    }
}
