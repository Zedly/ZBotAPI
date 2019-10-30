/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.entity;

import zedly.zbot.Location;

/**
 *
 * @author Dennis
 */
public interface Turtle extends Animal {

    Location getHomeLocation();

    boolean hasEgg();

    boolean isLayingEgg();

    Location getTravelLocation();

    boolean isGoingHome();

    boolean isTravelling();

}
