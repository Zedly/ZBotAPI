/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zbot.entity;

import zedly.zbot.VillagerProfession;

/**
 *
 * @author Dennis
 */
public interface ZombieVillager extends Zombie {

    /**
     * @return the profession of this zombie, if it is a zombie villager.
     */
    VillagerProfession getProfession();

    /**
     * @return whether this zombie is converting.
     */
    boolean isConverting();

}
